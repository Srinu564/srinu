package Collections;


import java.util.Iterator;
import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 //similar to arraylist but arraylist is 
		//not synchronized but vector is synchronized
			Vector<String> v=new Vector<String>();  
			v.add("Ayush");  
			v.add("Amit");  
			v.add("Ashish");  
			v.add("Garima");  
			Iterator<String> itr=v.iterator();  
			while(itr.hasNext()){  
			System.out.println(itr.next());  
			}  
	}
}