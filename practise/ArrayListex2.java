package listsex;

import java.util.ArrayList;
import java.util.Iterator;


class Student
{
	int rollno;
	String name;
	int age;
public Student(int rollno,String name,int age )
	{
		this.rollno=rollno;
		this.name=name;
		this.age=age;
	}
	
}
public class ArrayListex2 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList list=new ArrayList();
		Student s1=new Student(10,"srinu",22);
		Student s2=new Student(20,"mahesh",20);
		Student s3=new Student(30,"ganesh",25);
		
		list.add(s1);
		list.add(s2);
		list.add(s3);
		
		Iterator it=list.iterator();
		while(it.hasNext());
		{
			Student st=(Student)it.next();
			System.out.println(st.rollno+" "+st.name+" "+st.age);;
		}
		
		
	}

}
