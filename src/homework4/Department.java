package homework4;

import java.util.ArrayList;

/**
 * Created by home on 17.08.2016.
 */
public class Department {
    private String nameDep;
    private ArrayList <Employee> listEmployeeOfDepartment = new ArrayList <>();
    private Employee manager;

    public Department (String nameDep,  Employee manager){
        this.nameDep = nameDep;
        this.listEmployeeOfDepartment = listEmployeeOfDepartment;
        this.manager = manager;
    }

    public String getNameDep() {
        return nameDep;
    }

    public void setNameDep(String nameDep) {
        this.nameDep = nameDep;
    }

    public ArrayList<Employee> getlistEmployeeOfDepartment() {
        return listEmployeeOfDepartment;
    }

    public void setlistEmployeeOfDepartment(ArrayList<Employee> listEmployeeOfDepartment) {
        this.listEmployeeOfDepartment = listEmployeeOfDepartment;
    }

    public Employee getManager() {
        return manager;
    }

    public void setManager(Employee manager) {
        this.manager = manager;
    }

    public boolean addEmployeeToDepartment (Employee employee){
        listEmployeeOfDepartment.add(employee);
        return true;

        }

}
