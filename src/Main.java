//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        PayRoll payRollSystem = new PayRoll();
        FullTimeEmployee emp1 = new FullTimeEmployee("Dev kumar",4522,50000);
        PartTimeEmployee emp2 = new PartTimeEmployee("Naman Mandal",4523,5,4000);
        payRollSystem.addEmployee(emp1);
        payRollSystem.addEmployee(emp2);
        payRollSystem.displayEmployees();
        payRollSystem.removeEmployee(4522);
        payRollSystem.displayEmployees();


    }
}