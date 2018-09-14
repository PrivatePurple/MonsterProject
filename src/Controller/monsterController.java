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
	
		System.out.println("Does your monster have a nose?");
		if(response.toLowerCase().equals("yes") || response.toLowerCase().equals("true"))
				{
					userMonster.setHasNose(true);
					System.out.println("Your monster has a nose! Hooray!");
				}
					else if(response.toLowerCase().equals("no") || response.toLowerCase().equals("false")) 
				{
					System.out.println("Your monster has no nose.");
				}
	}
}
