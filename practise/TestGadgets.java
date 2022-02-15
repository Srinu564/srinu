package interfacepack;

public class TestGadgets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ElectronicGadgets eg=new ElectronicGadgets();
		ElectronicGadgets eg;
		eg=new Computer();
		eg.on();
		eg.off();
		
		eg=new Television();
		
		eg.on();
		eg.off();
		

	}

}
