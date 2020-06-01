package InheritanceAdvanced;

public class Villain extends Hero {

	public Villain(String name) {
		super(name);
	}
	
	//Public methods+++++++++++++++++++++
	public void steals() {
		System.out.println(this.name + " is stealing");
	}

}
