package homework4;

/**
 * Created by home on 17.08.2016.
 */
public class Manager extends Employee {
    private Department subDep;

    public Manager(String type, String name, String surname, String patronymic, double salary, double balance, String department, boolean sex, Department subDep) {
        super(type, name, surname, patronymic, salary, balance, sex, department);
    }

    public double calculateSalary() {

        return getSalary() + subDep.getlistEmployeeOfDepartment().size() * 50;
    }

    public Department getSubDep() {
        return subDep;
    }

    public void setSubDep(Department subDep) {
        this.subDep = subDep;
    }
}
