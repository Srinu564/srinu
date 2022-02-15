package FileHandling;

//import java.io.Console;  
/*class ReadStringTest{    
public static void main(String args[]){    
Console c=System.console();    
System.out.println("Enter your name: ");    
String n=c.readLine();    
System.out.println("Welcome "+n);    
}    
}*/  
 
/*public static void main(String args[]) throws NullPointerException

{    
Console c=System.console();    
System.out.println("Enter password: ");    
char[] ch=c.readPassword();    
String pass=String.valueOf(ch);//converting char array into string    
System.out.println("Password is: "+pass);    
}   */
	
	
	import java.io.FileOutputStream;  
	public class  ReadStringTest {  
	    public static void main(String args[]) throws Exception{    
	           try{    
	             FileOutputStream fout=new FileOutputStream("testout.txt");     
	             fout.write(97);
	             fout.close();    
	             System.out.println("success...");    
	            }catch(Exception e){System.out.println(e);}    
	      }    
	}  

 
