package Collections;



import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			List<String> list=new LinkedList<>();
			list.add("Ten");
			list.add("Nine");
			list.add("eight");
			list.add("seven");
			list.add("six");
			
			list.add("Five");
			
			list.add("four");
			
			ListIterator<String> iterator=list.listIterator();
			while(iterator.hasNext())
			{
				System.out.println(iterator.next()+" "+iterator.nextIndex());
			}
			//iterator.next();
			iterator.add("end");
			System.out.println("----------------");
			while(iterator.hasPrevious())
			{
				System.out.println(iterator.previous()+" "+iterator.previousIndex());
			}
	}

}