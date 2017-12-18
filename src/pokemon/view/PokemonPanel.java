package pokemon.view;

import pokemon.controller.PokemonController;
import java.awt.Color;
import javax.swing.*;

public class PokemonPanel extends JPanel
{
	private PokemonController appController;
	private JTextArea pokeArea;
	private SpringLayout appLayout;
	private JButton ResetButton;
	private JButton SaveButton;
	private JButton LoadButton;
	private JLabel infoLabel;
	private JLabel infoLabel_1;
	private JLabel infoLabel_2;
	private JLabel infoLabel_3;
	private JLabel infoLabel_4;
	private JLabel infoLabel_5;
	
	private JScrollPane pokemonScrollPane;
	
	public PokemonPanel(PokemonController appController)
	{
		
		super();
		this.appController = appController;
		
		//Initialize GUI data members
		pokeArea = new JTextArea(10, 25);
		appLayout = new SpringLayout();
		ResetButton = new JButton("Reset");
		SaveButton = new JButton("Save");
		LoadButton = new JButton("Load");
		infoLabel = new JLabel("#");
		infoLabel_5 = new JLabel("Name");
		infoLabel_4 = new JLabel("HealthPoints");

		infoLabel_3 = new JLabel("Attack");

		infoLabel_2 = new JLabel("Can evolve");

		infoLabel_1 = new JLabel("Enhancement");

		pokemonScrollPane = new JScrollPane();

		
		setupScrollPane();			
		setupPanel();
		setupLayout();
		setupListeners();
		
	}
	private void setupScrollPane()
	{
		
	}
	private void setupPanel()
	{
		this.setBackground(Color.CYAN);
		this.setLayout(appLayout);
		this.add(SaveButton);
		this.add(pokemonScrollPane);
		this.add(ResetButton);
		pokeArea.setEnabled(false);
		pokeArea.setEditable(false);
		this.add(LoadButton);
		this.add(infoLabel_1);
		this.add(infoLabel_2);
		this.add(infoLabel_3);
		this.add(infoLabel_4);
		this.add(infoLabel_5);
		this.add(infoLabel);
	}
	private void setupLayout()
	{
		appLayout.putConstraint(SpringLayout.NORTH, LoadButton, 0, SpringLayout.NORTH, SaveButton);
		appLayout.putConstraint(SpringLayout.EAST, LoadButton, -6, SpringLayout.WEST, ResetButton);
		appLayout.putConstraint(SpringLayout.NORTH, SaveButton, 0, SpringLayout.NORTH, ResetButton);
		appLayout.putConstraint(SpringLayout.WEST, SaveButton, 6, SpringLayout.EAST, ResetButton);
		appLayout.putConstraint(SpringLayout.SOUTH, ResetButton, -10, SpringLayout.SOUTH, this);
		appLayout.putConstraint(SpringLayout.EAST, ResetButton, -112, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.NORTH, infoLabel_4, 57, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.EAST, infoLabel_4, -84, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.EAST, infoLabel_1, -80, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.EAST, infoLabel_2, 0, SpringLayout.EAST, infoLabel_1);
		appLayout.putConstraint(SpringLayout.NORTH, infoLabel_1, 0, SpringLayout.SOUTH, infoLabel_3);
		appLayout.putConstraint(SpringLayout.SOUTH, infoLabel_2, -20, SpringLayout.NORTH, infoLabel_3);
		appLayout.putConstraint(SpringLayout.SOUTH, infoLabel_3, -213, SpringLayout.SOUTH, this);
		appLayout.putConstraint(SpringLayout.EAST, infoLabel_3, -84, SpringLayout.EAST, this);
	}
	private void setupListeners()
	{
		
	}
	
}
