/**
 * @author Brandon Campbell
 * @version 1.0
 */
package dndcharactercreator.races;

/** Extends from superclass NoRace. */
public class Dwarf extends NoRace
{
	/** Class variables. */
	private int speed = 25;
	private String size = "Medium";
	private String languages = "Common, Dwarven";
	private String[] racialBonus = {"Speed is unaffected when wearing heavy armor",
			"Darkvision", "Dwarven Resilience", "Dwarven Combat Training", "Tool Proficiency",
			"Stonecunning"};
	
	/** Dwarf constructor inherits parameters from NoClass. */
	public Dwarf(String name, int strength, int dexterity, int constitution,
			int intelligence, int wisdom, int charisma) 
	{
		super(name, strength, dexterity, constitution, intelligence, wisdom, charisma);
	}
	
	/**
	 * Returns the speed of a dwarf.
	 * @return speed
	 */
	public int getSpeed()
	{
		return speed;
	}
	
	/**
	 * Returns an array of each racial bonus.
	 * @return racialBonus
	 */
	public String[] getRacialBonus()
	{
		return racialBonus;
	}
	
	/**
	 * Returns naturally known languages.
	 * @return languages
	 */
	public String getLanguages()
	{
		return languages;
	}
	
	/**
	 * Returns the size of a dwarf.
	 * @return size
	 */
	public String getSize()
	{
		return size;
	}
	
	/**
	 * Returns the racially modified constitution.
	 * @return constitution + 2
	 */
	public int modifyConstitution()
	{
		return getConstitution() + 2;
	}
}