package com.emerge.TMobile.server.servlets;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.commons.io.FilenameUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class UploadFileServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;
    private static final String TMP_DIR_PATH = "/tmp";
    private File tmpDir;
    private static final String DESTINATION_DIR_PATH ="/home/marvin/Documents/myTemp";
    private File destinationDir;
    
    public UploadFileServlet() {
 
    }
    

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    	File file = new File("/home/marvin/Documents/TMobile/vis.xlsx");
    	processExcelFile(file);
    	
    }
    
    
    
    
    private int processExcelFile(File file){
    	 
    	 
        int count = 0;
 
        try{
           
            // Create a workbook using the File System 
            Workbook myWorkBook  = WorkbookFactory.create(file);
 
            // Get the first sheet from workbook 
            Sheet mySheet = myWorkBook.getSheetAt(0);
 
            /** We now need something to iterate through the cells.**/
            Iterator<Row> rowIter = mySheet.rowIterator();
            while(rowIter.hasNext()){
 
                XSSFRow myRow = (XSSFRow) rowIter.next();
                Iterator<Cell> cellIter = myRow.cellIterator();
                while(cellIter.hasNext()){
 
                    XSSFCell myCell = (XSSFCell) cellIter.next();
                    //get cell index
                    System.out.println("Cell column index: " + myCell.getColumnIndex());
                    //get cell type
                    System.out.println("Cell Type: " + myCell.getCellType());
 
                    //get cell value
                    switch (myCell.getCellType()) {
                    case XSSFCell.CELL_TYPE_NUMERIC :
                        System.out.println("Cell Value: " + myCell.getNumericCellValue());
                        break;
                    case XSSFCell.CELL_TYPE_STRING:   
                        System.out.println("Cell Value: " + myCell.getStringCellValue());
                        break;
                    default:   
                        System.out.println("Cell Value: " + myCell.getRawValue());
                        break;   
                    }
                    System.out.println("---");
 
                    if(myCell.getColumnIndex() == 0 && 
                            !myCell.getStringCellValue().trim().equals("") &&
                            !myCell.getStringCellValue().trim().equals("Item Number")){
                        count++;
                    }
 
                }
 
            }
        }
        catch (Exception e){
            e.printStackTrace(); 
        }
 
        return count;
 
    }
    
}