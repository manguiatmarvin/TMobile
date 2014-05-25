package com.emerge.TMobile.client.widgets;

import com.smartgwt.client.widgets.Canvas;
import com.smartgwt.client.widgets.Window;


public class MainWindow extends Window {

	private Canvas content;


	public MainWindow(String title) {
		super();
		this.setWidth100();
		this.setHeight100();
		// this.setCanDragReposition(false);
		// this.setCanDragResize(false);
		this.setTitle(title);
	}

	public void hideControls() {
		this.setShowMaximizeButton(false);
		this.setShowMinimizeButton(false);
		this.setShowCloseButton(false);
	}

	public void setContent(Canvas component) {
		this.addItem(component);
	}

	public void setWindowTitle(String title) {
		this.setTitle(title);
	}

	public void clearItems() {
		// TODO Auto-generated method stub
		Canvas[] items = this.getItems(); 
		for(Canvas c : items){
			c.clear();
		}
	
	}

}
