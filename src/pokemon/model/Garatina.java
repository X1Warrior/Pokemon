package pokemon.model;

public class Garatina extends Pokemon implements Dragon
{
	public Garatina()
	{
		super(386, "Ampharos");
	}
	
	public Garatina(String name)
	{
		super(386, name);
		setup();
	}
	public Garatina(int number, String name)
	{
		super(number, name);
		setup();
	}
	protected void setup()
	{
		this.setAttackPoints(360);
		this.setCanEvolve(false);
		this.setEnhancementModifier(5);
		this.setHealthPoints(414);
	}
public int dracoMeteor(int strength)
{
	int sample = 283;
	
	return sample;
}

public int flameThrower(int strength)
{
	int sample = 290;
	
	return sample;
}
public int dragonPulse(int strength)
{
	int sample = 279;
	
	return sample;
}
}
