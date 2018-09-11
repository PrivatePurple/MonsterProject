package Controller;

import model.MarshmallowMonster;

public class monsterController
{
	//Data member section
	//Declaration section
	private MarshmallowMonster myMonster;
	
	//Constructors Initialize data members!
	public monsterController()
	{
		myMonster = new MarshmallowMonster();
	}
	
	
	public void start()
	{
		System.out.println(myMonster);
	}
}
