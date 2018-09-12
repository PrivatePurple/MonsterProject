package Controller;

import model.MarshmallowMonster;
import java.util.Scanner;
public class monsterController
{
	//-----------Data member section------------
	
	
	
	//-----------Declaration section--------------
	
	
	
	private MarshmallowMonster myMonster;
	private MarshmallowMonster userMonster;
	
	//Constructors Initialize data members!
	public monsterController()
	{
		myMonster = new MarshmallowMonster("Porple", 6.0, 2, false, 2);
		userMonster = new MarshmallowMonster();
	}
	
	public void start()
	{
		System.out.println(myMonster);
		
		Scanner inputMonster = new Scanner(System.in);
		
		System.out.println("Time to make a new monster!");
		System.out.println("What should we name this new monster?");
		String response = inputMonster.next();
		userMonster.setName(response);
		System.out.println("Alright, this new monster's name is "+userMonster.getName()+ "!");
		
		System.out.println("How many legs should this monster have?");
		response = inputMonster.next();
		userMonster.setLegCount(Double.parseDouble(response));
		System.out.println("Your monster has "+ userMonster.getLegCount()+" legs.");
		
		System.out.println("How many eyes should it have?");
		response = inputMonster.next();
		userMonster.setEyeCount(Integer.parseInt(response));
		System.out.println("Your monster has "+userMonster.getEyeCount()+" eyes.");
	
		System.out.println("How many arms should it have?");
		response = inputMonster.next();
		userMonster.setArms(Integer.parseInt(response));
		System.out.println("Your monster has "+ userMonster.getArms()+" arms.");
	
		System.out.println("Should your monster have a nose?");
		String answer;
		boolean yn;

		System.out.println("y/n");
		while (true) {
		  answer = in.nextLine().trim().toLowerCase();
		  if (answer.equals("y")) {
		    yn = true;
		    break;
		  } else if (answer.equals("n")) {
		    yn = false;
		    break;
		  } else {
		     System.out.println("Sorry, I didn't catch that. Please answer y/n");
		  }
		}
			
	}
}
