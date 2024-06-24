package pone;

public class Employee  {

    int empId;
    String empName;
    int salary;

    // default Constructor
    Employee() {
        System.out.println("Employee Object Created");
    }
    //parameterized Construcor
    Employee(int id,String n,int s){
    	 empId=id;
         empName=n;
         salary=s;
	
    }
void empInfo() {
	System.out.println("Employee Details:"+empId+ "\n Name:"+empName+ "\n Salary " + salary);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
