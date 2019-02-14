package pokemon.model;

public class Charmander extends Pokemon implements Fire
{
	public Charmander()
	{
		super(100, "charmander");
	}
	public Charmander(int number, String name)
	{
		super(number, name);
	}
	
	public void burn()
	{
		System.out.println("*intensely burns other pokemon*");
	}
	
	public int muchFire()
	{
		return 123509;
	}
	
}
