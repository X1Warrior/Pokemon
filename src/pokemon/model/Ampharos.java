package pokemon.model;

public class Ampharos extends Pokemon implements Electric
{
	public Ampharos()
	{
		super(386, "Ampharos");
	}
	
	public Ampharos(String name)
	{
		super(386, name);
		setup();
	}
	public Ampharos(int number, String name)
	{
		super(number, name);
		setup();
	}
	protected void setup()
	{
		this.setAttackPoints(250);
		this.setCanEvolve(false);
		this.setEnhancementModifier(5);
		this.setHealthPoints(300);
	}
	public int electroBall(int strength)
	{
		int sample = 179;
		
		return sample;
	}
	public int thunderBolt(int strength)
	{
		int sample = 183;
		
		return sample;
	}
	public String thunderWave()
	{
		String sample = "stuns for 3 seconds";
		
		return sample;
	}
}
