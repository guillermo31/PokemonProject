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
		
		numberLabel = new JLabel("number");
		nameLabel = new JLabel("name");
		evolveLabel = new JLabel("evolution");
		attackLabel = new JLabel("attack");
		enhanceLabel = new JLabel("enhanced");
		healthLabel = new JLabel("health");
		imageLabel = new JLabel("pokemon");
		
		changeButton = new JButton("change pokevalues");
		pokedexDropdown = new JComboBox();
		
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
		this.add(attackLabel);
		this.add(enhanceLabel);
		this.add(healthLabel);
		
		this.add(changeButton);
		this.add(pokedexDropdown);
	}
	
	private void setupLayout()
	{
		
	}
	
	private void setupListeners()
	{
		
	}
	
}
