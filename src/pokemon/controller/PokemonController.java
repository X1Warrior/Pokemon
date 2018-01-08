package pokemon.controller;


	import pokemon.model.*;
	import pokemon.view.PokemonFrame;
	
	import java.util.List;
	import java.util.ArrayList;


	public class PokemonController 
	{
		private List<Pokemon> pokedex;
		
		private PokemonFrame appframe;

		public PokemonController()
		{
			pokedex = new ArrayList<Pokemon>();
			appframe = new PokemonFrame(this);
		}
		
		public void buildPokedex()
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
		
		public boolean isValidInt(String sample) 
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
	}

