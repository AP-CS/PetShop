package com.earth2me.school;

/**
 * Describes a pet snake.
 * 
 * @author Paul Buonopane
 * @version 1.0.0
 * @category APCS
 * @school Medfield High School
 */
public class Snake extends Pet
{
	private final int length;

	/**
	 * Instantiates a new pet snake with the specified name and length.
	 * 
	 * @param snakeName
	 *            Name of the snake instance.
	 * @param snakeLength
	 *            Length of the snake, in feet.
	 */
	public Snake(String snakeName, int snakeLength)
	{
		super(snakeName);
		length = snakeLength;

		attachPerformer(Pet.MOVE_ACTION, new TextPerformer("slither"));
		attachPerformer(Pet.SPEAK_ACTION, new TextPerformer("hiss !!"));
	}
	
	@Override
	public String getAnimal()
	{
		return "snake";
	}

	/**
	 * Gets the length of the snake.
	 * 
	 * @return The length of the snake, in feet.
	 */
	public final int getLength()
	{
		return length;
	}

	@Override
	protected String getToStringFormat()
	{
		return super.getToStringFormat() + " " + length + " feet in length.";
	}
}
