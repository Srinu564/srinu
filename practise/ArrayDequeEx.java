package Collections;


import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deque<Double> deque=new ArrayDeque<>();
		deque.add(765.67);
		deque.add(100.87);
		
		deque.addFirst(34.74);
		deque.addLast(78.90);
		System.out.println(deque);
		deque.remove();
		deque.remove(100.87);
		deque.removeFirst();
		System.out.println(deque);
	}

}
