package com.earth2me.school.petshop;

/**
 * A pet bird.
 * 
 * @author Paul Buonopane
 * @version 1.0.0
 * @category APCS
 * @school Medfield High School
 */
class Bird extends Pet
{
	public final static String FLY_ACTION = "fly";

	/**
	 * Instantiates a new pet bird.
	 * 
	 * @param name
	 *            The name of the bird.
	 * @param sound
	 *            The sound that the bird makes when it talks.
	 */
	protected Bird(String name, String sound)
	{
		super(name);

		attachPerformer(SPEAK_ACTION, new TextPerformer(sound));
		attachPerformer(MOVE_ACTION, new TextPerformer("fly"));
		attachPerformer(FLY_ACTION, new TextPerformer("flies away"));
	}
	
	@Override
	public String getAnimal()
	{
		return "bird";
	}
}
