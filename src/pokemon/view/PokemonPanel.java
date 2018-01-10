package pokemon.view;

import pokemon.controller.PokemonController;
import javax.swing.*;

import java.awt.Color;
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
//
//		descriptionArea.setText(appController.getPokedex());
	}

	public PokemonPanel(PokemonController appController)
	{

		super();
		this.appController = appController;

		// Initialize GUI data members
		appLayout = new SpringLayout();

		ResetButton = new JButton("Reset");
		SaveButton = new JButton("Save");
		LoadButton = new JButton("Load");
		evolvableBox = new JCheckBox("");
		infoLabel = new JLabel("Number");
		appLayout.putConstraint(SpringLayout.NORTH, infoLabel, 26, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.WEST, infoLabel, 0, SpringLayout.WEST, ResetButton);
		nameLabel = new JLabel("Name");
		appLayout.putConstraint(SpringLayout.WEST, nameLabel, 0, SpringLayout.WEST, ResetButton);
		appLayout.putConstraint(SpringLayout.SOUTH, nameLabel, -236, SpringLayout.SOUTH, this);
		healthLabel = new JLabel("HealthPoints");
		appLayout.putConstraint(SpringLayout.NORTH, healthLabel, 6, SpringLayout.SOUTH, nameLabel);
		appLayout.putConstraint(SpringLayout.EAST, healthLabel, 0, SpringLayout.EAST, ResetButton);
		attackLabel = new JLabel("Attack");
		appLayout.putConstraint(SpringLayout.WEST, attackLabel, 0, SpringLayout.WEST, ResetButton);
		evolvableLabel = new JLabel("Can evolve");
		appLayout.putConstraint(SpringLayout.SOUTH, evolvableBox, 0, SpringLayout.SOUTH, evolvableLabel);
		appLayout.putConstraint(SpringLayout.WEST, evolvableLabel, 0, SpringLayout.WEST, ResetButton);
		modifierLabel = new JLabel("Enhancement");
		appLayout.putConstraint(SpringLayout.SOUTH, evolvableLabel, -6, SpringLayout.NORTH, modifierLabel);
		appLayout.putConstraint(SpringLayout.WEST, modifierLabel, 0, SpringLayout.WEST, ResetButton);
		appLayout.putConstraint(SpringLayout.SOUTH, modifierLabel, -18, SpringLayout.NORTH, attackLabel);
		
		pokedexDropdown = new JComboBox();

		
		nameField = new JTextField("");
		appLayout.putConstraint(SpringLayout.EAST, evolvableBox, 0, SpringLayout.EAST, nameField);
		appLayout.putConstraint(SpringLayout.NORTH, nameField, -5, SpringLayout.NORTH, nameLabel);
		numberField = new JTextField("");
		appLayout.putConstraint(SpringLayout.EAST, numberField, -62, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.WEST, nameField, 0, SpringLayout.WEST, numberField);
		appLayout.putConstraint(SpringLayout.NORTH, numberField, 10, SpringLayout.NORTH, this);
		attackField = new JTextField("");
		appLayout.putConstraint(SpringLayout.NORTH, attackLabel, 5, SpringLayout.NORTH, attackField);
		appLayout.putConstraint(SpringLayout.NORTH, attackField, -1, SpringLayout.NORTH, pokedexDropdown);
		appLayout.putConstraint(SpringLayout.WEST, attackField, 0, SpringLayout.WEST, nameField);
		healthField = new JTextField("");
		appLayout.putConstraint(SpringLayout.NORTH, healthField, 1, SpringLayout.SOUTH, nameField);
		appLayout.putConstraint(SpringLayout.WEST, healthField, 0, SpringLayout.WEST, nameField);
		appLayout.putConstraint(SpringLayout.EAST, healthField, -62, SpringLayout.EAST, this);
		modifierField = new JTextField("");
		appLayout.putConstraint(SpringLayout.NORTH, modifierField, -5, SpringLayout.NORTH, modifierLabel);
		appLayout.putConstraint(SpringLayout.WEST, modifierField, 36, SpringLayout.EAST, modifierLabel);
		appLayout.putConstraint(SpringLayout.EAST, modifierField, -62, SpringLayout.EAST, this);
		
		iconLabel = new JLabel("", new ImageIcon(getClass().getResource("/pokemon/view/PokemonImages/Pics/Pokemon.png")), JLabel.CENTER);
		appLayout.putConstraint(SpringLayout.NORTH, iconLabel, 26, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.WEST, iconLabel, 34, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.SOUTH, iconLabel, -14, SpringLayout.NORTH, pokedexDropdown);
		
		descriptionArea = new JTextArea(5, 10);
		appLayout.putConstraint(SpringLayout.EAST, iconLabel, 48, SpringLayout.EAST, descriptionArea);

		typeArea = new JTextArea(4, 15);

		
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
		firstType.setSize(50, 50);
		secondType.setSize(50, 50);
		thirdType.setSize(50, 50);
		fourthType.setSize(50, 50);
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
		this.add(iconLabel);
		this.add(evolvableBox);
	}

	private void updateImage()
	{

	}

	private void updateTypePanels()
	{
		String[] types = appController.getPokedex().get(pokedexDropdown.getSelectedIndex()).getPokemonTypes();

		// Change this to match your 3 minimum types in your pokedex
		try
		{
			switch (types[0])
			{
			case "Electric":
				firstType.setBackground(Color.YELLOW);
				break;
			case "Psychic":
				firstType.setBackground(Color.BLUE);
				break;
			case "Dragon":
				firstType.setBackground(Color.MAGENTA);
				break;
			}
		}
		catch (Exception e)
		{

		}
		try
		{
			switch (types[1])
			{
			case "Electric":
				secondType.setBackground(Color.YELLOW);
				break;
			case "Psychic":
				secondType.setBackground(Color.BLUE);
				break;
			case "Dragon":
				secondType.setBackground(Color.MAGENTA);
				break;
			}
		}
		catch (Exception e)
		{

		}
		try
		{
			switch (types[2])
			{
			case "Electric":
				thirdType.setBackground(Color.YELLOW);
				break;
			case "Psychic":
				thirdType.setBackground(Color.BLUE);
				break;
			case "Dragon":
				thirdType.setBackground(Color.MAGENTA);
				break;
			}
		}
		catch (Exception e)
		{

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
		appLayout.putConstraint(SpringLayout.SOUTH, typeArea, -3, SpringLayout.NORTH, ResetButton);
		appLayout.putConstraint(SpringLayout.WEST, typeArea, 6, SpringLayout.EAST, descriptionArea);
		appLayout.putConstraint(SpringLayout.NORTH, descriptionArea, 0, SpringLayout.NORTH, typeArea);
		appLayout.putConstraint(SpringLayout.SOUTH, pokedexDropdown, -7, SpringLayout.NORTH, descriptionArea);
		appLayout.putConstraint(SpringLayout.WEST, descriptionArea, 0, SpringLayout.WEST, pokedexDropdown);
		appLayout.putConstraint(SpringLayout.WEST, pokedexDropdown, 10, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.EAST, pokedexDropdown, -320, SpringLayout.EAST, this);
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
