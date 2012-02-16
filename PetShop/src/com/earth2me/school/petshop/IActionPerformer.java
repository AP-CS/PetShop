package com.earth2me.school.petshop;

/**
 * Represents a delegate for a method that performs a pet action.
 * 
 * @author Paul Buonopane
 * @version 1.0.0
 * @category APCS
 * @school Medfield High School
 */
interface IActionPerformer
{
	/**
	 * Perform the specified action.
	 * 
	 * @param actionName
	 *            The action to be performed.
	 * @return The text result of the action.
	 */
	String perform(String actionName);
}
