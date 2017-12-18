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
		NumberLabel = new JLabel("#");
		infoLabel = new JLabel("Name");
		infoLabel = new JLabel("HealthPoints");
		infoLabel = new JLabel("Attack");
		infoLabel = new JLabel("Can evolve");
		infoLabel = new JLabel("Enhancement");
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
		this.add(infoLabel);
		this.add(NumberLabel);
		this.add(infoLabel);
		this.add(infoLabel);
		this.add(infoLabel);
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
	}
	private void setupListeners()
	{
		
	}
	
}
