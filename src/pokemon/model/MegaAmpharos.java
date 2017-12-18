package pokemon.model;

public class MegaAmpharos extends Ampharos implements Electric,Psychic
{
	public MegaAmpharos(int number, String name)
	{
		super(number, name);
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
