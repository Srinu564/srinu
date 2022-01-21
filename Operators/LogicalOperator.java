package OperatorsEx;

public class LogicalOperator {
	int a = 100;
	int b = 200;
	int x = 200;
	int y = 10;
	int z = 8;
	int i = y&z;
	int j = y|z;
	
	Boolean c = (a>b) && (a!=b);   
	Boolean d = (a<b)&&(b==x);     
	Boolean e = (a<b)||(a==x);    
	Boolean f = (a!=b);           
    Boolean g = b==x;  			   
    
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//Creating a object logical for class LogicalOperator
		LogicalOperator logical = new LogicalOperator();
		
		System.out.println(logical.c);
		System.out.println(logical.d);
		System.out.println(logical.e);
		System.out.println(logical.f);
		System.out.println(logical.g);
		System.out.println(logical.i);
		System.out.println(logical.j);
		
	}

}
