package pokemon.view;

import javax.swing.JFrame;
import pokemon.controller.PokemonController;
import pokemon.view.PokemonPanel;

public class PokemonFrame extends JFrame
{
	{
		private PokemonController PokemonController;
		private PokemonPanel PokemonPanel;
		
		public PokemonFrame(PokemonController PokemonController)
		{
			super();
			this.PokemonController = PokemonController;
			this.PokemonPanel = new PokemonPanel(PokemonController);
			
			setupFrame(); 
			}
		
		private void setupFrame()
		{
			this.setContentPane(PokemonPanel);
			this.setTitle("chatting with the chatbot");
			this.setResizable(false);
			this.setSize(600,600);
			this.setVisible(true);
		}
	}

}
