package com.emerge.TMobile.client;


import com.emerge.TMobile.client.pages.Audit;
import com.emerge.TMobile.client.pages.CommHub;
import com.emerge.TMobile.client.pages.Index;
import com.emerge.TMobile.client.pages.Reporting;
import com.emerge.TMobile.client.widgets.MainWindow;
import com.emerge.TMobile.shared.QueryString;
import com.google.gwt.event.logical.shared.ValueChangeEvent;
import com.google.gwt.event.logical.shared.ValueChangeHandler;
import com.google.gwt.user.client.ui.RootPanel;
import com.smartgwt.client.widgets.Canvas;

public class HistoryListener implements ValueChangeHandler<String> {
	private MainWindow mainWindow;
	private Canvas managePanel;

	public HistoryListener() {
		
	}

	@Override
	public void onValueChange(ValueChangeEvent<String> event) {
		// TODO Auto-generated method stub
		String history = QueryString.getHistoryToken();
		System.out.println("Current State : " + history);
		

		if (history.equalsIgnoreCase("index")) {
			
			if (mainWindow != null) {
				mainWindow.destroy();
				RootPanel.get().remove(mainWindow);
			}

			mainWindow = new MainWindow("TMobile :: Index",false);
			mainWindow.setContent(new Index());
			RootPanel.get().add(mainWindow);

		} else if (history.equalsIgnoreCase("audit")) {

			if (mainWindow != null) {
				mainWindow.destroy();
				RootPanel.get().remove(mainWindow);
			}

			mainWindow = new MainWindow("TMobile :: Audit",false);
			mainWindow.setContent(new Audit());
			RootPanel.get().add(mainWindow);

		} else if (history.equalsIgnoreCase("reporting")) {

			if (mainWindow != null) {
				mainWindow.destroy();
				RootPanel.get().remove(mainWindow);
			}

			mainWindow = new MainWindow("TMobile :: Reporting",false);
			mainWindow.setContent(new Reporting());
			RootPanel.get().add(mainWindow);

		} else if (history.equalsIgnoreCase("Communication")) {

			if (mainWindow != null) {
				mainWindow.destroy();
				RootPanel.get().remove(mainWindow);
			}

			mainWindow = new MainWindow("TMobile :: Communication",false);
			mainWindow.setContent(new CommHub());
			RootPanel.get().add(mainWindow);

		} else {
			// TODO create a 404 page and redirect instead of index

		}
	}
}
