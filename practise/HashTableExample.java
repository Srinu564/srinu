package Collections;


import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;
public class HashTableExample {
	public static void main(String[] ar)
	{
	Hashtable<Integer,String> hm=new Hashtable<Integer,String>();  
	  
	  hm.put(100,"Amit");  
	  hm.put(102,"Ravi");  
	  hm.put(101,"Vijay");  
	  hm.put(103,"Rahul");  
	  
	  for(Map.Entry<Integer,String> m:hm.entrySet()){  
	   System.out.println(m.getKey()+" "+m.getValue());  
	  }  
}
}