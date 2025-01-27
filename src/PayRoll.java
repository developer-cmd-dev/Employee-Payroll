import java.util.ArrayList;
import java.util.List;


public class PayRoll {
    private List<Employee> employeeList ;

    public PayRoll() {
        employeeList = new ArrayList<>();
    }

    public void  addEmployee(Employee employee){
       employeeList.add(employee);

    }

    public void removeEmployee(int id){
        Employee employeeToRemove = null;
        for(Employee employee:employeeList){
            if(employee.getId() == id){
                employeeList.remove(employee);
                break;
            }
        }
    }

    public void displayEmployees(){
        for(Employee employees:employeeList){
            System.out.println(employees);
        }
    }


}
