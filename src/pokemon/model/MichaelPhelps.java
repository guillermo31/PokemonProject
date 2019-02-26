package pokemon.model;

public class MichaelPhelps extends Pokemon  implements Water
{
	public MichaelPhelps()
	{
		super(23252235, "MichaelPhelps");
	}
	
	public void drownOpponent()
	{
		System.out.println("*opponent has been drowned because phelps swam by him*");
	}
	public void storm()
	{
		System.out.println("storm created by phelps swimming 200 fly, opponent trapped in it");
	}
	public void twoHundredFly()
	{
		System.out.println("*swims 200 fly");
	}

}
