package pokemon.view;
import javax.swing.*;
import java.awt.*;
import pokemon.controller.PokedexController;


public class PokedexPanel extends JPanel
{
	private PokedexController appController;
	private SpringLayout appLayout;
	private JButton changeButton;
	private JComboBox pokedexDropdown;
	
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
		imageLabel = new JLabel("pokemon", pokemonIcon, JLabel.CENTER);
		changeButton = new JButton("change pokevalues");
		pokedexDropdown = new JComboBox<String>();
		numberLabel = new JLabel("number");
		nameLabel = new JLabel("name");
		evolveLabel = new JLabel("evolution");
		enhanceLabel = new JLabel("enhanced");
		healthLabel = new JLabel("health");

		


		
		setupLayout();
		setupPanel();
		setupListeners();
	}
	
	private void setupPanel()
	{
		this.setLayout(appLayout);
		this.setPreferredSize(new Dimension(800, 600));
		this.setBackground(Color.RED);
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
		
		imageLabel.setVerticalTextPosition(JLabel.BOTTOM);
		imageLabel.setHorizontalTextPosition(JLabel.CENTER);
		
		
	}
	
	private void setupDropdown()
	{
		DefaultComboBoxModel<String> temp = new DefaultComboBoxModel<String>(app.buildPokedexText());
		pokedexDropdown.setModel(temp);
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
		
	}
	
}
