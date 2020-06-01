package InheritanceAdvanced;

public class Thursday {

	public static void main(String[] args) {
		//instantiating hero
		Hero hero = new Hero("Big Man");
		hero.fight();
		hero.run();
		hero.showAbilities();
		
		
		//instantiate villain
		Villain villain = new Villain("Sly Man");
		villain.run();
		villain.steals();
		villain.showAbilities();
	}

}
