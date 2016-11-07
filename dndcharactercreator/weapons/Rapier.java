package dndcharactercreator.weapons;

public class Rapier implements Wieldable
{
	private String damageDie = "1d8";
	private String damageType = "Piercing";
	private int weight = 2;
	private String properties = "Finesse";
	
	Rapier()
	{
		
	}
	
	public String getDamageDie()
	{
		return this.damageDie;
	}
	
	public String getDamageType()
	{
		return this.damageType;
	}
	
	public int getWeight()
	{
		return this.weight;
	}
	
	public String getProperties()
	{
		return this.properties;
	}
}