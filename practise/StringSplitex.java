package StringPack;

public class StringSplitex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String message="Bangalore mangalore Delhi Caluctta";
		String[] cities=message.split(" ");// , . \ /
		for(String str:cities)
		{
			if(str.endsWith("e"))
			System.out.println(str);
			
		}
		/*String msg="AA/bb";
		String[] str=msg.split("/");
		
		
		int l=buffer.length();
		char ch=buffer.charAt(10);
		System.out.println(ch);
		char[] c=new char[buffer.length()];
		if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
		{
			buffer.delete(l, ch);
			System.out.println(c);
		}*/
	}

}
