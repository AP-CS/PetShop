package com.earth2me.school;

/**
 * A pet white cat.
 * 
 * @author Paul Buonopane
 * @version 1.0.0
 * @category APCS
 * @school Medfield High School
 */
final class WhiteCat extends Cat
{
	/**
	 * Instantiates a new white cat.
	 * 
	 * @param name
	 *            The name of the new cat.
	 */
	public WhiteCat(String name)
	{
		super(name, "purrrr...");
	}
	
	@Override
	public String getAnimal()
	{
		return "white cat";
	}

	@Override
	public Color getColor()
	{
		return Color.White;
	}

	@Override
	public int getFluffIndex()
	{
		return 12;
	}
}
