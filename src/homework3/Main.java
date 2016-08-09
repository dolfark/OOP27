package homework3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// Number num1 = new Number(5);
		// Number num2 = new Number(2);
		// Number test = num1.add(num2);
		// test = num1.div(num2);
		// test = num1.fact();
		// test = num1.mod(num2);
		// test = num1.mul(num2);
		// test = num1.pow(num2);
		// test = num1.sub(num2);
		//
		// System.out.println(test.get());
		// System.out.println(num1.get());
		// System.out.println(num2.get());

		// Fraction frac1 = new Fraction(1,3);
		// Fraction frac2 = new Fraction(7,8);
		// Fraction test = frac1.add(frac2);
		// test = frac1.sub(frac2);
		// test = frac1.mul(frac2);
		// System.out.println(test.numerator +" / " +test.denominator);
		// System.out.println(frac1.mul(frac2).toString());
		// test.print();

		// Firm firm1 = new Firm("Firm A", "Kyiv", 10000.00);
		// firm1.addEmployee(new Employee("Ivan", "Petrov", 160.00, 300.00,
		// "male", "Third department"));
		// firm1.addEmployee(new Employee("Petro", "Beck", 1400.00, 3000.00,
		// "male", "First department"));
		// firm1.addEmployee(new Employee("Kolya", "Novikiv", 1300.00, 300.00,
		// "male", "Fifth department"));
		// firm1.printListEmployees();
		// // firm1.fireEmployee("Ivan", "Petrov");
		// // firm1.printListEmployees();
		// // firm1.getAllEmployeesOrderedBySalary();
		// // firm1.giveSalaryForAll();
		// // firm1.giveSalaryForAll();
		// // firm1.giveSalaryForAll();
		// firm1.giveSalaryForAll();
		// firm1.printListEmployees();
		consolMenu();
	}

	public static void consolMenu() {
		Scanner in = new Scanner(System.in);
		System.out.println("Вы работаете с фирмой.");

		boolean check = true;
		Firm firm1 = new Firm("defalt", "defalt", 0.00);
		while (check) {
			System.out.println("Выберите действие");
			System.out.println("0 - Создать фирму");
			System.out.println("1 - Добавить сотрудника");
			System.out.println("2 - Уволить сотрудника");
			System.out.println("3 - Получить список всех сотрудников фирмы");
			System.out.println("4 - Получить список всех сотрудников фирмы отсортированных по зарплате");
			System.out.println("5 - Выплатить зарплату");
			System.out.println("6 - Выход");
			System.out.println("7 - Вывести список сотрудников в консоль");
			System.out.println("8 - Вывести информацию о фирме");

			int action = in.nextInt();
			switch (action) {
			case 0:
				System.out.println("Введите название фирмы");
				firm1.name = in.next();
				System.out.println("Введите адресс");
				firm1.adress = in.next();
				System.out.println("Введите баланс счета");
				firm1.account = in.nextDouble();
				System.out.println("Вы успешно создали фирму");
				break;

			case 1:
				System.out.println("Введите имя сотрудника");
				String nameEmpl = in.next();
				System.out.println("Введите фамилию сотрудника");
				String surname = in.next();
				System.out.println("Введите зарплату сотрудника");
				double salary = in.nextDouble();
				System.out.println("Введите баланс сотрудника");
				double balance = in.nextDouble();
				System.out.println("Введите пол сотрудника");
				String sex = in.next();
				System.out.println("Введите отдел сотрудника");
				String department = in.next();
				Employee employee = new Employee(nameEmpl, surname, salary, balance, sex, department);
				firm1.addEmployee(employee);
				System.out.println("Вы успешно добавили сотрудника");

				break;

			case 2:
				System.out.println("Введите имя сотрудника");
				String nameEmplFire = in.next();
				System.out.println("Введите фамилию сотрудника");
				String surnameEmplFire = in.next();
				firm1.fireEmployee(nameEmplFire, surnameEmplFire);
				System.out.println("Вы успешно уволили сотрудника.");

				break;

			case 3:
				firm1.getAllEmployees();
				break;

			case 4:
				firm1.getAllEmployeesOrderedBySalary();
				break;

			case 5:
				firm1.giveSalaryForAll();
				break;
			case 6:
				check = false;
				System.out.println("Вы закрыли программу");
				break;
			case 7:
				firm1.printListEmployees();
				break;

			case 8:
				firm1.printFirmInfo();
				break;
				
			default:
				System.out.println("Неверный ввод");
				break;
			}

		}

	}

}
