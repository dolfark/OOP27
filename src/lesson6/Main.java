package lesson6;

public class Main {

	public static void main(String[] args) {

		Car car1 = new Car ("BMW", 2.2, 100);
		car1.brend = "BMW";
		car1.currentVolumeOfTank = 20;
		car1.enginStart = false;
		car1.fuelConsumptionPerKilometr = 2;
		car1.maxVolumeOfTank = 100;
		car1.mileage = 200;
//		car1.startStop();
		car1.startStop();
		car1.drive(5000);
		car1.printFInfo();
		car1.startStop();
		car1.getFuel(1000);
		car1.drive(5000);
		car1.printFInfo();

	}

}
