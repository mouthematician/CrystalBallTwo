package com.example.crystalballtwo;

import java.util.Random;

import android.content.res.Resources;

public class CrystalBall {
	//Member variables (properties about the object)
	public static String[] mAnswers;
	
	//Removed mAnswers initialization to strings.xml
	//Resources resources = getResources();
	//mAnswers = resources.getStringArray
	
	//Methods (abilities: things the object can do)
	public String getAnAnswer() {
		
		String answer = "";
		
		
		Random randomGenerator = new Random(); //Construct a new random number generator
		int randomNumber = randomGenerator.nextInt(mAnswers.length);
		
		answer = mAnswers[randomNumber];
		
		return answer;
	}

}
