package pokemon.view;
import javax.swing.*;
import java.awt.*;
import pokemon.controller.PokemonController;


public class PokedexPanel extends JPanel
{
	private PokemonController appController;
	private SpringLayout appLayout;
	
	public PokedexPanel(PokemonController app)
	{
		super();
		this.appController = app;
		this.appLayout = new SpringLayout();
		
		setupLayout();
		setupPanel();
		setupListeners();
	}
	
	private void setupLayout()
	{
		
	}
	
	private void setupPanel()
	{
		
	}
	
	private void setupListeners()
	{
		
	}
	
}
