package pone;

public class ContractEmployee extends Employee {

	
		
		int contractPeroid;
		int privillageLeaves;
		int working_days;
		void contractEmpInfo() {
			
			System.out.println("Contract employee Details :"+contractPeroid +"," +privillageLeaves+ ","+working_days );
		}
		public static void main(String[] args) {
			
			ContractEmployee emp =new ContractEmployee();
			
			emp.empId =2134;
			emp.empName="Raj";
			emp.salary =5000;
			emp.contractPeroid=30;
			emp.privillageLeaves=5000;
			emp.working_days=3000;
			emp.contractEmpInfo();
	}

		
}
