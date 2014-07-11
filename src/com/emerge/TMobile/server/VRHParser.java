package com.emerge.TMobile.server;

import java.io.File;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.CreationHelper;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

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
	private Date  vrhSoldOn;
	private String  vrhInvoicedBy;
	private String  vrhPortNumber;
	private File file;

	public VRHParser(){
    	
    }
    
    
    public int processVrhXLSXFile(){
        
        try{
            // Create a workbook using the File System 
            Workbook myWorkBook  = WorkbookFactory.create(this.getFile());
            
            CellStyle cellStyle = myWorkBook.createCellStyle();
	    	CreationHelper createHelper = myWorkBook.getCreationHelper();
	    	  
	    	  
	    	  
	    	  
            // Get the first sheet from workbook 
            Sheet sheet = myWorkBook.getSheetAt(0);
            Row row; 
            int col;
            int i;
            int loopRan = 0;
            //TODO check header if valid @ row 0 
            for(i=3; i<=sheet.getLastRowNum(); i++){  
            	loopRan ++;
                 row = sheet.getRow(i);
                
				//1.)  Invoice Number
                 col = 0;
                if(row.getCell(col) != null){
					if (row.getCell(col).getCellType() == 0) {
						this.setVrhInvoiceNumber( String.valueOf(row.getCell(col)
								.getNumericCellValue()));
					} else if (row.getCell(col).getCellType() == 1) {
						this.setVrhInvoiceNumber(row.getCell(col).getStringCellValue());
					}else if(row.getCell(col).getCellType() == 2){
						this.setVrhInvoiceNumber("_FORMULA");
					} else if (row.getCell(col).getCellType() == 3) {
						this.setVrhInvoiceNumber("_BLANK");
					}else if(row.getCell(col).getCellType()== 4){
						this.setVrhInvoiceNumber("_BOOLEAN");
					}else if(row.getCell(col).getCellType()==5){
						this.setVrhInvoiceNumber("_ERROR");
				    }else{
						this.setVrhInvoiceNumber("CAN BE DATE");
				      }
					
                }else{
                	this.setVrhInvoiceNumber("");
                }
				
                 
				//2.)  Tracking Number  1
				col = 1;
				if(row.getCell(col) != null){
					if (row.getCell(col).getCellType() == 0) {
						this.setVrhTrackingNumber( String.valueOf(row.getCell(col)
								.getNumericCellValue()));
					} else if (row.getCell(col).getCellType() == 1) {
						this.setVrhTrackingNumber(row.getCell(col).getStringCellValue());
					}else if(row.getCell(col).getCellType() == 2){
						this.setVrhTrackingNumber("_FORMULA");
					} else if (row.getCell(col).getCellType() == 3) {
						this.setVrhTrackingNumber("_BLANK");
					}else if(row.getCell(col).getCellType()== 4){
						this.setVrhTrackingNumber("_BOOLEAN");
					}else if(row.getCell(col).getCellType()==5){
						this.setVrhTrackingNumber("_ERROR");
				    }else{
						this.setVrhTrackingNumber("CAN BE DATE");
				      }
				
				}else{
					this.setVrhTrackingNumber("");
				}
				
				
				//3.) QTY 3
				col = 2;
				if(row.getCell(col) != null){
					if (row.getCell(col).getCellType() == 0) {
						this.setVrhQTY( String.valueOf(row.getCell(col)
								.getNumericCellValue()));
					} else if (row.getCell(col).getCellType() == 1) {
						this.setVrhQTY(row.getCell(col).getStringCellValue());
					}else if(row.getCell(col).getCellType() == 2){
						this.setVrhQTY("_FORMULA");
					} else if (row.getCell(col).getCellType() == 3) {
						this.setVrhQTY("_BLANK");
					}else if(row.getCell(col).getCellType()== 4){
						this.setVrhQTY("_BOOLEAN");
					}else if(row.getCell(col).getCellType()==5){
						this.setVrhQTY("_ERROR");
				    }else{
						this.setVrhQTY("CAN BE DATE");
				      }
				}else{
					this.setVrhQTY("");
				}
                
				
				// 4.)  Description  4
				col = 4;
				if(row.getCell(col) != null){
					if (row.getCell(col).getCellType() == 0) {
						this.setVrhDesc( String.valueOf(row.getCell(col)
								.getNumericCellValue()));
					} else if (row.getCell(col).getCellType() == 1) {
						this.setVrhDesc(row.getCell(col).getStringCellValue());
					}else if(row.getCell(col).getCellType() == 2){
						this.setVrhDesc("_FORMULA");
					} else if (row.getCell(col).getCellType() == 3) {
						this.setVrhDesc("_BLANK");
					}else if(row.getCell(col).getCellType()== 4){
						this.setVrhDesc("_BOOLEAN");
					}else if(row.getCell(col).getCellType()==5){
						this.setVrhDesc("_ERROR");
				    }else{
						this.setVrhDesc("CAN BE DATE");
				      }
				
				}else{
					this.setVrhDesc("");
				}
				
					
			    //5.)  Unit rebate 5
				col = 5;
				if(row.getCell(col) != null){
					if (row.getCell(col).getCellType() == 0) {
						this.setVrhUnitRebate( String.valueOf(row.getCell(col)
								.getNumericCellValue()));
					} else if (row.getCell(col).getCellType() == 1) {
						this.setVrhUnitRebate(row.getCell(col).getStringCellValue());
					}else if(row.getCell(col).getCellType() == 2){
						this.setVrhUnitRebate("_FORMULA");
					} else if (row.getCell(col).getCellType() == 3) {
						this.setVrhUnitRebate("_BLANK");
					}else if(row.getCell(col).getCellType()== 4){
						this.setVrhUnitRebate("_BOOLEAN");
					}else if(row.getCell(col).getCellType()==5){
						this.setVrhUnitRebate("_ERROR");
				    }else{
						this.setVrhUnitRebate("CAN BE DATE");
				      }
				
				}else{
					this.setVrhUnitRebate("");
				}
				 
			     
			    // 6.) Related Product 11
				  col = 11;
				  if(row.getCell(col) != null){
					  if (row.getCell(col).getCellType() == 0) {
							this.setVrhRelatedProduct( String.valueOf(row.getCell(col)
									.getNumericCellValue()));
						} else if (row.getCell(col).getCellType() == 1) {
							this.setVrhRelatedProduct(row.getCell(col).getStringCellValue());
						}else if(row.getCell(col).getCellType() == 2){
							this.setVrhRelatedProduct("_FORMULA");
						} else if (row.getCell(col).getCellType() == 3) {
							this.setVrhRelatedProduct("_BLANK");
						}else if(row.getCell(col).getCellType()== 4){
							this.setVrhRelatedProduct("_BOOLEAN");
						}else if(row.getCell(col).getCellType()==5){
							this.setVrhRelatedProduct("_ERROR");
					    }else{
							this.setVrhRelatedProduct("CAN BE DATE");
					      }
			      
				  }else{
					  this.setVrhRelatedProduct("");
				  }
			      
			    
			    // 7.) Related SN
				  col = 13;
			      if(row.getCell(col) != null){
			    	  
			    	  if (row.getCell(col).getCellType() == 0) {
					     Date strDate = row.getCell(col).getDateCellValue();
					     this.setVrhRelatedSN(String.valueOf(strDate));
					     
						} else if (row.getCell(col).getCellType() == 1) {
							this.setVrhRelatedSN("String 1 "+row.getCell(col).getStringCellValue());
						}else if(row.getCell(col).getCellType() == 2){
							this.setVrhRelatedSN("_FORMULA");
						} else if (row.getCell(col).getCellType() == 3) {
							this.setVrhRelatedSN("_BLANK");
						}else if(row.getCell(col).getCellType()== 4){
							this.setVrhRelatedSN("_BOOLEAN");
						}else if(row.getCell(col).getCellType()==5){
							this.setVrhRelatedSN("_ERROR");
					    }else{
							this.setVrhRelatedSN("Date: "+String.valueOf(row.getCell(col).getDateCellValue()));
					      }
				      
			      }else{
			    	  this.setVrhRelatedSN("");
			      }
			      
			      
			      // 8.) Rate Plan 15
			      col = 16;
			      if(row.getCell(col) != null){
			    	  if (row.getCell(col).getCellType() == 0) {
							this.setVrhRatePlan( String.valueOf(row.getCell(col)
									.getNumericCellValue()));
						} else if (row.getCell(col).getCellType() == 1) {
							this.setVrhRatePlan(row.getCell(col).getStringCellValue());
						}else if(row.getCell(col).getCellType() == 2){
							this.setVrhRatePlan("_FORMULA");
						} else if (row.getCell(col).getCellType() == 3) {
							this.setVrhRatePlan("_BLANK");
						}else if(row.getCell(col).getCellType()== 4){
							this.setVrhRatePlan("_BOOLEAN");
						}else if(row.getCell(col).getCellType()==5){
							this.setVrhRatePlan("_ERROR");
					    }else{
							this.setVrhRatePlan("CAN BE DATE");
					      }
			      
			      }else{
			    	  this.setVrhRatePlan("");
			      }
			      
			      
			      // 9.) Customer  18
			      col = 18;
			      if(row.getCell(col) != null){
			    	  if (row.getCell(col).getCellType() == 0) {
							this.setVrhCustomer( String.valueOf(row.getCell(col)
									.getNumericCellValue()));
						} else if (row.getCell(col).getCellType() == 1) {
							this.setVrhCustomer(row.getCell(col).getStringCellValue());
						}else if(row.getCell(col).getCellType() == 2){
							this.setVrhCustomer("_FORMULA");
						} else if (row.getCell(col).getCellType() == 3) {
							this.setVrhCustomer("_BLANK");
						}else if(row.getCell(col).getCellType()== 4){
							this.setVrhCustomer("_BOOLEAN");
						}else if(row.getCell(col).getCellType()==5){
							this.setVrhCustomer("_ERROR");
					    }else{
							this.setVrhCustomer("CAN BE DATE");
					      }
				      
			      }else{
			    	  this.setVrhCustomer("");
			      }
			      
			      
			      
			      
			      
			      // 10.) Sales Person 19
			      
			      // 9.) Customer  18
			      col = 19;
			      if(row.getCell(col) != null){
			    	  if (row.getCell(col).getCellType() == 0) {
							this.setVrhSalesPerson( String.valueOf(row.getCell(col)
									.getNumericCellValue()));
						} else if (row.getCell(col).getCellType() == 1) {
							this.setVrhSalesPerson(row.getCell(col).getStringCellValue());
						}else if(row.getCell(col).getCellType() == 2){
							this.setVrhSalesPerson("_FORMULA");
						} else if (row.getCell(col).getCellType() == 3) {
							this.setVrhSalesPerson("_BLANK");
						}else if(row.getCell(col).getCellType()== 4){
							this.setVrhSalesPerson("_BOOLEAN");
						}else if(row.getCell(col).getCellType()==5){
							this.setVrhSalesPerson("_ERROR");
					    }else{
							this.setVrhSalesPerson("CAN BE DATE");
					      }
				      
			      }else{
			    	  this.setVrhSalesPerson("");
			      }
			      
			      
			      // 11.) Sold on 21
			      col = 21;
			      if(row.getCell(col) != null){
			    	  cellStyle.setDataFormat(
				    	      createHelper.createDataFormat().getFormat("yyyy/mm/dd hh:mm:ss"));
			    	  
			    	  row.getCell(col).setCellStyle(cellStyle);
			    	  this.setVrhSoldOn(row.getCell(col).getDateCellValue());
			    	 
			      }
			      
			      
			      //12.)  Invoiced By 22
			      col = 22; 
			      if(row.getCell(col) != null){
			    	  if (row.getCell(col).getCellType() == 0) {
							this.setVrhInvoicedBy( String.valueOf(row.getCell(col)
									.getNumericCellValue()));
						} else if (row.getCell(col).getCellType() == 1) {
							this.setVrhInvoicedBy(row.getCell(col).getStringCellValue());
						}else if(row.getCell(col).getCellType() == 2){
							this.setVrhInvoicedBy("_FORMULA");
						} else if (row.getCell(col).getCellType() == 3) {
							this.setVrhInvoicedBy("_BLANK");
						}else if(row.getCell(col).getCellType()== 4){
							this.setVrhInvoicedBy("_BOOLEAN");
						}else if(row.getCell(col).getCellType()==5){
							this.setVrhInvoicedBy("_ERROR");
					    }else{
							this.setVrhInvoicedBy("CAN BE DATE");
					      }
			    	   
			      }else{
			    	  this.setVrhInvoicedBy("");
			      }
			      			      
			      
			      // 13.) Port Number 40
			      col = 40;
			      if(row.getCell(col) != null){
			    	  
			    	  if (row.getCell(col).getCellType() == 0) {
							this.setVrhPortNumber( String.valueOf(row.getCell(col)
									.getNumericCellValue()));
						} else if (row.getCell(col).getCellType() == 1) {
							this.setVrhPortNumber(row.getCell(col).getStringCellValue());
						}else if(row.getCell(col).getCellType() == 2){
							this.setVrhPortNumber("_FORMULA");
						} else if (row.getCell(col).getCellType() == 3) {
							this.setVrhPortNumber("_BLANK");
						}else if(row.getCell(col).getCellType()== 4){
							this.setVrhPortNumber("_BOOLEAN");
						}else if(row.getCell(col).getCellType()==5){
							this.setVrhPortNumber("_ERROR");
					    }else{
							this.setVrhPortNumber("CAN BE DATE");
					      }
			    	  
			      }else{
			    	  this.setVrhPortNumber("");
			      }
			      
			      
			   
			      
			      if(loopRan < 28){ // print first 3 only
			    	  System.out.println("Row : "+i);
			    	  System.out.println("Invoice Number : "+this.getVrhInvoiceNumber());
		                 
		                 System.out.println("Tracking Number : "+this.getVrhTrackingNumber());
		                 
		                 System.out.println("QTY : "+this.getVrhQTY());
		                 
		                 System.out.println("Description : "+this.getVrhDesc());
		                 
		                 System.out.println("Unit Rebate : "+this.getVrhUnitRebate());
		                 
		                 System.out.println("Related Product : "+this.getVrhRelatedProduct());
		                 
		                 System.out.println("Related SN : "+this.getVrhRelatedSN());
		                 
		                 System.out.println("Rate Plan : "+this.getVrhRatePlan());
		            
		                 System.out.println("Customer : "+this.getVrhCustomer());
		                 
		                 System.out.println("Sales Person : "+this.getVrhSalesPerson());
		                 
		                 System.out.println("Sold On : "+this.getVrhSoldOn());
		                 
		                 System.out.println("Invoiced By : "+this.getVrhInvoicedBy());
		                 
		                 System.out.println("Port Number : "+this.getVrhPortNumber());
		                 
		                 System.out.println("___________________________________________"); 
			      }
                      
             }  
            i = i-1;
            System.out.println("Total Rows processed:  "+i+" Loop Ran: "+loopRan);
            System.out.println("Success import excel to mysql table ");  
             
        }
        catch (Exception e){
            e.printStackTrace(); 
        }
		return 0;
 
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
	public Date getVrhSoldOn() {
		return vrhSoldOn;
	}
	public void setVrhSoldOn(Date vrhSoldOn) {
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

    public File getFile() {
		return file;
	}


	public void setFile(File file) {
		this.file = file;
	}

}
