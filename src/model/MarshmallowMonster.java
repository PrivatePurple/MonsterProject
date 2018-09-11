package model;

public class MarshmallowMonster
{
	//-----------Declaration section----------
	private String name;
	private double legCount;
	private int eyeCount;
	private boolean hasNoses;
	private int armcount;
	
	
	public MarshmallowMonster()
	{
		//Default constructor
		//Generally boring and not as helpful
	}
	
	public MarshmallowMonster(String name)
	{
		this.name = name;	
	}
	
	public MarshmallowMonster(String name, double legCount, int eyeCount, boolean hasNose, int arms)
	{
		this.hasNoses = hasNose;
		this.legCount = legCount;
		this.eyeCount = eyeCount;
		this.armcount = arms;
	}

	
	
	public String toString()
	{
		String description = "This monster is named " + name 
								+ " and it has " + legCount + " legs..."
								+ " it's favorite thing to say is:"
								+ " taxation is theft." ;
		
		return description;
	}
}
