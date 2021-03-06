
package homework4;

import java.util.ArrayList;

/**
 * Created by home on 17.08.2016.
 */
public class Firm {

    private String name;
    private String adress;
    private double account;
    private ArrayList<Employee> listEmployees = new ArrayList<Employee>();
    private ArrayList<Department> listOfDepartment = new ArrayList<>();

    Firm(String name, String adress, double account) {
        this.name = name;
        this.adress = adress;
        this.account = account;
        this.listEmployees = new ArrayList<Employee>();
        this.listOfDepartment = new ArrayList<Department>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public double getAccount() {
        return account;
    }

    public void setAccount(double account) {
        this.account = account;
    }

    public ArrayList<Employee> getListEmployees() {
        return listEmployees;
    }

    public void setListEmployees(ArrayList<Employee> listEmployees) {
        this.listEmployees = listEmployees;
    }

    public ArrayList<Department> getListOfDepartment() {
        return listOfDepartment;
    }

    public void setListOfDepartment(ArrayList<Department> listOfDepartment) {
        this.listOfDepartment = listOfDepartment;
    }

    public boolean addEmployee(Employee employee) {

        for (Employee e : listEmployees) {
            if (e.getName().equals(employee.getName()) && e.getSurname().equals(employee.getSurname()) && e.getPatronymic().equals(employee.getPatronymic())) {
                return false;
            }
        }

        this.listEmployees.add(employee);
        return true;
    }

    public boolean fireEmployee(String name, String surname, String patronymic) {

        for (int i = 0; i < listEmployees.size(); i++) {
            if (listEmployees.get(i).getName().equals(name) && listEmployees.get(i).getSurname().equals(surname) && listEmployees.get(i).getPatronymic().equals(patronymic)) {
                listEmployees.remove(i);
                return true;
            }
        }


        return false;
    }

    public boolean addDepartment(Department department) {

        for (Department d : listOfDepartment) {
            if (d.getNameDep().equals(department)) {
                return false;
            }
        }

        this.listOfDepartment.add(department);

        return true;
    }

    public boolean removeDepartment(String depName) {

        for (int i = 0; i < listEmployees.size(); i++) {
            if (listOfDepartment.get(i).getNameDep().equals(depName)) {
                listOfDepartment.remove(i);
                return true;
            }
        }
        return false;
    }

    public void updateListOfEmployeeInDepartment(ArrayList<Employee> listEmployees) {

        for (Employee e : listEmployees) {
            for (Department d : listOfDepartment) {
                d.getlistEmployeeOfDepartment().clear();
            }
            for (Department d : listOfDepartment) {
                if (e.getDepartment().equals(d.getNameDep())) {
                    d.addEmployeeToDepartment(e);
                }
            }

        }
    }

    public void giveSalaryForAll() {
        for (int i = 0; i < listEmployees.size(); i++) {
            if (this.account > listEmployees.get(i).getSalary()) {
                this.account -= listEmployees.get(i).getSalary();
                listEmployees.get(i).setBalance(listEmployees.get(i).getBalance() + listEmployees.get(i).getSalary());

            } else {

                listEmployees.get(i).setBalance(listEmployees.get(i).getBalance() + this.account);
                this.account = 0;

            }
        }
        System.out.println("Выплачено зарплату. Остаток на счету фирмы " + this.account);
    }

    public void printListEmployees() {
        ArrayList<Employee> listEmployees = getListEmployees();
        printList(listEmployees);
    }

    public void printListEmployeesSortedBySalary() {
        ArrayList<Employee> listEmployees = getAllEmployeesOrderedBySalary();
        printList(listEmployees);
    }

    public void printFirmInfo() {
        System.out.println("Фирма: " + name + " " + adress + " " + account);

    }

    public boolean setDepartmentForEmployee(String name, String surname, String patronymic, String departmentName) {

        for (int i = 0; i < listEmployees.size(); i++) {
            if (listEmployees.get(i).getName().equals(name) && listEmployees.get(i).getSurname().equals(surname) && listEmployees.get(i).getPatronymic().equals(patronymic)) {
                listEmployees.get(i).setDepartment(departmentName);
                return true;
            }
        }
        return false;


    }

    public ArrayList<Employee> getAllEmployeesSortedByName() {
        Employee tmpMaxSalary;
        ArrayList<Employee> listEmployees = getAllEmployees();

        for (int i = 0; i < listEmployees.size(); i++) {

            for (int j = 0; j < listEmployees.size() - 1; j++) {

                if (listEmployees.get(j).getSurname().charAt(0) > listEmployees.get(j + 1).getSurname().charAt(0)) {

                    tmpMaxSalary = listEmployees.get(j);
                    listEmployees.set(j, listEmployees.get(j + 1));
                    listEmployees.set(j + 1, tmpMaxSalary);

                }
            }
        }
        return listEmployees;
    }

    public void printListEmployeesSortedByName() {
        ArrayList<Employee> listEmployees = getAllEmployeesSortedByName();
        printList(listEmployees);
    }

    public ArrayList<Employee> getEmployeesFromDep(String departmentName) {
        ArrayList<Employee> listEmployees = getAllEmployees();
        ArrayList<Employee> listEmployeesFromDep = new ArrayList<Employee>();

        for (int i = 0; i < listEmployees.size(); i++) {
            if (listEmployees.get(i).getDepartment().equals(departmentName)) {
                listEmployeesFromDep.add(listEmployees.get(i));
            }
        }

        return listEmployeesFromDep;

    }

    public void printListEmployeesFromDep(String departmentName) {
        System.out.println("Отдел " + departmentName);
        ArrayList<Employee> listEmployees = getEmployeesFromDep(departmentName);
        printList(listEmployees);
    }

    public void printList(ArrayList<Employee> listEmployees) {

        for (int i = 0; i < listEmployees.size(); i++) {
            System.out.printf(
                    "Employee "
                            + "Name: %-10s Surname: %-10s Surname: %-10s Salary: %-8.2f Balance: %-8.2f Department: %-10s\n",

                    listEmployees.get(i).getName(), listEmployees.get(i).getSurname(), listEmployees.get(i).getPatronymic(), listEmployees.get(i).getSalary(),
                    listEmployees.get(i).getBalance(),
                    listEmployees.get(i).getDepartment());

        }
        System.out.println("==========================================================");


    }

    public ArrayList<Employee> getAllEmployees() {
        return new ArrayList<Employee>(listEmployees);

    }

    public ArrayList<Employee> getAllEmployeesOrderedBySalary() {
        Employee tmpMaxSalary;
        ArrayList<Employee> listEmployees = getAllEmployees();

        for (int i = 0; i < listEmployees.size(); i++) {

            for (int j = 0; j < listEmployees.size() - 1; j++) {

                if (listEmployees.get(j).getSalary() > listEmployees.get(j + 1).getSalary()) {

                    tmpMaxSalary = listEmployees.get(j);
                    listEmployees.set(j, listEmployees.get(j + 1));
                    listEmployees.set(j + 1, tmpMaxSalary);

                }
            }
        }
        return listEmployees;
    }

    public ArrayList<Employee> getEmployeesFromDepSortedBySalary(String departmentName) {
        ArrayList<Employee> listEmployees = getAllEmployeesOrderedBySalary();
        ArrayList<Employee> listEmployeesFromDepSortedBySalary = new ArrayList<>();

        for (int i = 0; i < listEmployees.size(); i++) {
            if (listEmployees.get(i).getDepartment().equals(departmentName)) {
                listEmployeesFromDepSortedBySalary.add(listEmployees.get(i));
            }
        }

        return listEmployeesFromDepSortedBySalary;
    }

    public void printEmployeesFromDepSortedBySalary(String departmentName) {
        System.out.println("Отдел и сотрудники по зарплате " + departmentName);
        printList(getEmployeesFromDepSortedBySalary(departmentName));

    }

    public ArrayList<Employee> getEmployeesFromDepSortedByName(String departmentName) {

        Employee tmpMaxSalary;
        ArrayList<Employee> listEmployees = getEmployeesFromDep(departmentName);

        for (int i = 0; i < listEmployees.size(); i++) {

            for (int j = 0; j < listEmployees.size() - 1; j++) {

                if (listEmployees.get(j).getSurname().charAt(0) > listEmployees.get(j + 1).getSurname().charAt(0)) {

                    tmpMaxSalary = listEmployees.get(j);
                    listEmployees.set(j, listEmployees.get(j + 1));
                    listEmployees.set(j + 1, tmpMaxSalary);

                }
            }
        }
        return listEmployees;

    }

    public void printEmployeesFromDepSortedByName(String departmentName) {
        ArrayList<Employee> listEmployees = getEmployeesFromDepSortedBySalary(departmentName);
        printList(listEmployees);

    }


    void sellFor10() {

    }




}
