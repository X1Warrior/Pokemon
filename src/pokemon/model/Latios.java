package pokemon.model;

public class Latios extends Pokemon implements Electric,Dragon
{
	public Latios()
	{
		super(386, "Latios");
	}
	
	public Latios(String name)
	{
		super(386, name);
		setup();
	}
	public Latios(int number, String name)
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
	public int dracoMeteor(int strength)
	{
		int sample = 183;
		
		return sample;
	}

	public int flameThrower(int strength)
	{
		int sample = 190;
		
		return sample;
	}
	public int dragonPulse(int strength)
	{
		int sample = 179;
		
		return sample;
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
		String sample = "stuned for 3 seconds";
		
		return sample;
	}
}
