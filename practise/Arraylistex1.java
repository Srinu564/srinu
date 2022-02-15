package listsex;

import java.util.*;

public class Arraylistex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list=new ArrayList();
		list.add("apple");
		list.add("banana");
		list.add(100);
		list.add("orange");
		list.add("apple");
		System.out.println(list);
		
		Iterator it=list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
			
		}
		
		for( Object s:list)
		{
			System.out.println(s);
			
		}
		
		list.add(5,"grapes");
		//list.add(it);
		list.remove(5);
		System.out.println(list);
		System.out.println(list.get(3));
		list.set(1,"grapes");
		System.out.println(list.contains("apple"));
		System.out.println(list);
		
		ArrayList list1=new ArrayList();
		list1.add(2);
		list1.add(22);
		list1.add(33);
		list1.add(5);
		list1.add(99);
		System.out.println(list1);
		list1.clone();
		System.out.println(list1);
		list.add(list1);
		System.out.println(list);
		
		Collections.sort(list1);
		for(Object s:list1)
		{
			System.out.println(s);
		}
		
	}

}
