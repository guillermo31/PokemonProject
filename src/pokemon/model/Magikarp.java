package pokemon.model;

public class Magikarp extends Pokemon implements Water
{
	public Magikarp()
	{
		super(129, "Magikarp");
	}
	public Magikarp(int number, String name)
	{
		super(number, name);
	}
	
	//methods 
	public void drownOpponent()
	{
		System.out.println("*drowns opponent*");
	}
	public void storm()
	{
		System.out.println("your opponent is now trapped in a storm");
	}
}
