package com.earth2me.school.petshop;

/**
 * Handles an pet action.
 * 
 * @author Paul Buonopane
 * @version 1.0.0
 * @category APCS
 * @school Medfield High School
 */
interface IActionHandler
{
	/**
	 * Executed after the action is performed.
	 * 
	 * @param output
	 *            The text result of the action.
	 */
	void callback(String result);
}
