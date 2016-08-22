package homework4;

import java.util.Scanner;

/**
 * Created by home on 17.08.2016.
 */
public class Console {

    private Firm firm = new Firm("defalt", "defalt", 0.00);

    public Console(Firm firm) {
        this.firm = firm;
    }

    public void start() {

    }

    public void consolMenu() {
        Scanner in = new Scanner(System.in);
        System.out.println("Вы работаете с фирмой.");

        boolean check = true;

        while (check) {
            menuList();
            int action = in.nextInt();

            switch (action) {
                case 0:
                    setFirm();
                    break;

                case 1:
                    addEmployeeMenu();
                    break;

                case 2:
                    removeEmployeeMenu();

                    break;

                case 3:
                    setDepartmentForEmployeeMenu();
                    break;

                case 4:
                    firm.printListEmployees();
                    break;

                case 5:
                    firm.printListEmployeesSortedBySalary();
                    break;

                case 6:
                    firm.printListEmployeesSortedByName();
                    break;

                case 7:
                    System.out.println("Введите название отдела");
                    firm.printListEmployeesFromDep(in.next());
                    break;

                case 8:
                    System.out.println("Введите название отдела");
                    firm.printEmployeesFromDepSortedBySalary(in.next());
                    break;

                case 9:
                    System.out.println("Введите название отдела");
                    firm.printEmployeesFromDepSortedByName(in.next());
                    break;

                case 10:
                    firm.giveSalaryForAll();
                    break;

                case 12:
                    firm.printFirmInfo();
                    break;

                case 100:
                    check = false;
                    System.out.println("Вы закрыли программу");
                    break;
                case 99:
                    addDepartmentMenu();
                    break;

                default:
                    System.out.println("Неверный ввод");
                    break;
            }

        }

    }

    public void menuList() {
        System.out.println("Выберите действие");
        System.out.println("0 - Задать параметры фирмы");
        System.out.println("1 - Добавить сотрудника");
        System.out.println("2 - Уволить сотрудника");
        System.out.println("3 - Перевести сотрудника в другой отдел");
        System.out.println("4 - Получить список всех сотрудников фирмы");
        System.out.println("5 - Получить список всех сотрудников фирмы отсортированных по зарплате");
        System.out.println("6 - Получить список всех сотрудников фирмы отсортированных по фамилии");
        System.out.println("7 - Получить список всех сотрудников отдела");
        System.out.println("8 - Получить список всех сотрудников отдела отсортированных по зарплате");
        System.out.println("9 - Получить список всех сотрудников отдела отсортированных по фамилии");
        System.out.println("10 - Выплатить зарплату");
        System.out.println("12 - Вывести информацию о фирме");
        System.out.println("99 - Добавить департамент");
        System.out.println("100 - Выход");
    }

    public void setFirm() {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите название фирмы");
        firm.setName(in.next());
        System.out.println("Введите адресс");
        firm.setAdress(in.next());
        System.out.println("Введите баланс счета");
        firm.setAccount(in.nextDouble());
        System.out.println("Вы успешно создали фирму");
    }

    public void addEmployeeMenu() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите тип сотрудника: 1 - Worker, 2 - Manager, 3 - SalesManager");
        int typeSelect = in.nextInt();
        boolean sex;
        while (!(typeSelect==1 || typeSelect==2 || typeSelect==3)) {
            System.out.println("Вы неверно ввели тип. Повторите заново");
            typeSelect = in.nextInt();
        }
        String type;
        if (typeSelect==1){
            type = "Worker";
        } else if (typeSelect==2){
            type = "Manager";
        } else {
            type = "SalesManager";
        }
        System.out.println("Введите имя сотрудника");
        String nameEmpl = in.next();
        System.out.println("Введите фамилию сотрудника");
        String surname = in.next();
        System.out.println("Введите отчество сотрудника");
        String patronymic = in.next();
        System.out.println("Введите зарплату сотрудника");
        double salary = in.nextDouble();
        System.out.println("Введите баланс сотрудника");
        double balance = in.nextDouble();
        System.out.println("Введите пол сотрудника 1- муж. 0 - жен.");
        sex = true;
        int sexIn = in.nextInt();
        while (!(sexIn == 1 || sexIn == 0)) {
            System.out.println("Вы неверно ввели пол. Повторите заново");
            sexIn = in.nextInt();
        }

        if (sexIn == 1) {
            sex = true;
        } else if (sexIn == 0) {
            sex = false;
        }

        System.out.println("Введите отдел сотрудника");
        String department = in.next();
        if (type.equals("Worker")) {
            Employee employee = new Worker(type, nameEmpl, surname, patronymic, salary, balance, sex, department);
            if (firm.addEmployee(employee)) {

                System.out.println("Вы успешно добавили сотрудника");
            } else {
                System.out.println("Сотрудник не добавлен");
            }
        } else if (type.equals("Manager")) {
            System.out.println("Введите подчиненный департмент из списка");
            System.out.println(firm.getListOfDepartment().toString());
            String subDep = in.next();

            for (Department d : firm.getListOfDepartment()) {
                if (d.getNameDep().equals(subDep)) {

                    Employee employee = new Manager(type, nameEmpl, surname, patronymic, salary, balance, department, sex, d);
                    if (firm.addEmployee(employee)) {
                        System.out.println("Вы успешно добавили сотрудника");
                    } else {
                        System.out.println("Сотрудник не добавлен");
                    }
                }
            }


        } else {
            System.out.println("Введите начальные продажи");
            double sales = in.nextDouble();
            Employee employee = new SalesManager(type, nameEmpl, surname, patronymic, salary, balance, department, sex, sales);
            if (firm.addEmployee(employee)) {
                System.out.println("Вы успешно добавили сотрудника");
            } else {
                System.out.println("Сотрудник не добавлен");
            }
        }


    }

    public void removeEmployeeMenu() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите имя сотрудника");
        String nameEmplFire = in.next();
        System.out.println("Введите фамилию сотрудника");
        String surnameEmplFire = in.next();
        System.out.println("Введите отчество сотрудника");
        String patronicEmplFire = in.next();
        firm.fireEmployee(nameEmplFire, surnameEmplFire, patronicEmplFire);
        if (firm.fireEmployee(nameEmplFire, surnameEmplFire, patronicEmplFire)) {
            System.out.println("Вы успешно уволили сотрудника.");
        } else {
            System.out.println("Сотрудник не уволен");
        }
    }

    public void setDepartmentForEmployeeMenu() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите имя сотрудника");
        String nameEmplsetDep = in.next();
        System.out.println("Введите фамилию сотрудника");
        String surnameEmplsetDep = in.next();
        System.out.println("Введите отчество сотрудника");
        String patronicEmplsetDep = in.next();
        System.out.println("Введите название отдела");
        String nameDepartment = in.next();
        if (firm.setDepartmentForEmployee(nameEmplsetDep, surnameEmplsetDep, patronicEmplsetDep, nameDepartment)) {
            System.out.println("Сотрудник переведен в новый отдел " + nameDepartment);
        } else {
            System.out.println("Сотрудник не переведен. Попробуйте снова");
        }
    }


    public void addDepartmentMenu (){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите название отдела");
        String nameDepartment = in.next();
        Manager employeeDefalt = new Manager("defalt", "defalt", "defalt", "defalt", 0.0, 0.0, "defalt", true, null);
        Department department = new Department(nameDepartment, employeeDefalt);
        firm.addDepartment(department);

    }


}
