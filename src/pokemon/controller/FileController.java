package pokemon.controller;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileNotFoundException;
import pokemon.model.Pokemon;
import java.io.File;

public class FileController
{
	public static void savePokemonToFile(ArrayList<Pokemon> pokedex)
	{
		File saveFile = new File("Saved Pokedex.txt");
		try
		{
			PrintWriter writeToDisk = new PrintWriter(saveFile);
			
			for(int index = 0; index < pokedex.size(); index++)
			{
				String name = pokedex.get(index).getName();
				int number = pokedex.get(index).getNumber();
				int health = pokedex.get(index).getHealthPoints();
				int attack = pokedex.get(index).getAttackPoints();
				boolean evolve = pokedex.get(index).isCanEvolve();
				double modify = pokedex.get(index).getEnhancementModifier();
				
				String row = name + "," + number + "," + health + "," + attack + "," + modify + "," + evolve;
				
				writeToDisk.println(row);
			}
			writeToDisk.close();
		}
		catch (FileNotFoundException error)
		{
			System.out.println("There was an error:" + error.getMessage());
		}
	}
	
	
}
