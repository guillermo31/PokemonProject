package pokemon.model;

public class Pikachu extends Pokemon implements Electric
{
	public Pikachu()
	{
		super(025, "Pikachu");
	}
	public Pikachu(int number, String name)
	{
		super(number, name);
	}
	
	//methods 
	public void electrify()
	{
		System.out.println("*electrifies opponent*");
	}
	public void roast()
	{
		System.out.println("*opponent is now fully roasted");
	}

}
