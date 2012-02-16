package com.earth2me.school;

/**
 * A pet capable of holding a two-way conversation.
 * 
 * @author Paul Buonopane
 * @version 1.0.0
 * @category APCS
 * @school Medfield High School
 */
interface IConverse
{
	/**
	 * Converse with the pet.
	 * 
	 * @param query
	 *            The prompt to which the pet will reply.
	 * @return The pet's reply.
	 */
	String converse(String query);
}
