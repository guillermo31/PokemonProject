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
	
	
	public PokedexPanel(PokedexController app)
	{
		super();
		this.appController = app;
		this.appLayout = new SpringLayout();
		
		numberField = new JTextField("0");
		nameField = new JTextField("my pokename");
		evolveField = new JTextField("false");
		healthField = new JTextField("0");
		attackField = new JTextField("0 ");
		enhancementField = new JTextField("0");
		attackLabel = new JLabel("attack");
		imageLabel = new JLabel("pokemon");
		changeButton = new JButton("change pokevalues");
		pokedexDropdown = new JComboBox();
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
		appLayout.putConstraint(SpringLayout.SOUTH, attackLabel, -528, SpringLayout.SOUTH, this);
		
		appLayout.putConstraint(SpringLayout.WEST, changeButton, 10, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.SOUTH, changeButton, -260, SpringLayout.SOUTH, this);
		appLayout.putConstraint(SpringLayout.NORTH, pokedexDropdown, 22, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.WEST, pokedexDropdown, 60, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.NORTH, numberLabel, 6, SpringLayout.SOUTH, attackLabel);
		appLayout.putConstraint(SpringLayout.WEST, attackLabel, 0, SpringLayout.WEST, numberLabel);
		appLayout.putConstraint(SpringLayout.EAST, numberLabel, -192, SpringLayout.EAST, this);
		
		appLayout.putConstraint(SpringLayout.NORTH, nameLabel, 6, SpringLayout.SOUTH, numberLabel);
		appLayout.putConstraint(SpringLayout.EAST, nameLabel, -10, SpringLayout.EAST, numberLabel);
		appLayout.putConstraint(SpringLayout.NORTH, evolveLabel, 24, SpringLayout.SOUTH, nameLabel);
		appLayout.putConstraint(SpringLayout.WEST, evolveLabel, 0, SpringLayout.WEST, numberLabel);
		appLayout.putConstraint(SpringLayout.NORTH, enhanceLabel, 20, SpringLayout.SOUTH, evolveLabel);
		appLayout.putConstraint(SpringLayout.WEST, enhanceLabel, 0, SpringLayout.WEST, numberLabel);
		appLayout.putConstraint(SpringLayout.NORTH, healthLabel, 71, SpringLayout.SOUTH, evolveLabel);
		appLayout.putConstraint(SpringLayout.EAST, healthLabel, 0, SpringLayout.EAST, numberLabel);
	}
	
	private void setupListeners()
	{
		
	}
	
}
