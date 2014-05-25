package com.emerge.TMobile.client;

import com.emerge.TMobile.client.pages.Index;
import com.emerge.TMobile.client.widgets.MainWindow;
import com.emerge.TMobile.shared.QueryString;
import com.google.gwt.event.logical.shared.ValueChangeEvent;
import com.google.gwt.event.logical.shared.ValueChangeHandler;
import com.google.gwt.user.client.History;
public class HistoryListener implements ValueChangeHandler<String> {
	MainWindow mainWindow = MainWindow.getInstance("TMobile");

	public HistoryListener() {
		mainWindow.draw();
	}

	@Override
	public void onValueChange(ValueChangeEvent<String> event) {
		// TODO Auto-generated method stub
		String history = QueryString.getHistoryToken();
		System.out.println("Current State : " + history);

		if (history.equalsIgnoreCase("index")) {
			mainWindow.setTitle("TMobile :: Index");
			mainWindow.setContent(Index.getInstance());
			mainWindow.redraw();

		} else if (history.equalsIgnoreCase("audit")) {

			if (QueryString.getParams().get("id") != null) {
				int Id = Integer.parseInt(QueryString.getParams().get("id"));
			}

			if (QueryString.getParams().get("type") != null) {
				String type = QueryString.getParams().get("type");
			}

			mainWindow.setTitle("TMobile :: audit ");
			mainWindow.redraw();
			
		} else if (history.equalsIgnoreCase("reporting")) {

			mainWindow.setTitle("TMobile :: audit");
			mainWindow.redraw();
		} else if (history.equalsIgnoreCase("Communication")) {

			mainWindow.setTitle("TMobile :: Communication");
			mainWindow.redraw();
		} else {
			// TODO create a 404 page and redirect instead of index
			History.newItem("index");
		}
	}
}
