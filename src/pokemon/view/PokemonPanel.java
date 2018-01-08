package pokemon.view;

import pokemon.controller.PokemonController;
import java.awt.Color;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PokemonPanel extends JPanel
{
	private PokemonController appController;
	private SpringLayout appLayout;

	private JLabel infoLabel;
	private JLabel modifierLabel;
	private JLabel evolvableLabel;
	private JLabel attackLabel;
	private JLabel healthLabel;
	private JLabel nameLabel;
	private JLabel iconLabel;
	
	private JCheckBox evolvableBox;
	private JTextField nameField;
	private JTextField numberField;
	private JTextField attackField;
	private JTextField healthField;
	private JTextField modifierField;

	private JTextArea descriptionArea;
	private JTextArea typeArea;
	
	private JButton ResetButton;
	private JButton SaveButton;
	private JButton LoadButton;
	private JComboBox pokedexDropdown;
	
	private JPanel firstType;
	private JPanel secondType;
	private JPanel thirdType;
	private JPanel fourthType;
	
	private void updatePokedexInfo(int index)
	{
		nameField.setText(appController.getPokedex().get(index).getName());
		evolvableBox.setSelected(appController.getPokedex().get(index).isCanEvolve());
		numberField.setText(appController.getPokedex().get(index).getNumber() + "");
		attackField.setText(appController.getPokedex().get(index).getAttackPoints() + "");
		healthField.setText(appController.getPokedex().get(index).getHealthPoints() + "");
		modifierField.setText(appController.getPokedex().get(index).getEnhancementModifier() + "");
		
		descriptionArea.setText(appController.getPokedex());
	}
	
	public PokemonPanel(PokemonController appController)
	{
		
		super();
		this.appController = appController;
		
		//Initialize GUI data members
		appLayout = new SpringLayout();
		
		ResetButton = new JButton("Reset");
		SaveButton = new JButton("Save");
		LoadButton = new JButton("Load");
		
		infoLabel = new JLabel("Number");
		nameLabel = new JLabel("Name");
		healthLabel = new JLabel("HealthPoints");
		attackLabel = new JLabel("Attack");
		evolvableLabel = new JLabel("Can evolve");
		modifierLabel = new JLabel("Enhancement");
		pokedexDropdown = new JComboBox();

		nameField = new JTextField("");
		numberField = new JTextField("");
		attackField = new JTextField("");
		healthField = new JTextField("");
		modifierField = new JTextField("");
		
		iconLabel = new JLabel("", new ImageIcon(getClass().getResource("pokemon/view/Pokemonimages/Alakazam.png")), JLabel.CENTER);
		
		descriptionArea = new JTextArea("5, 10");
		typeArea = new JTextArea("4, 15");
		
		firstType = new JPanel();
		secondType = new JPanel();
		thirdType = new JPanel();
		fourthType = new JPanel();
	
		setupComboBox();
		setupTypePanels();
		setupPanel();
		updateImage();
		updateTypePanels();
		setupLayout();
		setupListeners();
		
	}
	private void setupComboBox()
	{
		DefaultComboBoxModel pokemonModel = new DefaultComboBoxModel(appController.convertPokedex());
		pokedexDropdown.setModel(pokemonModel);
	}

	private void setupTypePanels()
	{
		firstType.setSize(50,50);
		secondType.setSize(50,50);
		thirdType.setSize(50,50);
		fourthType.setSize(50,50);
	}

 	private void setupPanel()
	{
		this.setBackground(Color.CYAN);
		this.setLayout(appLayout);
		this.add(SaveButton);
		this.add(ResetButton);
		this.add(LoadButton);
		this.add(modifierLabel);
		this.add(evolvableLabel);
		this.add(attackLabel);
		this.add(healthLabel);
		this.add(nameLabel);
		this.add(infoLabel);
		this.add(nameField);
		this.add(numberField);
		this.add(attackField);
		this.add(healthField);
		this.add(modifierField);
		this.add(descriptionArea);
		this.add(typeArea);
		this.add(pokedexDropdown);
	}
 	
 	private void updateImage()
 	{
 		
 	}
 	
 	private void updateTypePanels()
 	{
 	String[] types = appController.getPokedex().get(pokedexDropdown.getSelectedIndex()).getPokemonTypes();	
 	
 	// Change this to match your 3 minimum tpyes in your pokedex
 	if (types[0].equals("Electric"))
 	{
 		firstType.setBackground(Color.YELLOW);
 	}
 	else if (types[0].equals("Dragon"))
 	{
 		firstType.setBackground(Color.MAGENTA);
 	}
 	else if (types[0].equals("Psychic"))
 	{
 		firstType.setBackground(Color.BLUE);
 	}
 	else
 	{
 		firstType.setBackground(Color.WHITE);
 	}
 	
 	if (types.length >1)
 	{
 		if(types[1].equals("Electric"))
 		{
 			secondType.setBackground(Color.YELLOW);
 		}
 		//... continue as above
 		
 		if (types.length == 3)
 		{
 			if (types[2].equals("Electric"))
 			{
 				thirdType.setBackground(Color.MAGENTA);
 			}
 		}
 	}
 	}
 	
 	private void setupLayout()
	{
		appLayout.putConstraint(SpringLayout.NORTH, LoadButton, 0, SpringLayout.NORTH, SaveButton);
		appLayout.putConstraint(SpringLayout.EAST, LoadButton, -6, SpringLayout.WEST, ResetButton);
		appLayout.putConstraint(SpringLayout.NORTH, SaveButton, 0, SpringLayout.NORTH, ResetButton);
		appLayout.putConstraint(SpringLayout.WEST, SaveButton, 6, SpringLayout.EAST, ResetButton);
		appLayout.putConstraint(SpringLayout.SOUTH, ResetButton, -10, SpringLayout.SOUTH, this);
		appLayout.putConstraint(SpringLayout.EAST, ResetButton, -112, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.NORTH, infoLabel, 0, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.WEST, infoLabel, 0, SpringLayout.WEST, ResetButton);
		appLayout.putConstraint(SpringLayout.WEST, nameLabel, 0, SpringLayout.WEST, ResetButton);
		appLayout.putConstraint(SpringLayout.NORTH, modifierField, -5, SpringLayout.NORTH, modifierLabel);
		appLayout.putConstraint(SpringLayout.WEST, modifierField, -8, SpringLayout.EAST, numberField);
		appLayout.putConstraint(SpringLayout.EAST, modifierField, 0, SpringLayout.EAST, numberField);
		appLayout.putConstraint(SpringLayout.NORTH, healthField, 5, SpringLayout.NORTH, healthLabel);
		appLayout.putConstraint(SpringLayout.WEST, healthField, 0, SpringLayout.WEST, numberField);
		appLayout.putConstraint(SpringLayout.SOUTH, healthField, 21, SpringLayout.NORTH, healthLabel);
		appLayout.putConstraint(SpringLayout.NORTH, attackField, -5, SpringLayout.NORTH, attackLabel);
		appLayout.putConstraint(SpringLayout.EAST, attackField, 0, SpringLayout.EAST, numberField);
		appLayout.putConstraint(SpringLayout.EAST, numberField, -62, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.NORTH, modifierLabel, 6, SpringLayout.SOUTH, evolvableLabel);
		appLayout.putConstraint(SpringLayout.WEST, modifierLabel, 0, SpringLayout.WEST, ResetButton);
		appLayout.putConstraint(SpringLayout.SOUTH, evolvableLabel, -214, SpringLayout.SOUTH, this);
		appLayout.putConstraint(SpringLayout.WEST, evolvableLabel, 0, SpringLayout.WEST, ResetButton);
		appLayout.putConstraint(SpringLayout.NORTH, attackLabel, 119, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.WEST, attackLabel, 0, SpringLayout.WEST, ResetButton);
		appLayout.putConstraint(SpringLayout.SOUTH, healthLabel, -236, SpringLayout.SOUTH, this);
		appLayout.putConstraint(SpringLayout.SOUTH, nameLabel, -6, SpringLayout.NORTH, healthLabel);
		appLayout.putConstraint(SpringLayout.EAST, healthLabel, 0, SpringLayout.EAST, ResetButton);
		appLayout.putConstraint(SpringLayout.SOUTH, pokedexDropdown, -73, SpringLayout.NORTH, LoadButton);
		appLayout.putConstraint(SpringLayout.EAST, pokedexDropdown, 0, SpringLayout.EAST, LoadButton);
	}
	
	private void setupListeners()
	{
		pokedexDropdown.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent selection)
			{
				int selectedPokemonIndex = pokedexDropdown.getSelectedIndex();
				updatePokedexInfo(selectedPokemonIndex);
				updateImage();
				updateTypePanels();
				repaint();
			}
		});
	}
	
}
