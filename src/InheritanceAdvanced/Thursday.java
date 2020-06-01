package InheritanceAdvanced;

public class Thursday {

	public static void main(String[] args) {
		
		System.out.println("+++++++++++++++++++++++++");
		//instantiating hero
		Hero hero = new Hero("Big Man");
		hero.fight();
		hero.run();
		hero.showAbilities();
		
		System.out.println("+++++++++++++++++++++++++");
		//instantiate villain
		Villain villain = new Villain("Sly Man");
		villain.run();
		villain.steals();
		villain.showAbilities();
		
		System.out.println("+++++++++++++++++++++++++");
		//instantiate  Vigilante
		Vigilante vigilante = new Vigilante("Ms. Savage");
		vigilante.kills();
		vigilante.showAbilities();
		vigilante.run();
		vigilante.dealsJustice();
		System.out.println("+++++++++++++++++++++++++");
		
		//Instantiating Hero Strongman
		StrongMan hero2 = new StrongMan("Big Man");
		hero2.fight();
		hero2.run();
		hero2.showAbilities();
		System.out.println("+++++++++++++++++++++++++");
	}

}
