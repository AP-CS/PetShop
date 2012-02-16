package com.earth2me.school.petshop;

/**
 * Represents a pet Golden Retriever dog.
 * 
 * @author Paul Buonopane
 * @version 1.0.0
 * @category APCS
 * @school Medfield High School
 */
final class GoldenRetriever extends Dog implements IColored
{
	public static final String RETRIEVE_ACTION = "retrieve";

	/**
	 * Instantiates a new pet Golden Retriever.
	 * 
	 * @param name
	 *            The name of the new instance.
	 * @param weight
	 *            The weight of the pet, in pounds.
	 */
	public GoldenRetriever(String name, int weight)
	{
		super(name, weight);

		attachPerformer(RETRIEVE_ACTION, new TextPerformer("quickly retrieves"));
	}
	
	@Override
	public String getAnimal()
	{
		return "Golden Retriever";
	}

	@Override
	public Color getColor()
	{
		return Color.Golden;
	}
}
