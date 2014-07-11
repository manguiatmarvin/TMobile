package com.emerge.TMobile.server;

import java.io.File;
import java.text.DateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/**
 * 
 * @author Marvin Manguiat
 * 8/8/2014 
 * Description: ecxel parser for TMObile VIS
 * currently support xlsx format, This will parse the 
 * VIS xlsx and save the data to myslq Database  
 *
 */

public class VisParser {
	
	private String visSalesCode;	
	private String visMontlyAccess;
	private String visPlanCode;
	private String visPlanDesc;
	private String visProductType;
	private String visTransactionType;
	private String visActivationDate;
	private String visServiceNumber;
	private String visCustomerName;
	private String visIMEI;
	private String visDeposit;
	private String visCreditClass;
	private String visBAN;
	private String visEBTVVoice;
	private String visBTVData;
	private String visMRCReduced;
	private String visSubsidy;
	private String visEIP;
	private File file;
	
	


	public VisParser(){
	}
    
    public int processVisXLSXFile(){
    
        try{
            // Create a workbook using the File System 
            Workbook myWorkBook  = WorkbookFactory.create(this.getFile());
            // Get the first sheet from workbook 
            Sheet sheet = myWorkBook.getSheetAt(0);
            Row row; 
            int col;
            int i;
            int loopRan = 0;
            //TODO check header if valid @ row 0 
            for(i=1; i<=sheet.getLastRowNum(); i++){  
            	loopRan ++;
                 row = sheet.getRow(i);
                
				//1.)  Sales Code col 0
                 col = 0;
                if(row.getCell(col) != null){
					if (row.getCell(col).getCellType() == Cell.CELL_TYPE_NUMERIC) {
						row.getCell(col).setCellType(Cell.CELL_TYPE_STRING);
						
						this.setVisSalesCode(row.getCell(col).getStringCellValue());
					} else if (row.getCell(col).getCellType() == 1) {
						this.setVisSalesCode(row.getCell(col).getStringCellValue());
					}else if(row.getCell(col).getCellType() == 2){
						this.setVisSalesCode("_FORMULA");
					} else if (row.getCell(col).getCellType() == 3) {
						this.setVisSalesCode("_BLANK");
					}else if(row.getCell(col).getCellType()== 4){
						this.setVisSalesCode("_BOOLEAN");
					}else if(row.getCell(col).getCellType()==5){
						this.setVisSalesCode("_ERROR");
				    }else{
						this.setVisSalesCode("CAN BE DATE");
				      }
					
                }else{
                	this.setVisSalesCode("");
                }
				
                 
				//2.)  monthlyAccess 4
				col = 4;
				if(row.getCell(col) != null){
					if (row.getCell(col).getCellType() == 0) {
						this.setVisMontlyAccess( String.valueOf(row.getCell(col)
								.getNumericCellValue()));
					} else if (row.getCell(col).getCellType() == 1) {
						this.setVisMontlyAccess(row.getCell(col).getStringCellValue());
					}else if(row.getCell(col).getCellType() == 2){
						this.setVisMontlyAccess("_FORMULA");
					} else if (row.getCell(col).getCellType() == 3) {
						this.setVisMontlyAccess("_BLANK");
					}else if(row.getCell(col).getCellType()== 4){
						this.setVisMontlyAccess("_BOOLEAN");
					}else if(row.getCell(col).getCellType()==5){
						this.setVisMontlyAccess("_ERROR");
				    }else{
						this.setVisMontlyAccess("CAN BE DATE");
				      }
				
				}else{
					this.setVisMontlyAccess("");
				}
				
				
				//3.) Plan Code 5
				col = 5;
				if(row.getCell(col) != null){
					if (row.getCell(col).getCellType() == 0) {
						this.setVisPlanCode( String.valueOf(row.getCell(col)
								.getNumericCellValue()));
					} else if (row.getCell(col).getCellType() == 1) {
						this.setVisPlanCode(row.getCell(col).getStringCellValue());
					}else if(row.getCell(col).getCellType() == 2){
						this.setVisPlanCode("_FORMULA");
					} else if (row.getCell(col).getCellType() == 3) {
						this.setVisPlanCode("_BLANK");
					}else if(row.getCell(col).getCellType()== 4){
						this.setVisPlanCode("_BOOLEAN");
					}else if(row.getCell(col).getCellType()==5){
						this.setVisPlanCode("_ERROR");
				    }else{
						this.setVisPlanCode("CAN BE DATE");
				      }
				}else{
					this.setVisPlanCode("");
				}
                
				
				// 4.) Plan Description  6
				col = 6;
				if(row.getCell(col) != null){
					if (row.getCell(col).getCellType() == 0) {
						this.setVisPlanDesc( String.valueOf(row.getCell(col)
								.getNumericCellValue()));
					} else if (row.getCell(col).getCellType() == 1) {
						this.setVisPlanDesc(row.getCell(col).getStringCellValue());
					}else if(row.getCell(col).getCellType() == 2){
						this.setVisPlanCode("_FORMULA");
					} else if (row.getCell(col).getCellType() == 3) {
						this.setVisPlanDesc("_BLANK");
					}else if(row.getCell(col).getCellType()== 4){
						this.setVisPlanDesc("_BOOLEAN");
					}else if(row.getCell(col).getCellType()==5){
						this.setVisPlanDesc("_ERROR");
				    }else{
						this.setVisPlanDesc("CAN BE DATE");
				      }
				
				}else{
					this.setVisPlanDesc("");
				}
				
					
			    //5.)  Product type 8
				col = 8;
				if(row.getCell(col) != null){
					if (row.getCell(col).getCellType() == 0) {
						this.setVisProductType( String.valueOf(row.getCell(col)
								.getNumericCellValue()));
					} else if (row.getCell(col).getCellType() == 1) {
						this.setVisProductType(row.getCell(col).getStringCellValue());
					}else if(row.getCell(col).getCellType() == 2){
						this.setVisProductType("_FORMULA");
					} else if (row.getCell(col).getCellType() == 3) {
						this.setVisProductType("_BLANK");
					}else if(row.getCell(col).getCellType()== 4){
						this.setVisProductType("_BOOLEAN");
					}else if(row.getCell(col).getCellType()==5){
						this.setVisProductType("_ERROR");
				    }else{
						this.setVisProductType("CAN BE DATE");
				      }
				
				}else{
					this.setVisProductType("");
				}
				 
			     
			    // 6.) Transaction Type 9
				  col = 9;
				  if(row.getCell(col) != null){
					  if (row.getCell(col).getCellType() == 0) {
							this.setVisTransactionType( String.valueOf(row.getCell(col)
									.getNumericCellValue()));
						} else if (row.getCell(col).getCellType() == 1) {
							this.setVisTransactionType(row.getCell(col).getStringCellValue());
						}else if(row.getCell(col).getCellType() == 2){
							this.setVisTransactionType("_FORMULA");
						} else if (row.getCell(col).getCellType() == 3) {
							this.setVisTransactionType("_BLANK");
						}else if(row.getCell(col).getCellType()== 4){
							this.setVisTransactionType("_BOOLEAN");
						}else if(row.getCell(col).getCellType()==5){
							this.setVisTransactionType("_ERROR");
					    }else{
							this.setVisTransactionType("CAN BE DATE");
					      }
			      
				  }else{
					  this.setVisTransactionType("");
				  }
			      
			    
			    // 7.) Activation Date 12
				  col = 12;
			      if(row.getCell(col) != null){
			    	  
			    	  if (row.getCell(col).getCellType() == 0) {
					     Date strDate = row.getCell(col).getDateCellValue();
					     this.setVisActivationDate(String.valueOf(strDate));
					     
						} else if (row.getCell(col).getCellType() == 1) {
							this.setVisActivationDate("String 1 "+row.getCell(col).getStringCellValue());
						}else if(row.getCell(col).getCellType() == 2){
							this.setVisActivationDate("_FORMULA");
						} else if (row.getCell(col).getCellType() == 3) {
							this.setVisActivationDate("_BLANK");
						}else if(row.getCell(col).getCellType()== 4){
							this.setVisActivationDate("_BOOLEAN");
						}else if(row.getCell(col).getCellType()==5){
							this.setVisActivationDate("_ERROR");
					    }else{
							this.setVisActivationDate("Date: "+String.valueOf(row.getCell(col).getDateCellValue()));
					      }
				      
			      }else{
			    	  this.setVisActivationDate("");
			      }
			      
			      
			      // 8.) Service Number 15
			      col = 15;
			      if(row.getCell(col) != null){
			    	  if (row.getCell(col).getCellType() == Cell.CELL_TYPE_NUMERIC) {
						// force the current cell to String 
			    		  row.getCell(col).setCellType(Cell.CELL_TYPE_STRING);
			    		  
			    		  this.setVisServiceNumber( String.valueOf(row.getCell(col)
									.getStringCellValue()));
			    		  
						} else if (row.getCell(col).getCellType() == 1) {
							this.setVisServiceNumber(row.getCell(col).getStringCellValue());
						}else if(row.getCell(col).getCellType() == 2){
							this.setVisServiceNumber("_FORMULA");
						} else if (row.getCell(col).getCellType() == 3) {
							this.setVisServiceNumber("_BLANK");
						}else if(row.getCell(col).getCellType()== 4){
							this.setVisServiceNumber("_BOOLEAN");
						}else if(row.getCell(col).getCellType()==5){
							this.setVisServiceNumber("_ERROR");
					    }else{
							this.setVisServiceNumber("CAN BE DATE");
					      }
			      
			      }else{
			    	  this.setVisServiceNumber("");
			      }
			      
			      
			      // 9.) Customer Name 16
			      col = 16;
			      if(row.getCell(col) != null){
			    	  if (row.getCell(col).getCellType() == 0) {
							this.setVisCustomerName( String.valueOf(row.getCell(col)
									.getNumericCellValue()));
						} else if (row.getCell(col).getCellType() == 1) {
							this.setVisCustomerName(row.getCell(col).getStringCellValue());
						}else if(row.getCell(col).getCellType() == 2){
							this.setVisCustomerName("_FORMULA");
						} else if (row.getCell(col).getCellType() == 3) {
							this.setVisCustomerName("_BLANK");
						}else if(row.getCell(col).getCellType()== 4){
							this.setVisCustomerName("_BOOLEAN");
						}else if(row.getCell(col).getCellType()==5){
							this.setVisCustomerName("_ERROR");
					    }else{
							this.setVisCustomerName("CAN BE DATE");
					      }
				      
			      }else{
			    	  this.setVisCustomerName("");
			      }
			      
			      
			      // 10.) IMEI 18
			      col = 18;
			      if(row.getCell(col) != null){
			    	  if (row.getCell(col).getCellType() == Cell.CELL_TYPE_NUMERIC) {
							
			    		  
			    		    row.getCell(col).setCellType(Cell.CELL_TYPE_STRING);
							
							this.setVisIMEI(String.valueOf(row.getCell(col).getStringCellValue()));
							
						} else if (row.getCell(col).getCellType() == 1) {
							this.setVisIMEI("String : "+row.getCell(col).getStringCellValue());
						}else if(row.getCell(col).getCellType() == 2){
							this.setVisIMEI("_FORMULA");
						} else if (row.getCell(col).getCellType() == 3) {
							this.setVisIMEI("_BLANK");
						}else if(row.getCell(col).getCellType()== 4){
							this.setVisIMEI("_BOOLEAN");
						}else if(row.getCell(col).getCellType()==5){
							this.setVisIMEI("_ERROR");
					    }else{
							this.setVisIMEI("CAN BE DATE");
					      }
				      
			      }else{
			    	  this.setVisIMEI("");
			      }
			      
			      
			      // 11.) Deposit 23
			      col = 23;
			      if(row.getCell(col) != null){
			    	  if (row.getCell(col).getCellType() == 0) {
							this.setVisDeposit( String.valueOf(row.getCell(col)
									.getNumericCellValue()));
						} else if (row.getCell(col).getCellType() == 1) {
							this.setVisDeposit(row.getCell(col).getStringCellValue());
						}else if(row.getCell(col).getCellType() == 2){
							this.setVisDeposit("_FORMULA");
						} else if (row.getCell(col).getCellType() == 3) {
							this.setVisDeposit("_BLANK");
						}else if(row.getCell(col).getCellType()== 4){
							this.setVisDeposit("_BOOLEAN");
						}else if(row.getCell(col).getCellType()==5){
							this.setVisDeposit("_ERROR");
					    }else{
							this.setVisDeposit("CAN BE DATE");
					      }
			        
			      }else{
			    	  this.setVisDeposit("");
			      }
			      
			      
			      //12.)  Credit Class 24
			      col = 24; 
			      if(row.getCell(col) != null){
			    	  if (row.getCell(col).getCellType() == 0) {
							this.setVisCreditClass( String.valueOf(row.getCell(col)
									.getNumericCellValue()));
						} else if (row.getCell(col).getCellType() == 1) {
							this.setVisCreditClass(row.getCell(col).getStringCellValue());
						}else if(row.getCell(col).getCellType() == 2){
							this.setVisCreditClass("_FORMULA");
						} else if (row.getCell(col).getCellType() == 3) {
							this.setVisCreditClass("_BLANK");
						}else if(row.getCell(col).getCellType()== 4){
							this.setVisCreditClass("_BOOLEAN");
						}else if(row.getCell(col).getCellType()==5){
							this.setVisCreditClass("_ERROR");
					    }else{
							this.setVisCreditClass("CAN BE DATE");
					      }
			    	   
			      }else{
			    	  this.setVisCreditClass("");
			      }
			      			      
			      
			      // 13.) BAN 25
			      col =25;
			      if(row.getCell(col) != null){
			    	  
			    	  if (row.getCell(col).getCellType() == Cell.CELL_TYPE_NUMERIC) {
			    		  row.getCell(col).setCellType(Cell.CELL_TYPE_STRING);
							this.setVisBAN(row.getCell(col)
									.getStringCellValue());
							
						} else if (row.getCell(col).getCellType() == 1) {
							this.setVisBAN(row.getCell(col).getStringCellValue());
						}else if(row.getCell(col).getCellType() == 2){
							this.setVisBAN("_FORMULA");
						} else if (row.getCell(col).getCellType() == 3) {
							this.setVisBAN("_BLANK");
						}else if(row.getCell(col).getCellType()== 4){
							this.setVisBAN("_BOOLEAN");
						}else if(row.getCell(col).getCellType()==5){
							this.setVisBAN("_ERROR");
					    }else{
							this.setVisBAN("CAN BE DATE");
					      }
			    	  
			      }else{
			    	  this.setVisBAN("");
			      }
			      
			      
			      //14.) EBTV VOICE 26
			      col = 26;
			      if(row.getCell(col) != null){
			    	  if (row.getCell(col).getCellType() == 0) {
							this.setVisEBTVVoice( String.valueOf(row.getCell(col)
									.getNumericCellValue()));
						} else if (row.getCell(col).getCellType() == 1) {
							this.setVisEBTVVoice(row.getCell(col).getStringCellValue());
						}else if(row.getCell(col).getCellType() == 2){
							this.setVisEBTVVoice("_FORMULA");
						} else if (row.getCell(col).getCellType() == 3) {
							this.setVisEBTVVoice("_BLANK");
						}else if(row.getCell(col).getCellType()== 4){
							this.setVisBAN("_BOOLEAN");
						}else if(row.getCell(col).getCellType()==5){
							this.setVisEBTVVoice("_ERROR");
					    }else{
							this.setVisEBTVVoice("CAN BE DATE");
					      }
			    	  
			      }else{
			    	  this.setVisEBTVVoice("");
			      }
			      
			      
			      //15.) BTV Data 27
			      col = 27;
			      if(row.getCell(col) != null){
			    	  if (row.getCell(col).getCellType() == 0) {
							this.setVisBTVData( String.valueOf(row.getCell(col)
									.getNumericCellValue()));
						} else if (row.getCell(col).getCellType() == 1) {
							this.setVisBTVData(row.getCell(col).getStringCellValue());
						}else if(row.getCell(col).getCellType() == 2){
							this.setVisBTVData("_FORMULA");
						} else if (row.getCell(col).getCellType() == 3) {
							this.setVisBTVData("_BLANK");
						}else if(row.getCell(col).getCellType()== 4){
							this.setVisBTVData("_BOOLEAN");
						}else if(row.getCell(col).getCellType()==5){
							this.setVisBTVData("_ERROR");
					    }else{
							this.setVisBTVData("CAN BE DATE");
					      }
			      }else{
			    	  this.setVisBTVData("");
			      }
			      
			      //16.) MRC Reduced
			      col = 28;
			      if(row.getCell(col) != null){
			    	  if (row.getCell(col).getCellType() == 0) {
							this.setVisMRCReduced( String.valueOf(row.getCell(col)
									.getNumericCellValue()));
						} else if (row.getCell(col).getCellType() == 1) {
							this.setVisMRCReduced(row.getCell(col).getStringCellValue());
						}else if(row.getCell(col).getCellType() == 2){
							this.setVisMRCReduced("_FORMULA");
						} else if (row.getCell(col).getCellType() == 3) {
							this.setVisMRCReduced("_BLANK");
						}else if(row.getCell(col).getCellType()== 4){
							this.setVisMRCReduced("_BOOLEAN");
						}else if(row.getCell(col).getCellType()==5){
							this.setVisMRCReduced("_ERROR");
					    }else{
							this.setVisMRCReduced("CAN BE DATE");
					      }
			    	  
			      }else{
			    	  this.setVisMRCReduced("");
			      }
			      
			      
			      //17.)  Subsidy col 29
			      col = 29;
			      if(row.getCell(col) != null){
			    	  if (row.getCell(col).getCellType() == 0) {
							this.setVisSubsidy( String.valueOf(row.getCell(col)
									.getNumericCellValue()));
						} else if (row.getCell(col).getCellType() == 1) {
							this.setVisSubsidy(row.getCell(col).getStringCellValue());
						}else if(row.getCell(col).getCellType() == 2){
							this.setVisSubsidy("_FORMULA");
						} else if (row.getCell(col).getCellType() == 3) {
							this.setVisSubsidy("_BLANK");
						}else if(row.getCell(col).getCellType()== 4){
							this.setVisSubsidy("_BOOLEAN");
						}else if(row.getCell(col).getCellType()==5){
							this.setVisSubsidy("_ERROR");
					    }else{
							this.setVisSubsidy("CAN BE DATE");
					      }
			    	  
			      }else{
			    	  this.setVisSubsidy("");
			      }
			      
			      
			      //18.) EIP
			      col = 30;
			      if(row.getCell(col) != null){
			    	  if (row.getCell(col).getCellType() == 0) {
							this.setVisEIP( String.valueOf(row.getCell(col)
									.getNumericCellValue()));
						} else if (row.getCell(col).getCellType() == 1) {
							this.setVisEIP(row.getCell(col).getStringCellValue());
						}else if(row.getCell(col).getCellType() == 2){
							this.setVisEIP("_FORMULA");
						} else if (row.getCell(col).getCellType() == 3) {
							this.setVisEIP("_BLANK");
						}else if(row.getCell(col).getCellType()== 4){
							this.setVisEIP("_BOOLEAN");
						}else if(row.getCell(col).getCellType()==5){
							this.setVisEIP("_ERROR");
					    }else{
							this.setVisEIP("CAN BE DATE");
					      }
			    	  
			      }else{
			    	  this.setVisEIP("");
			      }
			      
		
			    	  System.out.println("Row : "+i);
			    	  System.out.println("Sales Code : "+this.getVisSalesCode());
		                 
		                 System.out.println("Montly Access : "+this.getVisMontlyAccess());
		                 
		                 System.out.println("Plan Code : "+this.getVisPlanCode());
		                 
		                 System.out.println("Plan Desc : "+this.getVisPlanDesc());
		                 
		                 System.out.println("Product Type : "+this.getVisProductType());
		                 
		                 System.out.println("Transaction Type : "+this.getVisTransactionType());
		                 
		                 System.out.println("Activation Date : "+this.getVisActivationDate());
		                 
		                 System.out.println("Service Number : "+this.getVisServiceNumber());
		            
		                 System.out.println("Customer Name : "+this.getVisCustomerName());
		                 
		                 System.out.println("IMEI : "+this.getVisIMEI());
		                 
		                 System.out.println("Deposit : "+this.getVisDeposit());
		                 
		                 System.out.println("Credit Class : "+this.getVisCreditClass());
		                 
		                 System.out.println("BAN : "+this.getVisBAN());
		                 
		                 System.out.println("EBTV Voice : "+this.getVisEBTVVoice());
		                 
		                 System.out.println("BTV Data : "+this.getVisBTVData());
		                 
		                 System.out.println("MRC Reduced : "+this.getVisMRCReduced());
		                 
		                 System.out.println("Subsidy : "+this.getVisSubsidy());
		                 
		                 System.out.println("EIP : "+this.getVisEIP());
		                 
		                 System.out.println("___________________________________________"); 
			      
                      
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

	
	public String getVisSalesCode() {
		return visSalesCode;
	}

	public void setVisSalesCode(String visSalesCode) {
		this.visSalesCode = visSalesCode;
	}

	public String getVisMontlyAccess() {
		return visMontlyAccess;
	}

	public void setVisMontlyAccess(String visMontlyAccess) {
		this.visMontlyAccess = visMontlyAccess;
	}

	public String getVisPlanCode() {
		return visPlanCode;
	}

	public void setVisPlanCode(String visPlanCode) {
		this.visPlanCode = visPlanCode;
	}

	public String getVisPlanDesc() {
		return visPlanDesc;
	}

	public void setVisPlanDesc(String visPlanDesc) {
		this.visPlanDesc = visPlanDesc;
	}

	public String getVisProductType() {
		return visProductType;
	}

	public void setVisProductType(String visProductType) {
		this.visProductType = visProductType;
	}

	public String getVisTransactionType() {
		return visTransactionType;
	}

	public void setVisTransactionType(String visTransactionType) {
		this.visTransactionType = visTransactionType;
	}

	public String getVisActivationDate() {
		return visActivationDate;
	}

	public void setVisActivationDate(String visActivationDate) {
		this.visActivationDate = visActivationDate;
	}

	public String getVisServiceNumber() {
		return visServiceNumber;
	}

	public void setVisServiceNumber(String visServiceNumber) {
		this.visServiceNumber = visServiceNumber;
	}

	public String getVisCustomerName() {
		return visCustomerName;
	}

	public void setVisCustomerName(String visCustomerName) {
		this.visCustomerName = visCustomerName;
	}

	public String getVisIMEI() {
		return visIMEI;
	}

	public void setVisIMEI(String visIMEI) {
		this.visIMEI = visIMEI;
	}

	public String getVisDeposit() {
		return visDeposit;
	}

	public void setVisDeposit(String visDeposit) {
		this.visDeposit = visDeposit;
	}

	public String getVisCreditClass() {
		return visCreditClass;
	}

	public void setVisCreditClass(String visCreditClass) {
		this.visCreditClass = visCreditClass;
	}

	public String getVisBAN() {
		return visBAN;
	}

	public void setVisBAN(String visBAN) {
		this.visBAN = visBAN;
	}

	public String getVisEBTVVoice() {
		return visEBTVVoice;
	}

	public void setVisEBTVVoice(String visEBTVVoice) {
		this.visEBTVVoice = visEBTVVoice;
	}

	public String getVisBTVData() {
		return visBTVData;
	}

	public void setVisBTVData(String visBTVData) {
		this.visBTVData = visBTVData;
	}

	public String getVisMRCReduced() {
		return visMRCReduced;
	}

	public void setVisMRCReduced(String visMRCReduced) {
		this.visMRCReduced = visMRCReduced;
	}

	public String getVisSubsidy() {
		return visSubsidy;
	}

	public void setVisSubsidy(String visSubsidy) {
		this.visSubsidy = visSubsidy;
	}

	public String getVisEIP() {
		return visEIP;
	}

	public void setVisEIP(String visEIP) {
		this.visEIP = visEIP;
	}
	
    public File getFile() {
		return file;
	}

	public void setFile(File file) {
		this.file = file;
	}


}
