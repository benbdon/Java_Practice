
public class Car {
	
	int maxSpeed = 100;
	int minSpeed = 0;
	double weight = 4079; //in pounds
	boolean isTheCarOn = false;
	char condition = 'A';
	String nameOfCar = "Lucy";
	
	public void printVariables(){
		System.out.println("This is the maxSpeed: " + maxSpeed);
		System.out.println("This is the minSpeed: " + minSpeed);
		System.out.println("This is the weight in lbs.: " + weight);
		System.out.println("The car is on? " + isTheCarOn);
		System.out.println("This is the car rating: " + condition);
		System.out.println("This is the name of the car: "  + nameOfCar);
	}
	
	public void upgradeMinSpeed(){
		minSpeed = maxSpeed;
		maxSpeed = maxSpeed + 1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car familyCar = new Car();
		System.out.println("Family's Car: ");
		familyCar.printVariables();
		familyCar.upgradeMinSpeed();
		familyCar.printVariables();
	}

}
