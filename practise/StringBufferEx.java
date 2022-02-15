package StringPack;

public class StringBufferEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer buffer=new StringBuffer("Hello Hi How are you");
		
		//int len=buffer.length();
		buffer.append('?');
		buffer.insert(5,'!');
		buffer.insert(9, ',');
		buffer.insert(14, 78.8f);
		
		System.out.println(buffer);

	}

}

