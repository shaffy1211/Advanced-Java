package InheritanceAdvanced;

public class Vigilante extends Villain {
	//CONSTRUCTOR++++++++++++++++++++++++++++
	public Vigilante(String name) {
		super(name);
	}
	
	
	//Public method ++++++++++++++++++++++++++
	public void dealsJustice() {
		System.out.println(this.name + " is dealing justice");
	}
	

}
