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
			for(i=0; i<story; i++)
			if(story.indexOf(#) || story.indexOf(@) || story.indexOf(&))
			count++;

			return #;
			return @;
			return &;

		

			//While there is more of the story, read in the word/symbol
			while (reader.hasNext)
				if(reader.story(#))
				story.add(getRandomNoun);

				if(reader.story(@))
				story.add(getRandomVerb);

				if(reader.story(&))
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

		}
		catch(Exception e)
		{
			System.out.println("adjectives.dat does not exist");
		}
	}

	public String getRandomVerb()
	{
		Random randy = new Random();
		int 5 = randy.nextInt(15) + 1;

		return ""+5;
	}

	public String getRandomNoun()
	{
		Random randy = new Random();
		int x = ready.nextInt(20) + 1;
		return "" + x;
	}

	public String getRandomAdjective()
	{
		Random randy = new Random();
		int y = randy.nextInt(17) + 1;
		return "" + y;
	}

	public String toString()
	{
		
		return "";
	}
}