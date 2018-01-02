package pokemon.controller;


	import java.util.List;
	import java.util.ArrayList;
	import pokemon.model.*;
	import pokemon.view.*;

	public class PokemonController 
	{
		private List<Pokemon> pokedex;
		
		PokemonFrame frame;

		public void start()
		{
			frame = new PokemonFrame(this);
		}
		
		public List<Pokemon> getPokedex()
		{
			return pokedex;
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

