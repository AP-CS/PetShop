package com.earth2me.school.petshop;

/**
 * A pet parrot.
 * 
 * @author Paul Buonopane
 * @version 1.0.0
 * @category APCS
 * @school Medfield High School
 */
class Parrot extends Bird implements IConverse
{
	/**
	 * Instantiates a new pet parrot.
	 * 
	 * @param name
	 *            The name of the new parrot.
	 */
	public Parrot(String name)
	{
		super(name, "Squawk!");
	}
	
	@Override
	public String getAnimal()
	{
		return "parrot";
	}

	@Override
	public String converse(String query)
	{
		return String.format("Squawk!  %s  Squawk!", query);
	}
}
