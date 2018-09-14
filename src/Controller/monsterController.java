package Controller;

import model.MarshmallowMonster;
import java.util.Scanner;
import javax.swing.JOptionPane;


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
		JOptionPane.showMessageDialog(null,myMonster);
		System.out.println(myMonster);
		
		Scanner inputMonster = new Scanner(System.in);
		
		//System.out.println("Time to make a new monster!");
		//System.out.println("What should we name this new monster?");
		String userInput = JOptionPane.showInputDialog(null, "What should it's name be?");
		userMonster.setName(userInput);
		//String response = inputMonster.next();
		//userMonster.setName(response);
		//System.out.println("Alright, this new monster's name is "+userMonster.getName()+ "!");
		JOptionPane.showMessageDialog(null, "Your monster's name is " +userMonster.getName());
		
		
		
		//System.out.println("How many legs should this monster have?");
		userInput = JOptionPane.showInputDialog(null, "How many Legs should it have?");
		//response = inputMonster.next();
		if(!validDouble(userInput))
		{
			JOptionPane.showMessageDialog(null, "Please Try again.");
		}
		userMonster.setLegCount(Double.parseDouble(userInput));
		//System.out.println("Your monster has "+ userMonster.getLegCount()+" legs.");
		JOptionPane.showMessageDialog(null, "Your monster has "+ userMonster.getLegCount()+" legs.");
		
		
		
		//System.out.println("How many eyes should it have?");
		JOptionPane.showInputDialog(null, "How many Eyes should it have?");
		//response = inputMonster.next();
		userMonster.setEyeCount(Integer.parseInt(userInput));
		//System.out.println("Your monster has "+userMonster.getEyeCount()+" eyes.");
		JOptionPane.showMessageDialog(null, "Your monster has "+userMonster.getEyeCount()+" eyes.");
	
		
		
		//System.out.println("How many arms should it have?");
		//JOptionPane.showMessageDialog(null, "How many Arms should it have?");
		userInput = JOptionPane.showInputDialog(null, "How many arms for your monster?");
		int arms = -99;
		if(validInt(userInput))
		{
			arms = Integer.parseInt(userInput);
		}
		
		boolean answer = Boolean.parseBoolean(userInput);
		userMonster.setArms(arms);
		
		//System.out.println("Your monster has "+ userMonster.getArms()+" arms.");
		JOptionPane.showMessageDialog(null, "Your monster has "+ userMonster.getArms()+" arms.");
		
		JOptionPane.showInputDialog(null, "Does your monster have a nose?");
		//response = inputMonster.next();
		if(userInput.toLowerCase().equals("yes") || userInput.toLowerCase().equals("true"))
				{
				userMonster.setHasNose(true);
				JOptionPane.showMessageDialog(null, "Your monster has a nose! Hooray!");
				}
					else if(userInput.toLowerCase().equals("no") || userInput.toLowerCase().equals("false")) 
				{
					JOptionPane.showMessageDialog(null,"Your monster has no nose.");
				}
	
	}
		public boolean validInt(String maybeInt)
		{
			boolean isValid = false;
			
			try
			{
				Integer.parseInt(maybeInt);
				isValid = true;
			}
			catch (NumberFormatException error)
			{
				JOptionPane.showMessageDialog(null, "You need to type in a whole number! :D");	
			}
			
			return isValid;
		}
		
		public boolean validDouble(String maybeDouble)
		{
			boolean isValid = false;
			try
			{
				Double.parseDouble(maybeDouble);
				isValid = true;
			}
			catch (NumberFormatException error)
			{
				JOptionPane.showMessageDialog(null, "One more time, please. (No decimals this time.");
			}
			return isValid;
		}
}
