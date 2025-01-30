//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class MadLib
{
	private ArrayList<String> verbs = new ArrayList<String>();
	private ArrayList<String> nouns = new ArrayList<String>();
	private ArrayList<String> adjectives = new ArrayList<String>();
	private String story = "";

	public MadLib()
	{
		verbs.add("punched");
		nouns.add("Wal-mart");
		adjectives.add("massive");
		story = "I punched Wal-mart in a massive way";
	}

	public MadLib(String fileName)
	{
		//load stuff
		loadAdjectives();
		loadNouns();
		loadVerbs();
	


		try
		{
			//Read the different parts of the story and concatenate the resulting
			//story using the symbols to tell you the parts of speech
			Scanner storyScan = new Scanner(new file("story.dat"))

			for(i=0; i<story; i++)
			if(story.storyScan("#") || story.storyScan("@") || story.storyScan("&"))
			count++;

			return #;
			return @;
			return &;

		

			//While there is more of the story, read in the word/symbol
			while (reader.Next)
				if(reader.story("#"))
				story.add(getRandomNoun);

				 else if(reader.story("@"))
				story.add(getRandomVerb);

				else if(reader.story("&"))
				story.add(getRandomAdjective);

				//If what was read in is one of the symbols, find a random
				//word to replace it.
			


		}
		catch(Exception e)
		{
			System.out.println("Houston we have a problem!");
		}

	}

	public void loadNouns()
	{
		try
		{
			Scanner reader = new Scanner(new File("nouns.dat"));

			while(reader.hasNext());
			{
				nouns.add(reader.next());
			}
		}
		catch(Exception e)
		{
			System.out.println("nouns.dat does not exist");
		}

	}

	public void loadVerbs()
	{
		try
		{
			Scanner readerTwo = new Scanner(new File("verbs.dat"));

			while(readerTwo.hasNext());
			{
				verbs.add(readerTwo.next());
			}
		}
		catch(Exception e)
		{
			System.out.println("verbs.dat does not exist");
		}
	}

	public void loadAdjectives()
	{
		try
		{
			Scanner readerThree = new Scanner(new File("adjectives.dat"));

			while(readerThree.hasNext());
			{
				adjectives.add(readerThree.next());
			}
		}
		catch(Exception e)
		{
			System.out.println("adjectives.dat does not exist");
		}
	}

	public String getRandomVerb()
	{
		int spot = Math.random()*verbs.size();

		return "" + verbs.get(spot);
	}

	public String getRandomNoun()
	{
		Random rand = new Random();
		
		return "" + nouns.get(rand.nextInt(nouns.size()));
	}

	public String getRandomAdjective()
	{
		int spot = Math.random()*adjectives.size();
		
		return "" + adjectives.get(spot);
	}

	public String toString()
	{

		return "";
	}
}