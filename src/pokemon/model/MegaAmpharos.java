package pokemon.model;

public class MegaAmpharos extends Ampharos implements Electric,Psychic
{
	public MegaAmpharos()
	{
		super(386, "Ampharos");
	}
	
	public MegaAmpharos(String name)
	{
		super(386, name);
		setup();
	}
	public MegaAmpharos(int number, String name)
	{
		super(number, name);
		setup();
	}
	@Override
	protected void setup()
	{
		this.setAttackPoints(350);
		this.setCanEvolve(false);
		this.setEnhancementModifier(5);
		this.setHealthPoints(300);
	}
	public int electroBall(int strength)
	{
		int sample = 259;
		
		return sample;
	}
	public int thunderBolt(int strength)
	{
		int sample = 238;
		
		return sample;
	}
	public String thunderWave()
	{
		String sample = "stuns for 5 seconds";
		
		return sample;
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
