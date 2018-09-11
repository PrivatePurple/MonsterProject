package Controller;

import model.MarshmallowMonster;

public class monsterController
{
	//-----------Data member section------------
	
	
	
	//-----------Declaration section--------------
	
	
	
	private MarshmallowMonster myMonster;
	
	//Constructors Initialize data members!
	public monsterController()
	{
		myMonster = new MarshmallowMonster("Porple", 6.0, 2, false, 2);
	}
	
	public void start()
	{
		System.out.println(myMonster);
	}
}
