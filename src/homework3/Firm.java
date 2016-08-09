package homework3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Firm {

	// 3. Написать класс фирма (Firm), содержащий имя, адрес, зарплатный счет
	// (сумма), список сотрудников.
	// У каждого сотрудника (Employee) есть имя, фамилия, ставка зарплаты
	// (сумма), его личный карточный счет (сумма), пол, отдел.
	//
	// Класс фирма должен выполнять следующие функции:
	//
	// - Добавить сотрудника (метод boolean addEmployee(Employee employee))
	//
	// - Уволить сотрудника по имени и фамилии (метод boolean
	// fireEmployee(String name, String surname))
	//
	// - Получить список всех сотрудников фирмы (метод ArrayList<Employee>
	// getAllEmployees())
	//
	// - Получить список всех сотрудников фирмы отсортированных по зарплате
	// (метод ArrayList<Employee> getAllEmployeesOrderedBySalary())
	//
	// - Выдать всем сотрудникам зарплату (перевести на карточный счет каждого
	// сотрудника, сумму равную зарплате сотрудника с главного счета фирмы, если
	// на счету фирмы не хватает средств - выдать сколько хватит =)) (метод void
	// giveSalaryForAll())

	String name;
	String adress;
	double account;
	ArrayList<Employee> ListEmployees = new ArrayList<Employee>();

	Firm(String name, String adress, double account) {
		this.name = name;
		this.adress = adress;
		this.account = account;
		this.ListEmployees = new ArrayList<Employee>();
	}

	public boolean addEmployee(Employee employee) {
//		for(Employee e: listEmplo)
		
		this.ListEmployees.add(employee);
		return true;
	}

	public boolean fireEmployee(String name, String surname) {
		boolean check = false;
		for (int i = 0; i < ListEmployees.size(); i++) {
			if (ListEmployees.get(i).name.equals(name) && ListEmployees.get(i).surname.equals(surname)) {
				ListEmployees.remove(i);
				check = true;
			}
		}
		return check;
	}

	public ArrayList<Employee> getAllEmployees() {
		return this.ListEmployees;

	}

	public ArrayList<Employee> getAllEmployeesOrderedBySalary() {
		Employee tmpMaxSalary;

		for (int i = 0; i < ListEmployees.size(); i++) {

			for (int j = 0; j < ListEmployees.size() - 1; j++) {

				if (ListEmployees.get(j).salary > ListEmployees.get(j + 1).salary) {

					tmpMaxSalary = ListEmployees.get(j);
					ListEmployees.set(j, ListEmployees.get(j + 1));
					ListEmployees.set(j + 1, tmpMaxSalary);

				}
			}
		}
		return ListEmployees;
	}

	public void giveSalaryForAll(){
		for (int i=0;i<ListEmployees.size();i++){
			if (this.account>ListEmployees.get(i).salary){
				this.account-=ListEmployees.get(i).salary;
				ListEmployees.get(i).balance += ListEmployees.get(i).salary;
				
			} else {
				
				ListEmployees.get(i).balance += this.account;
				this.account =0;
				
			}
		}
		System.out.println("Выплачено зарплату. Остаток на счету фирмы " + this.account);
	}

	public void printListEmployees() {
		for (int i = 0; i < ListEmployees.size(); i++) {
			System.out.printf(
					"Employee "
							+ "Name: %-10s Surname: %-10s Salary: %-8.2f Balance: %-8.2f Sex: %-6s Department: %-10s\n",
					ListEmployees.get(i).name, ListEmployees.get(i).surname, ListEmployees.get(i).salary,
					ListEmployees.get(i).balance, ListEmployees.get(i).sex, ListEmployees.get(i).department);

		}
		System.out.println("==========================================================");
	}
	
	public void printFirmInfo (){
		System.out.println("Фирма: " + name + " " + adress + " "+ account );
		
	}
	

		
		
	

}
