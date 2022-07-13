package co.design.patterns;

public abstract class Creature {
	
	protected String name;
	protected int weight;
	protected String Sound;
	
	
	public abstract void setName(String newName);
	public abstract String getName();
	
	
	public abstract void setWeight(double newWeight);
	public abstract void getWeight();
	
	
	public abstract void setSound(String newSound);
	public abstract String getSound();
	
	
	

}
