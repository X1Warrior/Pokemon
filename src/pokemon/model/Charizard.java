package pokemon.model;

public class Charizard extends Pokemon implements Dragon
{	
	public Charizard()
	{
		super(386, "Charizard");
	}
	
	public Charizard(String name)
	{
		super(386, name);
		setup();
	}
	public Charizard(int number, String name)
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
