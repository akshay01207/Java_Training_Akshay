package com.bhavna.io;

import java.io.File;

class MyFileCreated {
public static void main(String[] args) {

 // create a file object for the current location
 File file = new File("C://JavaFile.java/ak.txt");

 try {

   // create a new file with name specified
   // by the file object
   boolean value = file.createNewFile();
   if (value) {
     System.out.println("New Java File is created.");
   }
   else {
     System.out.println("Not Exist.");
   }
 }
 catch(Exception e) {
   e.getStackTrace();
 }
}
}
