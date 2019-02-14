package pokemon.controller;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import pokemon.view.PokedexFrame;
import pokemon.view.PokedexFrame;
import pokemon.model.*;

public class PokedexController 
{
	//data members
	private ArrayList<Pokemon> pokemonList;
	private PokedexFrame appFrame;
	
	//constructor 
	public PokedexController()
	{
		pokemonList = new ArrayList<Pokemon>();
		this.appFrame = new PokedexFrame(this);
	}
	
	public void start()
	{
		
	}
	
	
	
	//getters
	public ArrayList<Pokemon> getPokemonList()
	{
		return this.pokemonList;
	}
	public PokedexFrame getFrame()
	{
		return appFrame;
	}
	
	
	//methods 
	public void addPokemon()
	{
		pokemonList.add(new Charmander(1342, "myCharmander"));
		pokemonList.add(new Charmander(1311, "anotherCharmander"));
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
	
	public boolean isInt(String maybeInt)
	{
		boolean isValid = false;
		
		
		try
		{
			Integer.parseInt(maybeInt);
			isValid = true;
		}
		catch(NumberFormatException error)
		{
			JOptionPane.showMessageDialog(null, "you should type an integer like 0348525");
		}
		
		return isValid;
	}
	
	public boolean isDouble(String maybeDouble)
	{
		boolean isValid = false;
		
		
		try
		{
			Double.parseDouble(maybeDouble);
			isValid = true;
		}
		catch(NumberFormatException error)
		{
			JOptionPane.showMessageDialog(null, "you should type a double like 0.52542");
		}
		
		return isValid;
	}
	
	public boolean isBoolean(String maybeBool)
	{
		boolean isValid = false;
		
		
		try
		{
			Boolean.parseBoolean(maybeBool);
			isValid = true;
		}
		catch(NumberFormatException error)
		{
			JOptionPane.showMessageDialog(null, "you should type a boolean like true or false");
		}
		
		return isValid;
	}
}
