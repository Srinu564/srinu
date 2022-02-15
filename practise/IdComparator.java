package Collections;

import java.util.Comparator;

public class IdComparator implements Comparator {

	@Override
	public int compare(Object ob1, Object ob2) {
		// TODO Auto-generated method stub
		Student s1=(Student)ob1;
		Student s2=(Student)ob2;
		if(s1.id>s2.id)
			return 1;
		else if(s1.id<s2.id)
			return -1;
		else
			return 0;
	}

}