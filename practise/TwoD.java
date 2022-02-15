package interfacepack;


abstract class TwoD{
	String shapecolor;
	int a,b,c,d;
	
	public TwoD(String shapecolor,int a){
		this.shapecolor=shapecolor;
		this.a=a;
	}

	public void TwoDString (String shapecolor,int a,int b){
		this.shapecolor=shapecolor;
		this.a=a;
		this.b=b;
	}
	public void TwoDString (String shapecolor,int a,int b,int c){
		this.shapecolor=shapecolor;
		this.a=a;
		this.b=b;
		this.c=c;
	}
	public void TwoDString (String shapecolor,int a,int b,int c,int d){
		this.shapecolor=shapecolor;
		this.a=a;
		this.b=b;
		this.c=c;
		this.d=d;
	}

	@Override
	public String toString() {
		return "TwoD [shapecolor=" + shapecolor + ", a=" + a + ", b=" + b + ", c=" + c + ", d=" + d + "]";
	}
	
}

