package com.emerge.TMobile.client.widgets;



import org.moxieapps.gwt.uploader.client.Uploader;
import org.moxieapps.gwt.uploader.client.events.FileDialogCompleteEvent;
import org.moxieapps.gwt.uploader.client.events.FileDialogCompleteHandler;
import org.moxieapps.gwt.uploader.client.events.FileQueueErrorEvent;
import org.moxieapps.gwt.uploader.client.events.FileQueueErrorHandler;
import org.moxieapps.gwt.uploader.client.events.UploadErrorEvent;
import org.moxieapps.gwt.uploader.client.events.UploadErrorHandler;
import org.moxieapps.gwt.uploader.client.events.UploadProgressEvent;
import org.moxieapps.gwt.uploader.client.events.UploadProgressHandler;
import org.moxieapps.gwt.uploader.client.events.UploadSuccessEvent;
import org.moxieapps.gwt.uploader.client.events.UploadSuccessHandler;

import com.google.gwt.core.client.GWT;
import com.google.gwt.i18n.client.NumberFormat;
import com.google.gwt.json.client.JSONObject;
import com.google.gwt.json.client.JSONString;
import com.google.gwt.user.client.Window;
import com.smartgwt.client.widgets.Canvas;
import com.smartgwt.client.widgets.Label;
import com.smartgwt.client.widgets.layout.VLayout;

public class UploadVrhWidget  extends Canvas{
	VerticalContainer vc;
	private Label progressLabel;
	private Uploader uploader;
	
 public UploadVrhWidget(){
	 super();
		progressLabel = new Label();

		uploader = new Uploader();
		 JSONObject params = new JSONObject();
	     params.put("post_param_name_1", new JSONString("post_param_value_1"));
	     params.put("post_param_name_2", new JSONString("post_param_value_2"));
	     params.put("post_param_name_n", new JSONString("post_param_value_n"));
		
		uploader.setPostParams(params);
		
		uploader.setUploadURL(GWT.getModuleBaseURL()+"/uploadVrhServlet")
				.setButtonText(
						"<span class=\"buttonText\">Click to Upload VRH</span>")
				.setButtonTextStyle(
						".buttonText {font-family: Arial, sans-serif; font-size: 14px; color: #BB4B44}")
				.setFileSizeLimit("50 MB")
				.setButtonWidth(150)
				.setButtonHeight(22)
				.setButtonCursor(Uploader.Cursor.HAND)
				.setButtonAction(Uploader.ButtonAction.SELECT_FILE)
				.setUploadProgressHandler(new UploadProgressHandler() {
					public boolean onUploadProgress(
							UploadProgressEvent uploadProgressEvent) {
						progressLabel.setContents(NumberFormat
								.getPercentFormat().format(
										(double) uploadProgressEvent
												.getBytesComplete()
												/ (double) uploadProgressEvent
														.getBytesTotal()));
						return true;
					}
				})
				.setUploadSuccessHandler(new UploadSuccessHandler() {
					public boolean onUploadSuccess(
							UploadSuccessEvent uploadSuccessEvent) {
						resetText();
						StringBuilder sb = new StringBuilder();
						sb.append("File ")
								.append(uploadSuccessEvent.getFile().getName())
								.append(" (")
								.append(NumberFormat.getDecimalFormat()
										.format(uploadSuccessEvent.getFile()
												.getSize() / 1024))
								.append(" KB)")
								.append(" uploaded successfully at ")
								.append(NumberFormat.getDecimalFormat().format(
										uploadSuccessEvent.getFile()
												.getAverageSpeed() / 1024))
								.append(" Kb/second");
						progressLabel.setContents(sb.toString());
						return true;
					}

				})
				.setFileDialogCompleteHandler(new FileDialogCompleteHandler() {
					public boolean onFileDialogComplete(
							FileDialogCompleteEvent fileDialogCompleteEvent) {
						if (fileDialogCompleteEvent.getTotalFilesInQueue() > 0
								&& uploader.getStats().getUploadsInProgress() <= 0) {
							progressLabel.setContents("0%");
							uploader.setButtonText("<span class=\"buttonText\">Uploading...</span>");
							uploader.startUpload();
						}
						return true;
					}
				}).setFileQueueErrorHandler(new FileQueueErrorHandler() {
					public boolean onFileQueueError(
							FileQueueErrorEvent fileQueueErrorEvent) {
						resetText();
						Window.alert("Upload of file "
								+ fileQueueErrorEvent.getFile().getName()
								+ " failed due to ["
								+ fileQueueErrorEvent.getErrorCode().toString()
								+ "]: " + fileQueueErrorEvent.getMessage());
						return true;
					}
				}).setUploadErrorHandler(new UploadErrorHandler() {
					public boolean onUploadError(
							UploadErrorEvent uploadErrorEvent) {
						resetText();
						Window.alert("Upload of file "
								+ uploadErrorEvent.getFile().getName()
								+ " failed due to ["
								+ uploadErrorEvent.getErrorCode().toString()
								+ "]: " + uploadErrorEvent.getMessage());
						return true;
					}
				});

		VLayout vl = new VLayout();
		vl.setWidth100();
		vl.addMember(uploader);
		vl.addMember(progressLabel);
		this.addChild(vl);
 }
 
	private void resetText() {
		// TODO Auto-generated method stub
		progressLabel.setContents("");
		uploader.setButtonText("<span class=\"buttonText\">Upload new</span>"); 
	}
}
