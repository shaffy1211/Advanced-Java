package InheritanceAdvanced;

public class Speedster extends Hero {
//constructor+++++++++++++++
	public Speedster(String name) {
		super(name);
		this.boostSpeed();
	}
	
	//private Methods++++++++++++++++++++++++++++
	private void boostSpeed() {
		this.speed += 50;
		if(this.speed>100) {
			this.speed = 100;
		}
	}

}
