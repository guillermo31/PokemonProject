package pokemon.model;

public class Squirtle extends Pokemon implements Water
{
	public Squirtle()
	{
		super(007, "Squirtle");
		
	}
	public Squirtle(int number, String name)
	{
		super(number, name);
	}
	public void drownOpponent()
	{
		System.out.println("*drowns opponent*");
	}
	public void storm()
	{
		System.out.println("your opponent is now trapped in a storm");
	}

}
