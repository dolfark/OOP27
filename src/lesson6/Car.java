package lesson6;

public class Car {

	String brend;
	double fuelConsumptionPerKilometr;
	int mileage;
	int maxVolumeOfTank;
	double currentVolumeOfTank;
	boolean enginStart;

	public Car (String brend, double fuelConsumptionPerKilometr, int maxVolumeOfTank){{
		this.brend = brend;
		this.fuelConsumptionPerKilometr = fuelConsumptionPerKilometr;
		this.maxVolumeOfTank = maxVolumeOfTank;


	}

	}


	public void drive(int distance) {
		if (enginStart) {
			if (currentVolumeOfTank <= distance * fuelConsumptionPerKilometr) {
				mileage = (int) (mileage + fuelConsumptionPerKilometr * currentVolumeOfTank);
				currentVolumeOfTank = 0;
				System.out.println("I was diven but tank is empty now");
				enginStart = false;
			} else {
				mileage +=distance;
				currentVolumeOfTank = currentVolumeOfTank - (distance * fuelConsumptionPerKilometr);
				System.out.println("Driving  ... ");
			}

		} else {
			System.out.println("====================");
			System.out.println("Engin is not started");
		}

	}

	public void startStop() {
		if (enginStart) {
			enginStart = false;
		} else {
			if (currentVolumeOfTank != 0) {
				enginStart = true;
			}

		}
	}

	public void getFuel(int fuel) {
		if (maxVolumeOfTank >= currentVolumeOfTank + fuel) {
			currentVolumeOfTank = currentVolumeOfTank + fuel;
		} else {
			System.out.println("You only got " + (maxVolumeOfTank - currentVolumeOfTank) + " Tank is full" );
			currentVolumeOfTank = maxVolumeOfTank;

		}

	}

	public void printInfo() {
		System.out.println("=====================================");
		System.out.println("Brend " + brend);
		System.out.println("FuelConsumptionPerKilometr " + fuelConsumptionPerKilometr);
		System.out.println("Mileage " + mileage);
		System.out.println("MaxVolumeOfTank " + maxVolumeOfTank);
		System.out.println("CurrentVolumeOfTank " + currentVolumeOfTank);
		System.out.println("EnginStart " + enginStart);

	}

	public void printFInfo(){
		System.out.printf("Model : %s, fuel : %4.2f, mileage : %d, is start : %b%n", brend, currentVolumeOfTank, mileage, enginStart);
	}


}
