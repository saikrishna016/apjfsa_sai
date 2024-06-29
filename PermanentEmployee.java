package practise;

public class PermanentEmployee extends Employee{
    @Override //Methodoverriding
    void displayDetails() {
        super.displayDetails();
        System.out.println("Permanent Employee Details");
    }

    @Override //Methodoverriding
    void totalsalary() {
        super.totalsalary();
        System.out.println("Permanent Employee salary is = 100k");
    }
}
