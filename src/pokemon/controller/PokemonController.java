package pokemon.controller;


	import pokemon.model.*;
	import pokemon.view.PokemonFrame;
	
	import java.util.List;
	import java.util.ArrayList;


	public class PokemonController 
	{
		private List<Pokemon> pokedex;
		
		private PokemonFrame appFrame;

		public PokemonController()
		{
			pokedex = new ArrayList<Pokemon>();
			buildPokedex();
			appFrame = new PokemonFrame(this);
		}
		
		private void buildPokedex()
		{
			pokedex.add(new Latios());
			pokedex.add(new Ampharos());
			pokedex.add(new MegaAmpharos());
			pokedex.add(new Charizard());
			pokedex.add(new Garatina());
			pokedex.add(new Alakazam());
			
		}
		public List<Pokemon> getPokedex()
		{
			return pokedex;
		}
		
		public String [] convertPokedex()
		{
			String [] names = new String [pokedex.size()];
			
			for(int index = 0; index < pokedex.size(); index++)
			{
				names[index] = pokedex.get(index).getName();
			}
			
			return names;
		}
		
		public void updateSelected(int selection, int health, int attack, boolean evolve, double modify, String name)
		{
			Pokemon selected = pokedex.get(selection);
			
			selected.setAttackPoints(attack);
			selected.setCanEvolve(evolve);
			selected.setEnhancementModifier(modify);
			selected.setName(name);
			selected.setHealthPoints(health);
			
			FileController.savePokemonToFile((ArrayList<Pokemon>) pokedex);
		}
		
		
		public boolean isValidInteger(String sample) 
		{
			try 
			{
				Integer.parseInt(sample);
			}
			catch (NumberFormatException e) 
			{
				return false;
			}
			
			return true;
		}
		
		public boolean isValidDouble(String sample) 
		{
			try 
			{
				Double.parseDouble(sample);
			}
			catch (NumberFormatException e) 
			{
				return false;
			}
			
			return true;
		}
		

		public void start()
		{
			
		}
	}

