package pokemon.model;

public class Charizard extends Pokemon implements Dragon
{
	
	public Charizard(int number, String name)
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
}
