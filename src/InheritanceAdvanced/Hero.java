package InheritanceAdvanced;

public class Hero {
	//private properties
	protected int strenght;
	protected int speed;
	private int health;
	//public properties
	public String name;
	
	//constructor
	public Hero(String name) {
	this.name = name;
	generateAbilities();
}
	//getters
	public int getSpeed() {
		return speed;
	}
	
	public int getHealth() {
		return health;
	}
	
	public int getStrenght() {
		return strenght;
	}
	
	private void generateAbilities() {
		this.strenght = (int)(Math.random()*100 +1);
		this.speed = (int)(Math.random()*100 +1);
		this.health = (int)(Math.random()*100 +1);
	}
	
	public void showAbilities() {
		System.out.println("Strength " + this.strenght);
		System.out.println("Speed " + this.speed);
		System.out.println("Health " + this.health);
	}
	public void fight() {
		System.out.println(this.name + " is fighting");
	}
	public void run() {
		System.out.println(this.name + " is Running");
	}


}
