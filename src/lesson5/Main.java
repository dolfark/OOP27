package lesson5;


public class Main {
	public static void main(String[] args) {
		
		
		
		Person person1 = new Person();
		person1.age = 20;
		person1.name = "Vasia";

		Person person2 = new Person();
		person2.age = 40;
		person2.name = "Petro";

		printPerson(person1);
		printPerson(person2);
		person1.print();
		person2.print();

	}

	public static void printPerson(Person p) {
		System.out.println(p.age + " " + p.name);
	}

}
