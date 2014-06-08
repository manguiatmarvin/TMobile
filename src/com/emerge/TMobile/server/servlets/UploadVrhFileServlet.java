package com.emerge.TMobile.server.servlets;
import java.io.File;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.emerge.TMobile.server.VRHParser;

public class UploadVrhFileServlet extends HttpServlet{

	
	public UploadVrhFileServlet(){
		
	}
	
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
    	//parse VIS and save to mysql table
    	VRHParser vrhParser = new VRHParser();
    	vrhParser.setFile(new File("C:\\Users\\kev\\Downloads\\vrh.xlsx"));
    	vrhParser.processVrhXLSXFile();
    }
}
