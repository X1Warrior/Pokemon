package pokemon.view;

import pokemon.controller.PokemonController;
import java.awt.Color;
import javax.swing.*;

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
		infoLabel = new JLabel("#");

		nameLabel = new JLabel("Name");
		appLayout.putConstraint(SpringLayout.WEST, nameLabel, 0, SpringLayout.WEST, ResetButton);
		healthLabel = new JLabel("HealthPoints");
		appLayout.putConstraint(SpringLayout.SOUTH, healthLabel, -236, SpringLayout.SOUTH, this);
		appLayout.putConstraint(SpringLayout.SOUTH, nameLabel, -6, SpringLayout.NORTH, healthLabel);
		appLayout.putConstraint(SpringLayout.EAST, healthLabel, 0, SpringLayout.EAST, ResetButton);
		attackLabel = new JLabel("Attack");
		appLayout.putConstraint(SpringLayout.NORTH, attackLabel, 119, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.WEST, attackLabel, 0, SpringLayout.WEST, ResetButton);
		evolvableLabel = new JLabel("Can evolve");
		appLayout.putConstraint(SpringLayout.SOUTH, evolvableLabel, -214, SpringLayout.SOUTH, this);
		appLayout.putConstraint(SpringLayout.WEST, evolvableLabel, 0, SpringLayout.WEST, ResetButton);
		modifierLabel = new JLabel("Enhancement");
		appLayout.putConstraint(SpringLayout.NORTH, modifierLabel, 6, SpringLayout.SOUTH, evolvableLabel);
		appLayout.putConstraint(SpringLayout.WEST, modifierLabel, 0, SpringLayout.WEST, ResetButton);
		nameField = new JTextField("");
		numberField = new JTextField("");
		appLayout.putConstraint(SpringLayout.EAST, numberField, -62, SpringLayout.EAST, this);
		attackField = new JTextField("");
		appLayout.putConstraint(SpringLayout.NORTH, attackField, -5, SpringLayout.NORTH, attackLabel);
		appLayout.putConstraint(SpringLayout.EAST, attackField, 0, SpringLayout.EAST, numberField);
		healthField = new JTextField("");
		appLayout.putConstraint(SpringLayout.NORTH, healthField, 5, SpringLayout.NORTH, healthLabel);
		appLayout.putConstraint(SpringLayout.WEST, healthField, 0, SpringLayout.WEST, numberField);
		appLayout.putConstraint(SpringLayout.SOUTH, healthField, 21, SpringLayout.NORTH, healthLabel);
		modifierField = new JTextField("");
		appLayout.putConstraint(SpringLayout.NORTH, modifierField, -5, SpringLayout.NORTH, modifierLabel);
		appLayout.putConstraint(SpringLayout.WEST, modifierField, -8, SpringLayout.EAST, numberField);
		appLayout.putConstraint(SpringLayout.EAST, modifierField, 0, SpringLayout.EAST, numberField);
		descriptionArea = new JTextArea("");
		typeArea = new JTextArea("");
	
		
		setupPanel();
		setupLayout();
		setupListeners();
		
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

	}
	private void setupListeners()
	{
		
	}
	
}
