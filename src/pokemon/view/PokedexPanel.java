package pokemon.view;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import pokemon.controller.PokedexController;
import java.io.*;


public class PokedexPanel extends JPanel
{
	private PokedexController appController;
	private SpringLayout appLayout;
	private JButton changeButton;
	private JComboBox<String> pokedexDropdown;
	private JButton saveButton;
	
	private JTextField numberField;
	private JTextField nameField;
	private JTextField evolveField;
	private JTextField attackField;
	private JTextField enhancementField;
	private JTextField healthField;
	
	private JLabel numberLabel;
	private JLabel nameLabel;
	private JLabel evolveLabel;
	private JLabel attackLabel;
	private JLabel enhanceLabel;
	private JLabel healthLabel;
	private JLabel imageLabel;
	
	private ImageIcon pokemonIcon;
	
	
	public PokedexPanel(PokedexController app)
	{
		super();
		this.appController = app;
		this.appLayout = new SpringLayout();
		this.pokemonIcon = new ImageIcon(getClass().getResource("/pokemon/view/images/pikachu.png"));
		
		numberField = new JTextField("0");
		nameField = new JTextField("my pokename");
		evolveField = new JTextField("false");
		healthField = new JTextField("0");
		attackField = new JTextField("0 ");
		enhancementField = new JTextField("0");
		attackLabel = new JLabel("attack");
		imageLabel = new JLabel("pokemon", new ImageIcon(PokedexPanel.class.getResource("/pokemon/view/images/pikachu.png")), JLabel.CENTER);
		appLayout.putConstraint(SpringLayout.NORTH, imageLabel, 35, SpringLayout.NORTH, enhancementField);
		appLayout.putConstraint(SpringLayout.WEST, imageLabel, 40, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.SOUTH, imageLabel, 188, SpringLayout.SOUTH, attackLabel);
		appLayout.putConstraint(SpringLayout.EAST, imageLabel, -56, SpringLayout.EAST, numberField);
		changeButton = new JButton("change pokevalues");
		saveButton = new JButton("save pokevalues");
		pokedexDropdown = new JComboBox<String>();
		numberLabel = new JLabel("number");
		nameLabel = new JLabel("name");
		appLayout.putConstraint(SpringLayout.EAST, saveButton, 0, SpringLayout.EAST, nameLabel);
		evolveLabel = new JLabel("evolution");
		enhanceLabel = new JLabel("enhanced");
		appLayout.putConstraint(SpringLayout.NORTH, saveButton, 73, SpringLayout.SOUTH, enhanceLabel);
		healthLabel = new JLabel("health");

		


		
		setupLayout();
		setupPanel();
		setupListeners();
		setupDropdown();
		
	}
	
	private void setupPanel()
	{
		this.setLayout(appLayout);
		this.setPreferredSize(new Dimension(800, 600));
		this.add(numberField);
		this.add(nameField);
		this.add(evolveField);
		this.add(attackField);
		this.add(enhancementField);
		this.add(healthField);
		this.add(numberLabel);
		this.add(nameLabel);
		this.add(evolveLabel);
		this.add(enhanceLabel);
		this.add(healthLabel);
		this.add(attackLabel);
		
		this.add(changeButton);
		this.add(pokedexDropdown);
		this.add(saveButton);
		
		this.add(imageLabel);
		
		imageLabel.setVerticalTextPosition(JLabel.BOTTOM);
		imageLabel.setHorizontalTextPosition(JLabel.CENTER);
		
		
	}
	
	private void setupDropdown()
	{
		DefaultComboBoxModel<String> temp = new DefaultComboBoxModel<String>(appController.buildPokedexText());
		pokedexDropdown.setModel(temp);
	}
	
	
	private void sendDataToController()
	{
		int index = pokedexDropdown.getSelectedIndex();
		
		if(appController.isInt(attackField.getText()) && appController.isDouble(enhancementField.getText()) && appController.isInt(healthField.getText()) )
		{
			String [] data = new String[5];
			
			data[0] = attackField.getText();
			data[1] = enhancementField.getText();
			data[2] = healthField.getText();
			data[3] = evolveField.getText();
			data[4] = nameField.getText();
			appController.updatePokemon(index, data);
		}
		
	}
	
