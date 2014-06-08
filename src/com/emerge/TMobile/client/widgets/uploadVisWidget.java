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

import com.google.gwt.i18n.client.NumberFormat;
import com.google.gwt.json.client.JSONObject;
import com.google.gwt.json.client.JSONString;
import com.google.gwt.user.client.Window;
import com.smartgwt.client.widgets.Canvas;
import com.smartgwt.client.widgets.Label;
import com.smartgwt.client.widgets.Progressbar;
import com.smartgwt.client.widgets.layout.VLayout;

public class uploadVisWidget  extends Canvas{
	VerticalContainer vc;
	private Label progressLabel;
	private Uploader uploader;
	Progressbar pbar1;
	
 public uploadVisWidget(){
	 super();
		progressLabel = new Label();
		pbar1 = new Progressbar();
		pbar1.setPercentDone(0);
		pbar1.setWidth(275);
		pbar1.setHeight(24);
		pbar1.hide();
		

		uploader = new Uploader();
		 JSONObject params = new JSONObject();
	     params.put("post_param_name_1", new JSONString("post_param_value_1"));
	     params.put("post_param_name_2", new JSONString("post_param_value_2"));
	     params.put("post_param_name_n", new JSONString("post_param_value_n"));
		
		uploader.setPostParams(params);
		
		uploader.setUploadURL("http://localhost:8080/TMobile/tmobile/uploadVisServlet")
				.setButtonText(
						"<span class=\"buttonText\">Click to Upload VIS</span>")
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
						String percentDone = NumberFormat.getPercentFormat().format(
								(double) uploadProgressEvent.getBytesComplete() / (double) uploadProgressEvent.getBytesTotal());
						progressLabel.setContents(percentDone);
						pbar1.setPercentDone(Integer.valueOf(percentDone.substring(0, percentDone.length()-1)));
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
						pbar1.setPercentDone(100);
						return true;
					}

				})
				.setFileDialogCompleteHandler(new FileDialogCompleteHandler() {
					public boolean onFileDialogComplete(
							FileDialogCompleteEvent fileDialogCompleteEvent) {
						if (fileDialogCompleteEvent.getTotalFilesInQueue() > 0
								&& uploader.getStats().getUploadsInProgress() <= 0) {
							progressLabel.setContents("0%");
							pbar1.setPercentDone(0);
							pbar1.show();
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
		vl.setHeight(50);
		vl.addMember(uploader);
		vl.addMember(pbar1);
		vl.addMember(progressLabel);
		this.addChild(vl);
 }
 
	private void resetText() {
		// TODO Auto-generated method stub
		progressLabel.setContents("");
		pbar1.hide();
		uploader.setButtonText("<span class=\"buttonText\">Click to Upload</span>"); 
	}
}
