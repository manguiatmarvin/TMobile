package com.emerge.TMobile.client.widgets;

import com.smartgwt.client.widgets.Canvas;
import com.smartgwt.client.widgets.Window;


public class MainWindow extends Window {

	private Canvas content;


	public MainWindow(String title) {
		super();
		this.setTitle(title);
		this.setHeaderIcon("silk/layout_content.png");
		this.setWidth100();
		this.setHeight100();
		this.setShowMinimizeButton(false);
		this.setShowCloseButton(true);
		this.setCanDragReposition(false);
		this.setCanDragResize(false);
		this.setShowShadow(false);
		this.setShowCloseButton(false);
		this.setPageTop(0);
		this.centerInPage();
		
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


}
