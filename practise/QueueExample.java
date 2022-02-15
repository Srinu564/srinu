package Collections;


import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExample {
	public static void main(String[] ar)
	{
		Queue<Integer> queue=new PriorityQueue<>();
		queue.add(new Integer(100));
		queue.add(new Integer(200));
		queue.add(new Integer(300));
		queue.add(new Integer(400));
		queue.add(new Integer(500));
		queue.offer(new Integer(23));
		queue.offer(new Integer(67));
		System.out.println(queue);
		queue.remove();
		queue.remove(new Integer(300));
			System.out.println(queue.element());
		queue.clear();
		//System.out.println(queue.remove());
		
		Iterator<Integer> itr=queue.iterator();
		
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
	}

}