	private void updateFields(int index)
	{
		String [] data = appController.getPokeData(index);
		
		attackField.setText(data[0]);
		enhancementField.setText(data[1]);
		healthField.setText(data[2]);
		evolveField.setText(data[3]);
		nameField.setText(data[4]);
		numberField.setText(data[5]);
	}
	
	
	private void changeImageDisplay(String name)
	{
		String path = "/pokemon/view/images/";
		String defaultName = "pikachu";
		String extension = ".png";
		try
		{
			pokemonIcon = new ImageIcon(getClass().getResource(path + name.toLowerCase() + extension));
			
		}
		catch(NullPointerException missingFile)
		{
			pokemonIcon = new ImageIcon(getClass().getResource(path + defaultName + extension));
		}
		imageLabel.setIcon(pokemonIcon);
		repaint();
	}
	
	
	private void setupLayout()
	{
		appLayout.putConstraint(SpringLayout.SOUTH, nameField, -335, SpringLayout.SOUTH, this);
		appLayout.putConstraint(SpringLayout.NORTH, numberField, 6, SpringLayout.SOUTH, nameField);
		appLayout.putConstraint(SpringLayout.WEST, numberField, 10, SpringLayout.WEST, nameField);
		appLayout.putConstraint(SpringLayout.WEST, nameField, 231, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.NORTH, evolveField, 6, SpringLayout.SOUTH, numberField);
		appLayout.putConstraint(SpringLayout.WEST, evolveField, 0, SpringLayout.WEST, nameField);
		appLayout.putConstraint(SpringLayout.NORTH, healthField, 6, SpringLayout.SOUTH, evolveField);
		appLayout.putConstraint(SpringLayout.WEST, healthField, 0, SpringLayout.WEST, numberField);
		appLayout.putConstraint(SpringLayout.NORTH, attackField, 7, SpringLayout.SOUTH, healthField);
		appLayout.putConstraint(SpringLayout.EAST, attackField, 0, SpringLayout.EAST, numberField);
		appLayout.putConstraint(SpringLayout.NORTH, enhancementField, 6, SpringLayout.SOUTH, attackField);
		appLayout.putConstraint(SpringLayout.WEST, enhancementField, 0, SpringLayout.WEST, numberField);
		appLayout.putConstraint(SpringLayout.NORTH, attackLabel, 5, SpringLayout.NORTH, attackField);
		appLayout.putConstraint(SpringLayout.WEST, changeButton, 281, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.SOUTH, changeButton, -75, SpringLayout.NORTH, nameField);
		appLayout.putConstraint(SpringLayout.NORTH, pokedexDropdown, 77, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.WEST, pokedexDropdown, 100, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.EAST, attackLabel, 0, SpringLayout.EAST, numberLabel);
		appLayout.putConstraint(SpringLayout.NORTH, numberLabel, 5, SpringLayout.NORTH, numberField);
		appLayout.putConstraint(SpringLayout.WEST, numberLabel, 148, SpringLayout.EAST, numberField);
		appLayout.putConstraint(SpringLayout.NORTH, nameLabel, 5, SpringLayout.NORTH, nameField);
		appLayout.putConstraint(SpringLayout.WEST, nameLabel, 80, SpringLayout.EAST, nameField);
		appLayout.putConstraint(SpringLayout.NORTH, evolveLabel, 5, SpringLayout.NORTH, evolveField);
		appLayout.putConstraint(SpringLayout.WEST, evolveLabel, 0, SpringLayout.WEST, numberLabel);
		appLayout.putConstraint(SpringLayout.NORTH, enhanceLabel, 5, SpringLayout.NORTH, enhancementField);
		appLayout.putConstraint(SpringLayout.WEST, enhanceLabel, 0, SpringLayout.WEST, numberLabel);
		appLayout.putConstraint(SpringLayout.NORTH, healthLabel, 5, SpringLayout.NORTH, healthField);
		appLayout.putConstraint(SpringLayout.EAST, healthLabel, 0, SpringLayout.EAST, numberLabel);
	}
	
	private void setupListeners()
	{
		saveButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				appController.savePokedex();
			}
		});
		
		changeButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				sendDataToController();
			}
		});
		
		pokedexDropdown.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent selection)
			{
				String name = pokedexDropdown.getSelectedItem().toString();
				updateFields(pokedexDropdown.getSelectedIndex());
				changeImageDisplay(name);
			}
		});
	}
	
}
