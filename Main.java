package com.gmail.rezus;

import java.io.File;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
			MyFileFilter mFF = new MyFileFilter("docx", "pdf");
			File folder = new File("D:\\java\\java_books");
			File[] fileList = folder.listFiles(mFF);
			for (File file : fileList) { System.out.println(file); }
			}

	}


