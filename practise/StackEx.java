package Collections;

import java.util.Iterator;
import java.util.Stack;

public class StackEx {
	

	public static void main(String[] a) {

	Stack<String> stack = new Stack<String>();  
	stack.push("Ayush");  
	stack.push("Garvit");  
	stack.push("Amit");  
	stack.push("Ashish");  
	stack.push("Garima");  
	stack.pop(); 
	stack.push("end");
	String str=stack.elementAt(2);
	System.out.println("************"+str);
	Iterator<String> itr=stack.iterator();  
	while(itr.hasNext()){  
	System.out.println(itr.next());  
	}

}
}
