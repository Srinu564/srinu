package FileHandling;


import java.io.*;    
class Input1{    
  public static void main(String args[])throws Exception{    
   FileInputStream fin1=new FileInputStream("demo.txt");    
   FileInputStream fin2=new FileInputStream("newfile.txt");    
   FileOutputStream fout=new FileOutputStream("testout.txt");      
   SequenceInputStream sis=new SequenceInputStream(fin1,fin2);    
   int i;    
   while((i=sis.read())!=-1)    
   {    
     fout.write(i); 
     System.out.print((char)i);
   }    
   sis.close();    
   fout.close();      
   fin1.close();      
   fin2.close(); 
   System.out.println();
   System.out.println("Success..");  
  }    
}    
