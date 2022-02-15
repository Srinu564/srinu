package Collections;


import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class SimpleMapExample1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> map=new HashMap<>();//key and value pair
		map.put("username","abc@gmail.com");
		map.put("password","1234");
		map.put("company","edubridgeindia");
		map.put("company","silversoft");
		map.put("organization", "silversoft");
		map.put("one", null);
		map.put("two", null);
		
		//map.put(10,10000);
		
		Set<String> keys=map.keySet();
		
		System.out.println("keys**********"+keys);
		
		Collection<String> keyvalues=map.values();
		
		System.out.println("values&&&&&&&&&&"+keyvalues);
		
		System.out.println(map);
		
		
		Iterator iterator=keys.iterator();

System.out.println("-----------------------------");
		while(iterator.hasNext())//is there any more keys in the keys variable
		{
			System.out.println(iterator.next());//map.get("password")
		}
		
		
		Iterator it=keyvalues.iterator();
		
		System.out.println("-----------------------------");
		while(it.hasNext())//is there any more keys in the keys variable
		{
			System.out.println(it.next());//map.get("password")
		}
		
		Set<Map.Entry<String,String>> s = map.entrySet();
		
		for (Map.Entry<String, String> it1: s)
        {
		  if(it1.getKey().equals("username")) {
            // Using the getKey to get key of the it element
            // Using the getValue to get value of the it element
            System.out.println("key---> " + 
                       it1.getKey() + " value--->  " +  it1.getValue());
		  }
        }
		
		
		
	}

}


