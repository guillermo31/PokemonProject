package pokemon.model;

public class Bulbasaur extends Pokemon implements Grass
{
	//data members 
	
	
	//constructor
	public Bulbasaur()
	{
		super(001, "Bulbasaur");
	}
	public Bulbasaur(int number, String name)
	{
		super(number, name);
	}
	
	//methods
	public void hideInGrass()
	{
		System.out.println("*hides in grass*");

	}
	public void grassTrap()
	{
		System.out.println("your oponent is now trappe");
	}

}
