package Collections;

public class Student implements Comparable{
	String name;
	int id;
	float marks;
	
	Student(String name, int id,float marks)
	{
		this.name=name;
		this.id=id;
		this.marks=marks;
	}
	public String toString()
	{
		return name+" "+id+" "+marks;
	}
	@Override
	public int compareTo(Object obj) {
		Student s1=(Student)obj;
		if(this.marks>s1.marks)
			return 1;
		else if(this.marks<s1.marks)
			return -1;
		else 
			return 0;
	}
	
	

}
