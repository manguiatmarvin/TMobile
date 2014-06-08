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
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.emerge.TMobile.server.VisParser;

public class UploadFileServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;
    private static final String TMP_DIR_PATH = "/tmp";
    private File tmpDir;
    private static final String DESTINATION_DIR_PATH ="/home/marvin/Documents/myTemp";
    private File destinationDir;
    
    public UploadFileServlet() {
 
    }
    

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
    	//parse VIS and save to mysql table
    	VisParser visParser = new VisParser();
    	visParser.setFile(new File("C:\\Users\\kev\\Downloads\\vis.xlsx"));
    	visParser.processVisXLSXFile();
    }
      
    
}