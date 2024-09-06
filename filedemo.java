package com.file;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class filedemo {

	public static void main(String[] args) throws IOException {
  /*  File f=new File("demo.txt");
    if(f.exists()) {
    	System.out.println("file is already exists: "+f.getName());
    }else {
    	f.createNewFile();
    }
    File f1=new File("myproject/project");
    if(f1.mkdirs()) {
    	System.out.println("created");
    }else {
    	System.out.println("problem is in directories");
    }
   */
    //file Writer
    FileWriter fw=new FileWriter("hello.txt");
    fw.write("Hi\n");
    fw.write("who are you?\n");
    fw.write("I am sumesh from  V.S.B.CETC");
    fw.flush();
   
    ///filereader
    
    FileReader fr=new FileReader("hello.txt");
    int i=fr.read();
    System.out.println((char)i);
    while((i=fr.read())!=-1) {
    	System.out.print((char)i);
    }
    BufferedWriter bw=new BufferedWriter(fw);
    bw.write("poda ...da");
    bw.newLine();
    bw.write("seri da ...ni");
    System.out.println();
    System.out.println("done");
    
	}
}
