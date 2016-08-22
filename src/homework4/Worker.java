package homework4;

/**
 * Created by home on 17.08.2016.
 */
public class Worker extends Employee {

    public Worker (){

    }

    public Worker(String type, String name, String surname, String patronymic, double salary, double balance, boolean sex, String department) {
        super (type, name, surname, patronymic, salary, balance, sex, department);


    }

    public double culculateSalary (){
        return getSalary();
    }
}
