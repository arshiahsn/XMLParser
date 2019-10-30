import java.util.ArrayList;
import java.util.List;

public class Company {
    private List<Employee> employeeList;
    public Company(ArrayList employeeList_){
        employeeList = employeeList_;
    }

    @Override
    public String toString(){
        StringBuilder str = new StringBuilder();
        for(Employee employee : employeeList){
            str.append("=======================\n");
            str.append(employee.getFirstName()+"\n");
            str.append(employee.getLastName()+"\n");
            str.append(employee.getPerk()+"\n");
            str.append(employee.getSalary()+"\n");

        }

        return str.toString();
    }
}
