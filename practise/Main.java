package Collections;


import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size;
		int key;
		double value;
		HashMap<Integer,Double> hashmap=new HashMap<>();
		Scanner sn=new Scanner(System.in);
		System.out.println("enter the size of the hashmap");
		size=sn.nextInt();
		
		for(int i=0;i<size;i++) {
		System.out.println("enter the key and value");
		key=sn.nextInt();
		value=sn.nextDouble();
		hashmap.put(key,value);
		}
		
		double res=UserMainCode.calculateAverage(hashmap, size);
		System.out.println(res);
	}

}