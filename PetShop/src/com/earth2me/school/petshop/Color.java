package com.earth2me.school.petshop;

/**
 * Defines basic colors for use by pets.
 * 
 * @author Paul Buonopane
 * @version 1.0.0
 * @category APCS
 * @school Medfield High School
 */
enum Color
{
	Golden("Golden"),
	Cyan("Cyan"),
	Magenta("Magenta"),
	Yellow("Yellow"),
	Red("Red"),
	Green("Green"),
	Blue("Blue"),
	Black("Black"),
	White("White");

	public final String name;

	private Color(String name)
	{
		this.name = name;
	}

	@Override
	public String toString()
	{
		return name;
	}
}
