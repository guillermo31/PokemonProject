package pokemon.controller;
import java.util.ArrayList;

import pokemon.view.PokedexFrame;
import pokemon.view.PokedexFrame;
import pokemon.model.*;

public class PokedexController 
{
	private ArrayList<Pokemon> pokemonList;
	private PokedexFrame appFrame;
	
	public PokedexController()
	{
		pokemonList = new ArrayList<Pokemon>();
		this.appFrame = new PokedexFrame(this);
	}
	public void start()
	{
		
	}
}
