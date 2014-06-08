package com.emerge.TMobile.server.servlets;

import java.io.File;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;




import com.emerge.TMobile.server.VisParser;

public class UploadVisFileServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;
    private static final String TMP_DIR_PATH = "/tmp";
    private File tmpDir;
    private static final String DESTINATION_DIR_PATH ="/home/marvin/Documents/myTemp";
    private File destinationDir;
    
    public UploadVisFileServlet() {
 
    }
    

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
    	//parse VIS and save to mysql table
    	VisParser visParser = new VisParser();
    	visParser.setFile(new File("C:\\Users\\kev\\Downloads\\vis.xlsx"));
    	visParser.processVisXLSXFile();
    }
      
    
}