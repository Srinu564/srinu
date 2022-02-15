package StringPack;

public class StringMethodsex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String message="Hello welcome to java program";
		int length=message.length();
		System.out.println(length);
		
		char ch=message.charAt(10);
		System.out.println(ch);
		char[] dst=new char[message.length()];
		message.getChars(6,14,dst,0);
		System.out.println(String.valueOf(dst));
		
		
		String message2="Hello";
		if(message.equals(message2))
		{
			System.out.println("same");
		}else
			System.out.println("not same");
		
		
		
		String msg="Hello";
		int result=msg.compareTo(message2);
		System.out.println(result);
		
		System.out.println(message.startsWith("Hello"));
		
		System.out.println(message.endsWith("Hello"));
		System.out.println(msg.indexOf('e'));
		System.out.println(message2.lastIndexOf('l'));
		System.out.println(message.substring(6));
		System.out.println(message.substring(6,22));
		
		String fname="Edubridge";
		String lname="Student";
		String fullname=fname.concat(lname);
		System.out.println(fullname);
		
		String test="	massage";
		System.out.println(test.replace('a','e').toUpperCase());
		
		System.out.println(test.trim());
		
		String m="edubridge";
		char[] charArray=m.toCharArray();
		
		int vcount=0,ccount=0;
		for(char c : charArray)
		{
			if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
			{
				vcount++;
			}else
				ccount++;
		}
		System.out.println("vowels"+vcount+"	"+"consonents"+ccount);		
		
		boolean flag=true;
		String bstring=String.valueOf(flag);
		System.out.println(bstring);
		
		if(message.equalsIgnoreCase("Hello welcome to java program"))
		{
			System.out.println(true);
		}
		
	}

}
