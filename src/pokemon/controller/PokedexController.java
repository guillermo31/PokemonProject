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
	
	public void updatePokemon(int index, String[] data)
	{
		if(data.length == 5)
		{
			Pokemon current = pokemonList.get(index);
			current.setAttackPoints(Integer.parseInt(data[0]));
			current.setEnhancementModifier(Double.parseDouble(data[1]));
			current.setHealthPoints(Integer.parseInt(data[2]));
			current.setName(data[3]);
			current.setCanEvolve(Boolean.parseBoolean(data[4]));
		}
	}
	
	public String[] buildPokedexText()
	{
		String [] names = new String[pokemonList.size()];
		
		for(int i = 0; i < pokemonList.size(); i++)
		{
			names[i] = pokemonList.get(i).getName();
		}
		return names;
	}
}
