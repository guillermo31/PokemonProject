package pokemon.controller;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.io.*;


import javax.swing.JOptionPane;

import pokemon.view.PokedexFrame;
import pokemon.view.PokedexFrame;
import pokemon.model.*;

public class PokedexController 
{
	//data members
	private ArrayList<Pokemon> pokemonList;
	private PokedexFrame appFrame;
	private String saveFile = "backup.pokemon";

	//constructor 
	public PokedexController()
	{
		pokemonList = new ArrayList<Pokemon>();
		addPokemon();
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
		pokemonList.add(new Charmander(1342, "charmander"));
		pokemonList.add(new Bulbasaur(001, "bulbasaur"));
		pokemonList.add(new Pikachu(1223, "pikachu"));
		pokemonList.add(new Magikarp(123, "magikarp"));
		pokemonList.add(new Squirtle(1233424, "squirtle"));
//		pokemonList.add(new MichaelPhelps());
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
	
	public void savePokedex()
	{
		try 
		{
			FileOutputStream saveStream = new FileOutputStream(saveFile);
			ObjectOutputStream output = new ObjectOutputStream(saveStream);
			output.writeObject(pokemonList);
			output.close();
			saveStream.close();
		}
		catch(IOException error)
		{
			JOptionPane.showMessageDialog(appFrame, error.getMessage(), "File error", JOptionPane.ERROR_MESSAGE);
		}
	}
	public void loadPokedex()
	{
		try
		{
			ArrayList<Pokemon> saved = new ArrayList<Pokemon>();
			FileInputStream inputStream = new FileInputStream(saveFile);
			ObjectInputStream input = new ObjectInputStream(inputStream);
			saved = (ArrayList<Pokemon>) input.readObject();
			input.close();
			inputStream.close();
			pokemonList = saved;
		}
		catch(IOException error)
		{
			JOptionPane.showMessageDialog(appFrame, "No Save File", "loading pokemon", JOptionPane.INFORMATION_MESSAGE);
		}
		catch(ClassNotFoundException pokemonError)
		{
			JOptionPane.showMessageDialog(appFrame, pokemonError.getMessage(), "type error", JOptionPane.INFORMATION_MESSAGE);
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
