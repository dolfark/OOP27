package homework3;

import java.util.Scanner;

/**
 * Created by home on 09.08.2016.
 */
public class Console {

    Firm firm;

    public Console(Firm firm) {
        this.firm = firm;
    }

    public void start() {

    }

    public void consolMenu() {
        Scanner in = new Scanner(System.in);
        System.out.println("Вы работаете с фирмой.");

        boolean check = true;
        Firm firm1 = new Firm("defalt", "defalt", 0.00);
        while (check) {
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
            System.out.println("100 - Выход");

            int action = in.nextInt();

            switch (action) {
                case 0: // Задать параметры фирмы
                    System.out.println("Введите название фирмы");
                    firm1.setName(in.next());
                    System.out.println("Введите адресс");
                    firm1.setAdress(in.next());
                    System.out.println("Введите баланс счета");
                    firm1.setAccount(in.nextDouble());
                    System.out.println("Вы успешно создали фирму");
                    break;

                case 1: //Добавить сотрудника
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
                    boolean sex = true;
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

                    Employee employee = new Employee(nameEmpl, surname, patronymic, salary, balance, sex, department);

                    if (firm1.addEmployee(employee)) {
                        System.out.println("Вы успешно добавили сотрудника");
                    } else {
                        System.out.println("Сотрудник не добавлен");
                    }

                    break;

                case 2: // Уволить сотрудника
                    System.out.println("Введите имя сотрудника");
                    String nameEmplFire = in.next();
                    System.out.println("Введите фамилию сотрудника");
                    String surnameEmplFire = in.next();
                    System.out.println("Введите отчество сотрудника");
                    String patronicEmplFire = in.next();
//                    firm1.fireEmployee(nameEmplFire, surnameEmplFire, patronicEmplFire);
                    if (firm1.fireEmployee(nameEmplFire, surnameEmplFire, patronicEmplFire)) {
                        System.out.println("Вы успешно уволили сотрудника.");
                    } else {
                        System.out.println("Сотрудник не уволен");
                    }

                    break;

                case 3: // Установить отдел
                    System.out.println("Введите имя сотрудника");
                    String nameEmplsetDep = in.next();
                    System.out.println("Введите фамилию сотрудника");
                    String surnameEmplsetDep = in.next();
                    System.out.println("Введите отчество сотрудника");
                    String patronicEmplsetDep = in.next();
                    System.out.println("Введите название отдела");
                    String nameDepartment = in.next();
                    if (firm1.setDepartmentForEmployee(nameEmplsetDep, surnameEmplsetDep, patronicEmplsetDep, nameDepartment)) {
                        System.out.println("Сотрудник переведен в новый отдел " + nameDepartment);
                    } else {
                        System.out.println("Сотрудник не переведен. Попробуйте снова");
                    }
                    break;

                case 4:
                    firm1.printListEmployees();
                    break;

                case 5:
                    firm1.printListEmployeesSortedBySalary();
                    break;

                case 6:
                    firm1.printListEmployeesSortedByName();
                    break;

                case 7:
                    System.out.println("Введите название отдела");
                    firm1.printListEmployeesFromDep(in.next());
                    break;

                case 8:
                    System.out.println("Введите название отдела");
                    firm1.printEmployeesFromDepSortedBySalary(in.next());
                    break;

                case 9:
                    System.out.println("Введите название отдела");
                    firm1.printEmployeesFromDepSortedByName(in.next());
                    break;

                case 10:
                    firm1.giveSalaryForAll();
                    break;

                case 12:
                    firm1.printFirmInfo();
                    break;

                case 100:
                    check = false;
                    System.out.println("Вы закрыли программу");
                    break;

                default:
                    System.out.println("Неверный ввод");
                    break;
            }

        }

    }


}
