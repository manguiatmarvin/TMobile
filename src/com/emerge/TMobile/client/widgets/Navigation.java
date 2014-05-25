package com.emerge.TMobile.client.widgets;
import com.google.gwt.user.client.History;
import com.smartgwt.client.types.Alignment;  
import com.smartgwt.client.widgets.IconButton;  
import com.smartgwt.client.widgets.events.ClickEvent; 
import com.smartgwt.client.widgets.toolbar.RibbonBar;  
import com.smartgwt.client.widgets.toolbar.RibbonGroup;

public class Navigation extends RibbonBar {
	
	public Navigation() {
		super();
		this.setWidth100();
		this.setMembersMargin(2);
		this.setLayoutMargin(2);
		this.addMember(getMenuGroup());

	}

	public RibbonGroup getMenuGroup() {
		RibbonGroup fileGroup = new RibbonGroup();
		fileGroup.setShowTitle(false);
		fileGroup.setTitleAlign(Alignment.LEFT);
		fileGroup.addControl(getIconButton("Home", "index", false));
		fileGroup.addControl(getIconButton("Audit", "audit", false));
		fileGroup.addControl(getIconButton("Reporting", "reporting", false));
		fileGroup.addControl(getIconButton("Communication", "communication", false));
		fileGroup.setWidth100();
		
		return fileGroup;
	}
	
	
    private IconButton getIconButton(String title, String iconName, boolean vertical) {  
        IconButton button = new IconButton(title);  
        button.setTitle(title);  
        if (iconName == null){
        	iconName = "cube_blue"; 
        }else if(iconName.equalsIgnoreCase("audit")){
        	
        	button.setIcon("pieces/16/" + iconName + ".png");
        	
        	 button.addClickHandler(new com.smartgwt.client.widgets.events.ClickHandler(){

   				@Override
   				public void onClick(ClickEvent event) {
   					// TODO Auto-generated method stub
   					History.newItem("audit");
   				}
               	
               });
        	 
        }else if(iconName.equalsIgnoreCase("reporting")){
        	button.setIcon("pieces/16/" + iconName + ".png");
        	
        	  button.addClickHandler(new com.smartgwt.client.widgets.events.ClickHandler(){

  				@Override
  				public void onClick(ClickEvent event) {
  					// TODO Auto-generated method stub
  					History.newItem("reporting");
  				}
              	
              });
        	  
        }else if(iconName.equalsIgnoreCase("communication")){
            button.setIcon("pieces/16/" + iconName + ".png"); 
            
            button.addClickHandler(new com.smartgwt.client.widgets.events.ClickHandler(){

				@Override
				public void onClick(ClickEvent event) {
					// TODO Auto-generated method stub
					History.newItem("communication");
				}
            	
            });
            
        }else if(iconName.equalsIgnoreCase("index")){
            button.setIcon("pieces/16/" + iconName + ".png"); 
            button.addClickHandler(new com.smartgwt.client.widgets.events.ClickHandler(){

				@Override
				public void onClick(ClickEvent event) {
					// TODO Auto-generated method stub
					History.newItem("index");
				}
            	
            });
        }
       
        if (vertical == true) button.setOrientation("vertical");  
        return button;  
    } 
}
