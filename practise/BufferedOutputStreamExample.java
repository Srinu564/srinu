package FileHandling;

import java.io.*;  
public class BufferedOutputStreamExample{    
public static void main(String args[])throws Exception{    
     FileOutputStream fout=new FileOutputStream("testout1.txt");    
     BufferedOutputStream bout=new BufferedOutputStream(fout);    
     String s="Welcome to sample.";    
     byte b[]=s.getBytes();    
     bout.write(b);    
     bout.flush();    
     bout.close();    
     fout.close();    
     System.out.println("success");    
}    
}  
