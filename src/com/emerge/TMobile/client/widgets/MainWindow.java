package com.emerge.TMobile.client.widgets;

import com.smartgwt.client.widgets.Window;

public class MainWindow extends Window{
	
  public MainWindow(String title){
    super();
    this.setWidth100();
    this.setHeight100();
    this.setCanDragReposition(false);  
    this.setCanDragResize(false);
    this.setTitle(title);       
  }
  
  public void hideControls(){
	 this.setShowMaximizeButton(false);
	 this.setShowMinimizeButton(false);
	 this.setShowCloseButton(false);
  }
  
  public void setContent(){
	  
  }
  
 

}
