package homework3;

public class Employee {

	// У каждого сотрудника (Employee) есть имя, фамилия, ставка зарплаты
	// (сумма), его личный карточный счет (сумма), пол, отдел.

	private String name;
	private String surname;
	private String patronymic;
	private double salary;
	private double balance;
	private boolean sex;
	private String department;

	public Employee (){

	}

	public Employee(String name, String surname, String patronymic, double salary, double balance, boolean sex, String department) {

		this.name = name;
		this.surname = surname;
		this.patronymic = patronymic;
		this.salary = salary;
		this.balance = balance;
		this.sex = sex;
		this.department = department;

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

	public boolean getSex() {
		return sex;
	}

	public void setSex(boolean sex) {
		this.sex = sex;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public double calcSalary (){
		return getSalary();
	}
}

class Manager extends Employee{

	private String subDep;

	public String getSubDep() {
		return subDep;
	}

	public void setSubDep(String subDep) {
		this.subDep = subDep;
	}

	public double calcSalary(){
		return getSalary()+50;
	}

}

class SalesManager extends Employee {

	private int sales;

	public int getSales() {
		return sales;
	}

	public double calcSalary(){
		return getSalary()+this.sales*0.3;
	}




}
