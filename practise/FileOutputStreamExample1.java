package FileHandling;

import java.io.FileOutputStream;  
public class FileOutputStreamExample1{  
    public static void main(String args[]){    
           try{    
             FileOutputStream fout=new FileOutputStream("testout.txt");    
             String s="Welcome to sample. this is a program";    
             byte b[]=s.getBytes();//converting string into byte array    
             fout.write(b);    
             fout.close();    
             System.out.println("success...");    
            }
           catch(Exception e)
           {
            	System.out.println(e);
            	
           }    
      }    
}  
