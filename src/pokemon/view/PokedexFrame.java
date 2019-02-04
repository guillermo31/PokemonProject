package pokemon.view;
import pokemon.controller.PokemonController;
import javax.swing.*;

public class PokedexFrame extends JFrame
{
	private PokemonController appController;
	private PokedexPanel appPanel;
	
	
	public PokedexFrame(PokemonController appController)
	{
		super();
		this.appController = appController;
		this.appPanel = new PokedexPanel(appController);
		
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(appPanel);
		this.setSize(800, 600);
		this.setTitle("Pokedex");
		this.setResizable(false);
		this.setVisible(true);
	}
	
}
