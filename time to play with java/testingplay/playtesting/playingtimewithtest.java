package playtesting;


class Plant {
	 int cost;
	 String name;
	 
	 Plant(String n, int v) {
		cost = v;
		name = n;
	 }

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

class Sunflower extends Plant {
	int sunGenerated;
	Sunflower() {
		super("Sunflower", 50);
		sunGenerated = 25;
	}
	int getSun() {
		System.out.println("You got sun");
		return sunGenerated;
	}
}

class Peashooter extends Plant {
	Peashooter() {
		super("Peashooter", 100);
	}
	void fire() {
		System.out.println("Fire!");
	}
}

public class playingtimewithtest {

		/**
		 * @param args
		 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sunflower flower = new Sunflower();
		System.out.println("plant is of type: " + flower.getName());
		flower.getSun();

		Peashooter peashooter = new Peashooter();
		System.out.println("plant is of type: " + peashooter.getName());
		peashooter.fire();

		Peashooter peashooter1 = new Peashooter();
		System.out.println("plant is of type: " + peashooter.getName());
		peashooter1.fire();

		Plant somePlant = flower;
//		somePlant.getSun();
	}

}
