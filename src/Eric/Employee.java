package Eric;

public class Employee {
	String employeename;
	String dept;
	String desig;
	static int id =0;
	Employee(){
		id++;
		System.out.println("Emp id is"+id);
		
	}

	public static void main(String[] args) {
		
		Employee e1=new Employee();
		Employee e2=new Employee();
		Employee e3=new Employee();
		// TODO Auto-generated method stub

	}

}
