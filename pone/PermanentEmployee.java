package pone;

public class PermanentEmployee extends Employee {
 
	int leaves;
	int bonus;
	int pf;
	  public PermanentEmployee(int id ,String n, int s ,int l, int b, int p) {
		   
		  super(id,n,s);
		  leaves=l;
		   bonus =b;
		   pf =p;
		   
		   System.out.println("permanent Employee object created");
	  }
	
	
	void permanentEmpInfo() {
		System.out.println("Permanent employee Details :"+leaves+", "+ bonus +","+pf );
	}
	public static void main(String[] args) {
		PermanentEmployee emp =new PermanentEmployee( 112 ,"sai" ,4000,20, 3000, 300);
		/*emp.empId=1122;
		emp.empName="Raj";
		emp.salary =5000;
		emp.leaves=30;
		emp.bonus=5000;
		emp.pf=3000;*/
        emp.permanentEmpInfo();
        
	}

}
