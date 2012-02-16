package com.earth2me.school;

/**
 * Provides a basic performer that simply echos text.
 * 
 * @author Paul Buonopane
 * @version 1.0.0
 * @category APCS
 * @school Medfield High School
 */
final class TextPerformer implements IActionPerformer
{
	/**
	 * The text to be echoed on perform.
	 */
	private final String text;

	/**
	 * Instantiates a new TextPerformer with the specified echo text.
	 * 
	 * @param text
	 *            The text to be echoed on perform.
	 */
	public TextPerformer(String text)
	{
		this.text = text;
	}

	@Override
	public String perform(String actionName)
	{
		return text;
	}
}
