package pokemon.model;

public class Ampharos extends Pokemon implements Electric
{
	public Ampharos(int number, String name)
	{
		super(number, name);
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
