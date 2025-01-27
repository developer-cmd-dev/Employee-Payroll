import java.util.ArrayList;
import java.util.List;

public class PayRoll {
    private List<Employee> employees;

    public PayRoll() {
        employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee){
        employees.add(employee);
    }

    public void removeEmployee(int id){
        Employee employeeToRemove = null;
        for(Employee employee:employees){
            if(employee.getId() == id){
                employees.remove(employee);
            }
        }
    }


}
