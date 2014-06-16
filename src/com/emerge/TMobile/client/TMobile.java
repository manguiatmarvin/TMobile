package com.emerge.TMobile.client;

import java.util.List;

import com.emerge.TMobile.client.Models.Audit;
import com.emerge.TMobile.client.Services.AuditService;
import com.emerge.TMobile.client.Services.AuditServiceAsync;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.History;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.RootPanel;
import com.smartgwt.client.util.SC;
import com.smartgwt.client.widgets.Canvas;
import com.smartgwt.client.widgets.IButton;
import com.smartgwt.client.widgets.Label;
import com.smartgwt.client.widgets.events.ClickEvent;
import com.smartgwt.client.widgets.layout.VLayout;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class TMobile implements EntryPoint {
	
	private final AuditServiceAsync auditService = GWT
			.create(AuditService.class);
	private Label lb;
	private VLayout vl;
	private VLayout main;



	private int offSet = 0;
	private int noOfRecords = 3;



	public void onModuleLoad() {
		
		RootPanel.get("loadingWrapper").clear(true);
        
     	
     	
		
		IButton btn  = new IButton();
		btn.setTitle("Test");
		
		btn.addClickHandler(new com.smartgwt.client.widgets.events.ClickHandler(){

			@Override
			public void onClick(ClickEvent event) {
				// TODO Auto-generated method stub
                refreshGrid();
			}
			
		});
		
		
		vl = new VLayout();
		main = new VLayout();
		main.addMember(btn);
		main.addMember(vl);
		main.draw();
		
//		String initToken = History.getToken();
//		if (initToken.length() == 0) {
//			History.newItem("index");
//		}
//
//		History.addValueChangeHandler(new HistoryListener());
//		History.fireCurrentHistoryState();
	}
	
	
	private Canvas getNextBtn() {

		
		IButton btnNext  = new IButton();
		btnNext.setTitle("Next");
		btnNext.addClickHandler(new com.smartgwt.client.widgets.events.ClickHandler(){

			@Override
			public void onClick(ClickEvent event) {
				// TODO Auto-generated method stub
				TMobile.this.setOffSet(TMobile.this.getOffSet()+ (TMobile.this.getNoOfRecords()));
				TMobile.this.refreshGrid();
			}
			
		});
		
		return btnNext;
	}
	
	
	
	
	
	private Canvas getPrevBtn() {

		
		IButton btnNext  = new IButton();
		btnNext.setTitle("Prev");
		btnNext.addClickHandler(new com.smartgwt.client.widgets.events.ClickHandler(){

			@Override
			public void onClick(ClickEvent event) {
				TMobile.this.setOffSet(TMobile.this.getOffSet() - (TMobile.this.getNoOfRecords()));
				TMobile.this.refreshGrid();
			}
			
		});
		
		return btnNext;
	}
	
	
	
	
	public int getOffSet() {
		return this.offSet;
	}


	public void setOffSet(int offSet) {
		this.offSet = offSet;
	}
	
	
	public int getNoOfRecords() {
		return noOfRecords;
	}


	public void setNoOfRecords(int noOfRecords) {
		this.noOfRecords = noOfRecords;
	}
	
	
	
	private void refreshGrid() {
		// TODO Auto-generated method stub
		int offSet  = TMobile.this.getOffSet();
		if(offSet < 0){
			offSet = 0;
		}
		auditService.getAllAudits(offSet,3, new AsyncCallback<List<Audit>>(){

			@Override
			public void onFailure(Throwable caught) {
				// TODO Auto-generated method stub
				SC.say(caught.getMessage());
			}

			@Override
			public void onSuccess(List<Audit> result) {
				// TODO Auto-generated method stub
				if(vl!=null){
					vl.removeMembers(vl.getMembers());
				}
				if(result.size()>0){
					for(Audit audit: result ){
						
						lb = new Label();
						lb.setContents(audit.getTitle()+" | "+audit.getDesc()+" | "+audit.getStart());
						vl.addMember(lb);
					}
					
				}else{
					lb = new Label();
					lb.setContents("::: No records :::");
					vl.addMember(lb);
				}
				
				vl.addMember(getNextBtn());
				vl.addMember(getPrevBtn());
			}

			
		});
	}

}
