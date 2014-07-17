package com.emerge.TMobile.shared;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class sqlWritter extends PrintWriter{

	public sqlWritter(File file) throws FileNotFoundException {
		super(file);
		// TODO Auto-generated constructor stub
	}

}
