package FunctionsEx;

public class EmployeeDetails {

	//employee member varialbles
		int empId;
		String empName;
		float Salary;
		String empDesg;

	//member functions
	public void readData()
	{
		empId=2233;
		empName="Srinu";
		Salary=15000f;
		empDesg="project engineer";
	}
	public void writeData()
	{
		System.out.println(empId+" "+empName+" "+Salary+" "+empDesg);
		
	}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			//creating reference variable for emploee
			EmployeeDetails emp;
			//creating an object and assign values
			emp=new EmployeeDetails();
			emp.readData();
			emp.writeData();
			
			

		}
	}


