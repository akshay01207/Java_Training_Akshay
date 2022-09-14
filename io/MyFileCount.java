package com.bhavna.io;

import java.io.File;
import java.io.FileInputStream;

//Write program to count total number of files and folders in perticular folder

public class MyFileCount { 
	public static void main(String[] args) { 
		try {

			int fin= new File("C://Java_io").listFiles().length;

			System.out.println("number="+fin);
			
		}catch(Exception e) {

			System.out.println(e);

		}

     }
}
