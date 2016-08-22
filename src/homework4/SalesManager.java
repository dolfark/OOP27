package homework4;

/**
 * Created by home on 17.08.2016.
 */
public class SalesManager extends Employee {

    double sales;

    public SalesManager(String type, String name, String surname, String patronymic, double salary, double balance, String department, boolean sex, double sales) {
    super(type, name, surname, patronymic, salary, balance, sex, department);
    }

    public double calculateSalary (){
        return getSalary()+sales*0.3;
    }

    public double getSales() {
        return sales;
    }

    public void setSales(double sales) {
        this.sales = sales;
    }
}
