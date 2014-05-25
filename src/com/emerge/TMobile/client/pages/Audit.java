package com.emerge.TMobile.client.pages;

import com.emerge.TMobile.client.widgets.Navigation;
import com.emerge.TMobile.client.widgets.VerticalContainer;
import com.smartgwt.client.types.VerticalAlignment;
import com.smartgwt.client.widgets.Label;
import com.smartgwt.client.widgets.Canvas;
import com.smartgwt.client.types.Alignment;  
import com.smartgwt.client.types.ListGridFieldType;  
import com.smartgwt.client.util.SC;   
import com.smartgwt.client.widgets.IButton;  
import com.smartgwt.client.widgets.ImgButton;  
import com.smartgwt.client.widgets.events.ClickEvent;  
import com.smartgwt.client.widgets.events.ClickHandler;  
import com.smartgwt.client.widgets.grid.ListGrid;  
import com.smartgwt.client.widgets.grid.ListGridField;  
import com.smartgwt.client.widgets.grid.ListGridRecord;  
import com.smartgwt.client.widgets.layout.HLayout;  
import com.emerge.TMobile.client.widgets.CountrySampleData;

public class Audit extends Canvas {
	
	VerticalContainer vc;
	
	public Audit() {
		super();
		this.setWidth100();
		this.setHeight100();
		Label label = new Label("Begin Audit Hub Content here ");
		label.setWidth100();
		label.setHeight100();
		label.setValign(VerticalAlignment.TOP);
        
		vc = new VerticalContainer();
		vc.addMember(new Navigation());	
		vc.addMember(label);
		vc.addMember(this.getRq4Grid());
		this.addChild(vc);
	}
	
	public ListGrid  getRq4Grid(){
	      final ListGrid countryGrid = new ListGrid() {  
	            @Override  
	            protected Canvas createRecordComponent(final ListGridRecord record, Integer colNum) {  
	  
	                String fieldName = this.getFieldName(colNum);  
	  
	                if (fieldName.equals("iconField")) {  
	                    HLayout recordCanvas = new HLayout(3);  
	                    recordCanvas.setHeight(22);  
	                    recordCanvas.setAlign(Alignment.CENTER);  
	                    ImgButton editImg = new ImgButton();  
	                    editImg.setShowDown(false);  
	                    editImg.setShowRollOver(false);  
	                    editImg.setLayoutAlign(Alignment.CENTER);  
	                    editImg.setSrc("silk/comment_edit.png");  
	                    editImg.setPrompt("Edit Comments");  
	                    editImg.setHeight(16);  
	                    editImg.setWidth(16);  
	                    editImg.addClickHandler(new ClickHandler() {  
	                        public void onClick(ClickEvent event) {  
	                            SC.say("Edit Comment Icon Clicked for country : " + record.getAttribute("countryName"));  
	                        }  
	                    });  
	  
	                    ImgButton chartImg = new ImgButton();  
	                    chartImg.setShowDown(false);  
	                    chartImg.setShowRollOver(false);  
	                    chartImg.setAlign(Alignment.CENTER);  
	                    chartImg.setSrc("silk/chart_bar.png");  
	                    chartImg.setPrompt("View Chart");  
	                    chartImg.setHeight(16);  
	                    chartImg.setWidth(16);  
	                    chartImg.addClickHandler(new ClickHandler() {  
	                        public void onClick(ClickEvent event) {  
	                            SC.say("Chart Icon Clicked for country : " + record.getAttribute("countryName"));  
	                        }  
	                    });  
	  
	                    recordCanvas.addMember(editImg);  
	                    recordCanvas.addMember(chartImg);  
	                    return recordCanvas;  
	                } else if (fieldName.equals("buttonField")) {  
	                    IButton button = new IButton();  
	                    button.setHeight(18);  
	                    button.setWidth(65);                      
	                    button.setIcon("flags/16/" + record.getAttribute("countryCode") + ".png");  
	                    button.setTitle("Info");  
	                      
	                    return button;  
	                } else {  
	                    return null;  
	                }  
	  
	            }  
	        };  
	        countryGrid.setShowRecordComponents(true);          
	        countryGrid.setShowRecordComponentsByCell(true);  
	        countryGrid.setCanRemoveRecords(true);  
	  
	        countryGrid.setWidth(550);  
	        countryGrid.setHeight(224);  
	        countryGrid.setShowAllRecords(true);  
	  
	        ListGridField countryCodeField = new ListGridField("countryCode", "Flag", 40);  
	        countryCodeField.setAlign(Alignment.CENTER);  
	        countryCodeField.setType(ListGridFieldType.IMAGE);  
	        countryCodeField.setImageURLPrefix("flags/16/");  
	        countryCodeField.setImageURLSuffix(".png");  
	  
	        ListGridField nameField = new ListGridField("countryName", "Country");  
	        ListGridField capitalField = new ListGridField("capital", "Capital");  
	        ListGridField continentField = new ListGridField("continent", "Continent");  
	  
	        ListGridField buttonField = new ListGridField("buttonField", "Info");  
	        buttonField.setAlign(Alignment.CENTER);  
	          
	        ListGridField iconField = new ListGridField("iconField", "Comments/Stats");  
	        iconField.setWidth(100);  
	  
	        countryGrid.setFields(countryCodeField, nameField, capitalField, continentField, buttonField, iconField);  
	        countryGrid.setCanResizeFields(true);  
	        countryGrid.setData(CountrySampleData.getRecords());  
	  
	        return  countryGrid;
	    }  
	}

