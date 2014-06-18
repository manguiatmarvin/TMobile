package com.emerge.TMobile.client.DataSources;

import java.util.List;
import com.emerge.TMobile.client.Models.Audit;
import com.emerge.TMobile.client.Services.AuditService;
import com.emerge.TMobile.client.Services.AuditServiceAsync;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.smartgwt.client.data.DataSource;
import com.smartgwt.client.data.Record;
import com.smartgwt.client.data.fields.DataSourceDateField;
import com.smartgwt.client.data.fields.DataSourceSequenceField;
import com.smartgwt.client.data.fields.DataSourceTextField;
import com.smartgwt.client.util.SC;  

import java.util.Date;  

public class AuditDs extends DataSource{
	private final AuditServiceAsync auditService = GWT
			.create(AuditService.class);
	
	private static AuditDs instance = null;  

    
	public static AuditDs getInstance() {  
	   
		if (instance == null) {  
	        instance = new AuditDs();  
	    }  
	    return instance;  
	}
	
	
	public AuditDs(){
		 super();
		 DataSourceSequenceField eventIdField = new DataSourceSequenceField("eventId");  
	     eventIdField.setPrimaryKey(true);  
	  
	        DataSourceTextField nameField = new DataSourceTextField("name");  
	        DataSourceTextField descField = new DataSourceTextField("description");  
	        DataSourceDateField startDateField = new DataSourceDateField("startDate");  
	        DataSourceDateField endDateField = new DataSourceDateField("endDate");  
	        
	        this.setFields(eventIdField, nameField, descField, startDateField, endDateField);  
	        this.setClientOnly(true);
	        
	        //fill
			auditService.getAllAudits(0, 10, new  AsyncCallback<List<Audit>>(){

				@Override
				public void onFailure(Throwable caught) {
					// TODO Auto-generated method stub
					SC.say("AuditDs: "+caught.getMessage());
				}

				@Override
				public void onSuccess(List<Audit> result) {
					// TODO Auto-generated method stub
					int ctr = 0;
			        Record[] records = new Record[result.size()];
					for(Audit res: result){
						records[ctr] = new Record();
						records[ctr].setAttribute("eventId", res.getId());
						records[ctr].setAttribute("name", res.getTitle());
						records[ctr].setAttribute("description", res.getDesc());
						records[ctr].setAttribute("startDate", res.getStart());
						records[ctr].setAttribute("endDate", res.getEnd());
						AuditDs.this.addData(records[ctr]);
						ctr ++;
					}
				}
			});
	}
}
