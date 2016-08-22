package homework4;

/**
 * Created by home on 17.08.2016.
 */
public abstract class  Employee {
    private String type;
    private String name;
    private String surname;
    private String patronymic;
    private double salary;
    private double balance;
    private boolean sex;
    private String department;

    Employee (){

    }

    public Employee(String type, String name, String surname, String patronymic, double salary, double balance, boolean sex, String department) {
        this.type = type;
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.salary = salary;
        this.balance = balance;
        this.sex = sex;
        this.department = department;

    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void getSex() {
        this.sex = sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

}
