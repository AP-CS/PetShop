package com.earth2me.school;

/**
 * Describes a pet dog.
 * 
 * @author Paul Buonopane
 * @version 1.0.0
 * @category APCS
 * @school Medfield High School
 */
public class Dog extends Pet
{
	/**
	 * Weight of the dog, in pounds.
	 */
	private final int weight;

	/**
	 * Instantiates a new pet dog with the specified name and weight.
	 * 
	 * @param name
	 *            Name of the new pet dog.
	 * @param weight
	 *            Weight of the dog, in pounds.
	 */
	public Dog(String name, int weight)
	{
		this(name, weight, "run", "woof !!");
	}
	
	@Override
	public String getAnimal()
	{
		return "dog";
	}

	/**
	 * Instantiates a new pet dog with custom performers.
	 * 
	 * @param name
	 *            Name of the new pet dog.
	 * @param weight
	 *            Weight of the dog, in pounds.
	 * @param movement
	 *            Move performer output text.
	 * @param sound
	 *            Speak performer output text.
	 */
	protected Dog(String name, int weight, String movement, String sound)
	{
		super(name);
		this.weight = weight;

		attachPerformer(Pet.MOVE_ACTION, new TextPerformer(movement));
		attachPerformer(Pet.SPEAK_ACTION, new TextPerformer(sound));
	}

	/**
	 * Gets the weight of the dog.
	 * 
	 * @return Weight of the dog, in pounds.
	 */
	public int getWeight()
	{
		return weight;
	}

	@Override
	protected String getToStringFormat()
	{
		return super.getToStringFormat() + " weighing " + weight + " pounds.";
	}
}
