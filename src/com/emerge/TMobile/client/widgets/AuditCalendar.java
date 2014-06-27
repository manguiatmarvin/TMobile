package com.emerge.TMobile.client.widgets;

import java.util.Date;

import com.emerge.TMobile.client.DataSources.AuditDs;
import com.emerge.TMobile.client.Services.AuditService;
import com.emerge.TMobile.client.Services.AuditServiceAsync;
import com.google.gwt.core.client.GWT;
import com.smartgwt.client.util.SC;
import com.smartgwt.client.widgets.calendar.Calendar;
import com.smartgwt.client.widgets.calendar.CalendarEvent;
import com.smartgwt.client.widgets.calendar.events.DayBodyClickEvent;
import com.smartgwt.client.widgets.calendar.events.DayBodyClickHandler;

public class AuditCalendar extends Calendar{
	private MainWindow editPopup;
	
	public AuditCalendar(){
		
		editPopup = MainWindow.getInstance("Add New Audit",true);
		
	   this.setWidth(500);  
       this.setHeight(220);  
       this.setShowDayView(false);  
       this.setShowWeekView(false);  
       this.setShowOtherDays(false);  
       this.setShowDayHeaders(false);  
       this.setShowDatePickerButton(true);  
       this.setShowAddEventButton(false);  
       this.setDisableWeekends(false);          
       this.setShowDateChooser(false);  
       this.setCanCreateEvents(false); 
       this.setAutoFetchData(true); 
       
       this.addDayBodyClickHandler(new DayBodyClickHandler() {  
           public void onDayBodyClick(DayBodyClickEvent event) {  
               String nameStr = "";  
               CalendarEvent[] events = event.getEvents();  
               Date clickedDate = event.getCalendar().getActiveTime();
               
               if(events.length == 0) {  
                   nameStr = "No events";
                   
               } else {  
                   for (CalendarEvent calEvent : events) {  
                       nameStr += calEvent.getName() + "<br/>";  
                   }  
               }  
               
               if(nameStr.equalsIgnoreCase("No events")){
            	   //pop the add new Audit Window
            	   SC.say(clickedDate.toString());
            	   
               }else{
            	   SC.say(nameStr);  
               }
              
           }  
       }); 
	}
	
	
    @Override  
    public String getDayBodyHTML(Date date, CalendarEvent[] events, Calendar calendar, int rowNum, int colNum) {  
        String returnStr = date.getDate() + "";  
        if(events != null && events.length > 0) {  
            returnStr += imgHTML("icons/16/approved.png", 16, 16, "image", null, null);  
        }  
        return returnStr;  
    } 
}
