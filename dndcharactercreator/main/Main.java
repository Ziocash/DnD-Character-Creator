/**
 * @author Brandon Campbell
 * @version 1.0
 * The character creator is intended for the use of creating a level 1 5th edition
 * Dungeons & Dragons character. It will automatically calculate the remaining fields
 * for you to fill in once you provide the program with the six base stats needed.
 */
package dndcharactercreator.main;
import dndcharactercreator.classes.*;
import dndcharactercreator.races.*;

public class Main {

	public static void main(String[] args) 
	{
		MountainDwarf dwarf = new MountainDwarf("Rhaegar", 8, 9, 10, 11, 12, 13);
		System.out.println(dwarf.getName());
		System.out.println("Strength: " + dwarf.getStrength());
		System.out.println("Dexterity: " + dwarf.getDexterity());
		System.out.println("Constitution: " + dwarf.modifyConstitution());
		System.out.println("Intelligence: " + dwarf.getIntelligence());
		System.out.println("Wisdom: " + dwarf.modifyStrength());
		System.out.println("Charisma: " + dwarf.getCharisma());
		System.out.println("Racial traits: " + dwarf.getSize());
		System.out.println("Racial traits: " + dwarf.getSpeed());
		System.out.println("Racial traits: " + dwarf.getLanguages());
		for(String arrayIndex : dwarf.getRacialBonus())
		{
			System.out.println(arrayIndex);
		}
		System.out.println(dwarf.getSubRacialBonus());

	}

}