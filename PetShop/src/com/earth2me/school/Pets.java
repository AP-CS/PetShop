package com.earth2me.school;

/**
 * Defines the main logic for the application.
 * 
 * @author Paul Buonopane
 * @version 1.0.0
 * @category APCS
 * @school Medfield High School
 */
public class Pets implements IActionHandler, Runnable
{
	private final Dog fido = new Dog("Fido", 45);
	private final Snake sam = new Snake("Sam", 6);
	private final Chihuahua perro = new Chihuahua("El Guapo", 2);
	private final Parrot pauly = new Parrot("Pauly");
	private final GoldenRetriever bud = new GoldenRetriever("Bud", 135);
	private final BlackCat halloween = new BlackCat("Halloween");
	private final WhiteCat snowball = new WhiteCat("Snowball");
	private final Owl ego = new Owl("Ego");
	private final Pet[] pets = new Pet[] {
			fido,
			sam,
			perro,
			pauly,
			bud,
			halloween,
			snowball,
			ego,
	};

	/**
	 * Instantiate a new Pets object.
	 */
	public Pets()
	{
		perro.setCityOfOrigin("Ciudad Juarez");
	}

	/**
	 * Entry point.
	 * 
	 * @param args
	 *            Command line arguments.
	 */
	public static void main(String args[])
	{
		Pets pets = new Pets();
		pets.run();
	}

	@Override
	public void run()
	{
		for (Pet p : pets)
		{
			printPet(p);
		}
	}

	/**
	 * Print a summary of the specified pet instance.
	 * 
	 * @param pet
	 *            The instance to print.
	 */
	private void printPet(final Pet pet)
	{
		if (pet instanceof Chihuahua)
		{
			System.out.println(pet + " from " + ((Chihuahua)pet).getCityOfOrigin());
		}
		else
		{
			System.out.println(pet);
		}

		if (pet instanceof IColored)
		{
			System.out.println(pet.getName() + " is " + ((IColored)pet).getColor() + " in color.");
		}

		if (pet instanceof IFluffy)
		{
			System.out.println(pet.getName() + " is " + ((IFluffy)pet).getFluffIndex() + " on the fluff scale.");
		}

		pet.speak(this, "%2$s says %1$s");
		if (pet instanceof IConverse)
		{
			final String query = pet.getName() + ", how are you today?";
			System.out.println(query);
			System.out.println(((IConverse)pet).converse(query));
		}

		pet.move(this, "%1$s %2$s %1$s");
		pet.performAction(GoldenRetriever.RETRIEVE_ACTION, this, "%2$s %1$s a stick.");

		pet.performAction(Bird.FLY_ACTION, this, "%2$s %1$s.");

		System.out.println();
	}

	@Override
	public void callback(String result)
	{
		System.out.println(result);
	}
}
