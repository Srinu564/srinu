
public class ChArray {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			char[] c = new char[26] ;
			for(int i=0; i<c.length; i++)
			{
				c[i]=(char)('a'+i);
			}
			for(char display : c) {
				System.out.print(display+" ");
			}
		
		}

	

}
