
public class Inheritance {

	public static void main(String args[]) {
		Car.noOfwheels = 4;
		Bike.noOfwheels = 2;
		
		Vehicle v = new Bike();
		v.sidestand = 2;
				
		
		Car car = new Car();
		car.color = "red";
		car.CC = 1000;
		
		Car benz = new Car();

		
		Bike pulsar = new Bike();
		pulsar.sidestand = 2;
				
				
	   }	
}


//A class to display the attributes of the vehicle
class Vehicle {
	static int noOfwheels;
	String color;
	int speed;
	int size;
	int brake;
	void attributes() {
		System.out.println("Color : " + color); 
		System.out.println("Speed : " + speed);
		System.out.println("Size : " + size);
		}
}

//A subclass which extends for vehicle
class Bike extends Vehicle {
	int sidestand; 
}


//A subclass which extends for vehicle
class Car extends Vehicle {

	int CC;
	int gears;

void attributescar() {
   // The subclass refers to the members of the superclass
   System.out.println("Color of Car : " + color);
   System.out.println("Speed of Car : " + speed);
   System.out.println("Size of Car : " + size);
   System.out.println("CC of Car : " + CC);
   System.out.println("No of gears of Car : " + gears);
}
}
