package playtime;

public class Car {
	int yearMade;
	String color;
	String model;
	int position;
	
		/**
		 * @param args
		 */
	Car(int y, String c, String m) {
		position = 0;
		color = c;
		model = m;
		yearMade = y;
	}
	
	void moveForward(int amount) {
		position = position + amount;
	}

	
	void moveBackwards(int amount) {
		position = position - amount;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1 = new Car(1990, "RED", "Toyota");
		car1.moveForward(10);
		car1.moveForward(10);
		car1.moveBackwards(3);
		car1.moveForward(10);
		System.out.println("Car1 position: " + car1.position);
//		Car car2 = new Car();
//		car2.color = "BLACK";
		
	

	}

}
