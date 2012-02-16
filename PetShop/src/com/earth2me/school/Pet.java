package com.earth2me.school;

import java.util.HashMap;
import java.util.Map;

/**
 * Defines a basic pet from which all concrete pets extend.
 * 
 * @author Paul Buonopane
 * @version 1.0.0
 * @category APCS
 * @school Medfield High School
 */
public abstract class Pet
{
	public static final String MOVE_ACTION = "move";
	public static final String SPEAK_ACTION = "speak";

	/**
	 * The name of the pet.
	 */
	private final String name;

	/**
	 * Stores a list of actions and their associated performers set by the pet
	 * implementation.
	 */
	private final Map<String, IActionPerformer> Performers = new HashMap<String, IActionPerformer>();
	
	/**
	 * Gets the type of animal of the pet.
	 * @return The type of animal of the pet.
	 */
	public abstract String getAnimal();

	/**
	 * Instantiates a new pet with the given name.
	 * 
	 * @param name
	 *            The instance name of the new pet.
	 */
	public Pet(String name)
	{
		this.name = name;
	}

	/**
	 * When implemented by a supporting class, instructs the pet to move.
	 * 
	 * @param handler
	 *            The callback to be invoked upon successful movement.
	 * @param format
	 *            The string used to format the output.
	 * @return true if action is implemented; false otherwise.
	 */
	public final boolean move(IActionHandler handler, String format)
	{
		return performAction(MOVE_ACTION, handler, format);
	}

	/**
	 * When implemented by a supporting class, instructs the pet to speak.
	 * 
	 * @param handler
	 *            The callback to be invoked upon successful speech.
	 * @param format
	 *            The string used to format the output.
	 * @return true if action is implemented; false otherwise.
	 */
	public final boolean speak(IActionHandler handler, String format)
	{
		return performAction(SPEAK_ACTION, handler, format);
	}

	/**
	 * Gets the instance name of the pet.
	 * 
	 * @return The instance name of the pet.
	 */
	public final String getName()
	{
		return name;
	}

	@Override
	public final String toString()
	{
		return String.format(getToStringFormat(), name, getAnimal());
	}

	/**
	 * Gets the format used to generate the return value for toString().
	 * 
	 * @return A format that takes one string parameter: the instance name of
	 *         the pet.
	 */
	protected String getToStringFormat()
	{
		return "%s is a %s";
	}

	/**
	 * Performs an action by name, if the action exists.
	 * 
	 * @param action
	 *            The name of the action to perform.
	 * @param format
	 *            The string used to format the output.
	 * @return true if the action exists, and the handler was invoked; false
	 *         otherwise.
	 */
	public final boolean performAction(String action, IActionHandler handler, String format)
	{
		if (Performers.containsKey(action))
		{
			String result = Performers.get(action).perform(action);
			handler.callback(String.format(format, result, name));
			return true;
		}
		else
		{
			return false;
		}
	}

	/**
	 * Attach a performer to handle the specified action.
	 * 
	 * @param action
	 *            The name of the action to be handled.
	 * @param performer
	 *            The performer to handle the action.
	 */
	protected final void attachPerformer(String action, IActionPerformer performer)
	{
		Performers.put(action, performer);
	}

	/**
	 * Remove the performer for the specified action.
	 * 
	 * @param action
	 *            The name of the action to remove.
	 */
	protected final void detachPerformer(String action)
	{
		Performers.remove(action);
	}
}
