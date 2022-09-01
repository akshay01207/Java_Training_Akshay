package basicPrograms;

public class Employee {
	int eId;
	String name;
	double salary;
	static String company="BSIPL";
	private static int ctr=0;

	public Employee(int eId, String name, double salary) {
		this.eId=eId;
		this.name=name;
		this.salary=salary;

	}
	public void display() {
	    ctr++;
	    if(this.salary>50000.0)
	        System.out.println("eId  "+eId+"name  "+name+"salary  "+salary+"company  "+company);
	    else
	        System.out.println("salary less than 50 k");
	    
	}
	@SuppressWarnings("static-access")
	public void countObjects() {
	    System.out.println("count =="+this.ctr);
	}
	
}
