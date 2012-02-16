package com.earth2me.school;

/**
 * A pet cat.
 * 
 * @author Paul Buonopane
 * @version 1.0.0
 * @category APCS
 * @school Medfield High School
 */
abstract class Cat extends Pet implements IColored, IFluffy
{
	@Override
	public abstract Color getColor();

	@Override
	public abstract int getFluffIndex();

	/**
	 * Instantiates a new pet cat.
	 * 
	 * @param name
	 *            The name of the cat.
	 * @param sound
	 *            The sound the cat makes when it speaks.
	 */
	protected Cat(String name, String sound)
	{
		super(name);

		attachPerformer(SPEAK_ACTION, new TextPerformer(sound));
		attachPerformer(MOVE_ACTION, new TextPerformer("patter patter"));
	}
	
	@Override
	public String getAnimal()
	{
		return "cat";
	}
}
