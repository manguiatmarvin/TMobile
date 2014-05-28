package com.emerge.TMobile.client.pages;

import com.emerge.TMobile.client.widgets.RegistrationForm;
import com.emerge.TMobile.client.widgets.VerticalContainer;
import com.smartgwt.client.types.VerticalAlignment;
import com.smartgwt.client.widgets.Canvas;
import com.smartgwt.client.widgets.Label;
import com.smartgwt.client.widgets.layout.VLayout;

public class Index extends Canvas {
	VerticalContainer vc;

public Index() {
		super();
		this.setWidth100();
		this.setHeight100();
		Label label = new Label(
				"<p>Rising inventory costs and falling commissions demand tighter controls. However, the lack of carrier integration with any point-of-sale system leaves an operational gap.   This gap leaves you vulnerable to human error, carrier inaccuracies, and is exploited by fraudulent activity. <p>"
			  + "<p>Carrier Insite software effectively eliminates that gap. In turn it allows your organization to quickly discover and address commission discrepancies as well as manage chargebacks.  Both of which lead to a vast reduction in loss and a much improved cash flow.</p>"
			  + "<p>The minute it becomes available our platform goes to work comparing the data from your carriers portal to that of your point-of-sale.  This includes all available data for activations, upgrades, features, and deactivations.</p>");
		
	    label.setWidth100();
		label.setHeight100();
		label.setValign(VerticalAlignment.TOP);
		
		VLayout vl = new VLayout();
		vl.setWidth100();
		vl.setMembers(label,new RegistrationForm());
		this.addChild(vl);
	}

}
