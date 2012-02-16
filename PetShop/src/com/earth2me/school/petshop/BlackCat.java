package com.earth2me.school.petshop;

/**
 * A pet black cat.
 * 
 * @author Paul Buonopane
 * @version 1.0.0
 * @category APCS
 * @school Medfield High School
 */
final class BlackCat extends Cat
{
	/**
	 * Instantiates a new black cat.
	 * 
	 * @param name
	 *            The name of the new cat.
	 */
	public BlackCat(String name)
	{
		super(name, "MEOW");
	}
	
	@Override
	public String getAnimal()
	{
		return "black cat";
	}

	@Override
	public Color getColor()
	{
		return Color.Black;
	}

	@Override
	public int getFluffIndex()
	{
		return 5;
	}
}
