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
		//Default constructor - Generally boring and not helpful
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

	public String getName()
	{
		return name; //Return is the immediate exit point for a method. As soon as the return is hit, the rest of the code is ignored.
	}
	
	public double getLegCount()
	{
		return legCount;
	}
	
	public int getEyeCount()
	{
		return eyeCount;
	}
	
	public boolean getHasNose()
	{
		return hasNoses;
	}
	
	public int getArms()
	{
		return armcount;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setLegCount(double legCount)
	{
		this.legCount = legCount;
	}
	
	public void setEyeCount(int eyeCount)
	{
		this.eyeCount = eyeCount;
	}

	public void setHasNose(boolean hasNose)
	{
		this.hasNoses = hasNose;
	}
	
	public void setArms(int arms)
	{
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
