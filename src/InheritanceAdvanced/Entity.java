package InheritanceAdvanced;

public abstract class Entity implements Action {
//this class is never instantiated. it is the blue print of any class
	protected int strenght;
	protected int speed;
	protected int health;
	public String name;
}
