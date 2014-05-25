package com.emerge.TMobile.shared;

import java.util.HashMap;
import com.google.gwt.user.client.History;
import com.google.gwt.user.client.Window;

public class QueryString {

	public QueryString() {

	}

	/**
	 * get the history token from the url with/without querystring
	 * 
	 * @return String
	 */
	public static String getHistoryToken() {
		String historyToken = History.getToken();
		if (!historyToken.contains("?")) {
			return historyToken;
		}
		return historyToken.split("\\?")[0];
	}

	/**
	 * get the query from the history token
	 * 
	 * @return HashMap<String, String>
	 */
	public static HashMap<String, String> getParams() {
		HashMap<String, String> params = new HashMap<String, String>();
		String queryString = null;
		queryString = History.getToken();
		// get the query with no hash sign
		if (queryString.length() <= 0) {
			queryString = Window.Location.getQueryString();
		}
		if (queryString.contains("?")) {
			int questionMarkIndex = queryString.indexOf("?") + 1;
			queryString = queryString.substring(questionMarkIndex);
			if (queryString.contains("&")) {
				String[] query = queryString.split("&");
				for (String param : query) {
					String[] keyValue = param.split("=");
					if (keyValue.length > 1)
						params.put(keyValue[0], keyValue[1]);
					else
						params.put(keyValue[0], "");
				}
			} else {
				String[] keyValue = queryString.split("=");
				params.put(keyValue[0], keyValue[1]);
			}
		}
		return params;
	}

	/**
	 * Get query string from the specified url
	 * 
	 * @param url
	 * @return
	 */
	public static HashMap<String, String> getParams(String url) {
		HashMap<String, String> params = new HashMap<String, String>();
		String queryString = url;
		queryString = queryString.split("\\?")[1];
		String[] query = queryString.split("&");
		for (String param : query) {
			String[] keyValue = param.split("=");
			params.put(keyValue[0], keyValue[1]);
		}
		return params;
	}
}