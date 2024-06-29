package practise;

public class ContractEmployee extends PermanentEmployee{
    @Override //Methodoverriding
    void displayDetails() {
        super.displayDetails();
        System.out.println("Contract Employee Details");
    }

    @Override //Methodoverriding
    void totalsalary() {
        super.totalsalary();
        System.out.println("Contract Employee salary is = 10k");
    }

    public static void main(String args[]) {
        ContractEmployee cemp = new ContractEmployee();
        cemp.displayDetails();
        cemp.totalsalary();
    }
}

