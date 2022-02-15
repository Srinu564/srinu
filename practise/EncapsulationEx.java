package Encapsulation;

public class EncapsulationEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Atm m=Atm.getInstance(10000.00);
			
			System.out.println(m.getBalance());
			m.withdraw(234.56);
	}

}