package homework3;

import java.util.ArrayList;

/**
 * Created by home on 14.08.2016.
 */
public class Department {

    //    - Название отдела
//    - Список сотрудников в отделе
//    - Менеджер отдела
    private String nameDep;
    private ArrayList<Employee> listEmployeesDep = new ArrayList<Employee>();
    private String managerName;

    Department (String nameDep, String managerName){
        this.nameDep = nameDep;
        this.listEmployeesDep = new ArrayList<>();
        this.managerName = managerName;

    }

    public ArrayList<Employee> getListEmployeesDep() {
        return listEmployeesDep;
    }

    public void setListEmployeesDep(ArrayList<Employee> listEmployeesDep) {
        this.listEmployeesDep = listEmployeesDep;
    }

    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }

    public String getNameDep() {
        return nameDep;
    }

    public void setNameDep(String nameDep) {
        this.nameDep = nameDep;
    }
}
