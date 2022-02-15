package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionOrderList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> studentlist=new ArrayList<>();
	studentlist.add(new Student("Hema",100,45.76f));
	studentlist.add(new Student("Ganesh",50,89.75f));
	studentlist.add(new Student("Shobha",10,35.78f));
	studentlist.add(new Student("Avani",60,78.78f));
	studentlist.add(new Student("Vijay",90,65.78f));
	studentlist.add(new Student("Bala",200,99.78f));
	
	System.out.println(studentlist);

	Collections.sort(studentlist);
	
	System.out.println(studentlist);
	
	Collections.sort(studentlist, new NameComparator());
	
	System.out.println(studentlist);
	
	Collections.sort(studentlist, new IdComparator());
	
	System.out.println(studentlist);
	}

}