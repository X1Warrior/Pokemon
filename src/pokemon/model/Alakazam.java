package pokemon.model;

public class Alakazam extends Pokemon implements Psychic
{
	public Alakazam()
	{
		super(386, "Alakazam");
	}
	
	public Alakazam(String name)
	{
		super(386, name);
		setup();
	}
	public Alakazam(int number, String name)
	{
		super(number, name);
		setup();
	}
	protected void setup()
	{
		this.setAttackPoints(250);
		this.setCanEvolve(true);
		this.setEnhancementModifier(5);
		this.setHealthPoints(264);
	}
	public int Pyschic(int strength)
	{
		int sample = 183;
		
		return sample;
	}

	public double Confusion(double strength)
	{
		double sample = 190;
		
		return sample;
	}
	public int futureSight(int strength)
	{
		int sample = 179;
		
		return sample;
	}
}
