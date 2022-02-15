package AbstractDemo;

abstract class Human
{
	public  abstract void eat();
	
	public void walk()
	{
		
	}
}
class man extends Human
{
	
	public   void eat()
	{
		
	}
}


public class AbstractEx {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human obj=new man();

}
}