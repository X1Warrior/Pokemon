package pokemon.view;

import pokemon.controller.PokemonController;
import javax.swing.JFrame;

public class PokemonFrame extends JFrame
{
		private PokemonController appController;
		private PokemonPanel appPanel;
		
		public PokemonFrame(PokemonController appController)
		{
			super();
			this.appController = appController;
			this.appPanel = new PokemonPanel(appController);
			
			setupFrame(); 
			}
		
		private void setupFrame()
		{
			this.setContentPane(PokemonPanel);
			this.setTitle("PokeDex");
			this.setResizable(false);
			this.setSize(600,600);
			this.setVisible(true);
		}

}
