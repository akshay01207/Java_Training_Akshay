package com.bhavna.exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Scanner;



public class MergeTwoFile {
    public void merging() throws IOException, InterruptedException{
        try {
        	
        	Thread.sleep(1000);
        	
            File file=new File("C://Java_io/ak.txt");
            File file2=new File("C://Java_io/ak2.txt");
            if(file.exists()&&file.isFile()) {
                FileReader reader=new FileReader(file);
                FileReader reader2=new FileReader(file2);
                FileWriter writer=new FileWriter("C://Java_io/merge.txt",true);
                
                 Scanner Reader = new Scanner(file);
                 Scanner Reader2 = new Scanner(file2);
                    while (true) {
                        int i=reader.read();
                        int j=reader2.read();
                        if(i==-1&&j==-1)
                            break;
                        
                       writer.write(i);
                       writer.write(j);
                       System.out.print((char)i);
                       System.out.print((char)j);
//                       writer.close();
                    }
               
                       writer.close();
            }else {
                System.out.println("file doesnt exist");
            }
            
        }catch(FileNotFoundException | InterruptedIOException e) {
            e.printStackTrace();
        }
    }



}
