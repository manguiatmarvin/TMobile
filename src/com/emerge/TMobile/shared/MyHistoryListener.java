package com.emerge.TMobile.shared;

import com.google.gwt.event.logical.shared.ValueChangeEvent;
import com.google.gwt.event.logical.shared.ValueChangeHandler;

public class MyHistoryListener implements ValueChangeHandler<String> {

	@Override
	public void onValueChange(ValueChangeEvent<String> event) {
        if (event.getValue().equals("page1")){
//            RootPanel.get().clear();
//            RootPanel.get().add(Page1.getInstance());
        }
        
        if (event.getValue().equals("page2")){
//            RootPanel.get().clear();
//            RootPanel.get().add(Page2.getInstance());
        }    

	}

}
