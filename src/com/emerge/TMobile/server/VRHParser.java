package com.emerge.TMobile.server;
/**
 * 
 * @author Marvin Manguiat
 * 8/8/2014 
 * Description: ecxel parser for TMObile VRH vendor rebate history
 * currently support xlsx format, This will parse the 
 * VRH xlsx and save the data to myslq Database  
 *
 */

public class VRHParser {
	
    public VRHParser(){
    	
    }
    
	
   
	public String getVrhInvoiceNumber() {
		return vrhInvoiceNumber;
	}
	public void setVrhInvoiceNumber(String vrhInvoiceNumber) {
		this.vrhInvoiceNumber = vrhInvoiceNumber;
	}
	public String getVrhTrackingNumber() {
		return vrhTrackingNumber;
	}
	public void setVrhTrackingNumber(String vrhTrackingNumber) {
		this.vrhTrackingNumber = vrhTrackingNumber;
	}
	public String getVrhQTY() {
		return vrhQTY;
	}
	public void setVrhQTY(String vrhQTY) {
		this.vrhQTY = vrhQTY;
	}
	public String getVrhDesc() {
		return vrhDesc;
	}
	public void setVrhDesc(String vrhDesc) {
		this.vrhDesc = vrhDesc;
	}
	public String getVrhUnitRebate() {
		return vrhUnitRebate;
	}
	public void setVrhUnitRebate(String vrhUnitRebate) {
		this.vrhUnitRebate = vrhUnitRebate;
	}
	public String getVrhRelatedProduct() {
		return vrhRelatedProduct;
	}
	public void setVrhRelatedProduct(String vrhRelatedProduct) {
		this.vrhRelatedProduct = vrhRelatedProduct;
	}
	public String getVrhRelatedSN() {
		return vrhRelatedSN;
	}
	public void setVrhRelatedSN(String vrhRelatedSN) {
		this.vrhRelatedSN = vrhRelatedSN;
	}
	public String getVrhRatePlan() {
		return vrhRatePlan;
	}
	public void setVrhRatePlan(String vrhRatePlan) {
		this.vrhRatePlan = vrhRatePlan;
	}
	public String getVrhCustomer() {
		return vrhCustomer;
	}
	public void setVrhCustomer(String vrhCustomer) {
		this.vrhCustomer = vrhCustomer;
	}
	public String getVrhSalesPerson() {
		return vrhSalesPerson;
	}
	public void setVrhSalesPerson(String vrhSalesPerson) {
		this.vrhSalesPerson = vrhSalesPerson;
	}
	public String getVrhSoldOn() {
		return vrhSoldOn;
	}
	public void setVrhSoldOn(String vrhSoldOn) {
		this.vrhSoldOn = vrhSoldOn;
	}
	public String getVrhInvoicedBy() {
		return vrhInvoicedBy;
	}
	public void setVrhInvoicedBy(String vrhInvoicedBy) {
		this.vrhInvoicedBy = vrhInvoicedBy;
	}
	public String getVrhPortNumber() {
		return vrhPortNumber;
	}
	public void setVrhPortNumber(String vrhPortNumber) {
		this.vrhPortNumber = vrhPortNumber;
	}
	private String  vrhInvoiceNumber;
	private String  vrhTrackingNumber;
	private String  vrhQTY;
	private String  vrhDesc;
	private String  vrhUnitRebate;
	private String  vrhRelatedProduct;
	private String  vrhRelatedSN;
	private String  vrhRatePlan;
	private String  vrhCustomer;
	private String  vrhSalesPerson;
	private String  vrhSoldOn;
	private String  vrhInvoicedBy;
	private String  vrhPortNumber;
	

}
