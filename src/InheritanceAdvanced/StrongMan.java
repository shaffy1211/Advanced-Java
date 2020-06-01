package InheritanceAdvanced;

public class StrongMan extends Hero {
	//constructor+++++++++++++++++++++
	public StrongMan(String name) {
		super(name);
		this.boostStrength();
	}
	//Private methods+++++++++++++++++++++++
	
	private void boostStrength() {
		this.strenght += 50;
		if(this.strenght>100) {
			this.strenght = 100;
		}
	}
}
