package pokemon.model;

public class Latias extends Pokemon implements Electric,Dragon
{
	public Latias(int number, String name)
	{
		super(number, name);
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
