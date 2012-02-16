package com.earth2me.school;

/**
 * A pet owl.
 * 
 * @author Paul Buonopane
 * @version 1.0.0
 * @category APCS
 * @school Medfield High School
 */
final class Owl extends Bird implements IConverse
{
	/**
	 * Instantiates a new pet owl.
	 * 
	 * @param name
	 *            The name of the new pet owl.
	 */
	protected Owl(String name)
	{
		super(name, "Hoot!");
	}
	
	@Override
	public String getAnimal()
	{
		return "owl";
	}
	
	@Override
	protected String getToStringFormat()
	{
		return "%s is an %s";
	}

	/**
	 * @see com.earth2me.school.IConverse#converse(java.lang.String)
	 */
	@Override
	public String converse(String query)
	{
		return "I'm too wise to waste my time talking to you.";
	}
}
