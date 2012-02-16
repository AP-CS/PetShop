package com.earth2me.school;

/**
 * A pet Chihuahua.
 * 
 * @author Paul Buonopane
 * @version 1.0.0
 * @category APCS
 * @school Medfield High School
 */
public class Chihuahua extends Dog
{
	/**
	 * The city in which the chihuahua was born.
	 */
	private String cityOfOrigin;

	/**
	 * Instantiates a new chihuahua with the specified name and weight.
	 * 
	 * @param name
	 *            Name of the pet.
	 * @param weight
	 *            Weight of the pet, in pounds.
	 */
	public Chihuahua(String name, int weight)
	{
		super(name, weight, "little tiny steps", "chalupa !!");
	}
	
	@Override
	public String getAnimal()
	{
		return "chihuahua";
	}

	/**
	 * Sets the city in which the chihuahua was born.
	 * 
	 * @param cityOfOrigin
	 *            The city in which the chihuahua was born.
	 */
	public void setCityOfOrigin(String cityOfOrigin)
	{
		this.cityOfOrigin = cityOfOrigin;
	}

	/**
	 * Gets the city in which the chihuahua was born.
	 * 
	 * @return The city in which the chihuahua was born.
	 */
	public String getCityOfOrigin()
	{
		return cityOfOrigin;
	}
}
