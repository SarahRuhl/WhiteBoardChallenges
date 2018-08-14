
public class Animal {
	private String name;
	private String type;
	private double weight;
	private String sound;
	
	public Animal(String name, double weight, String sound, String type) {
		this.name = name;
		this.weight = weight;
		this.sound = sound;
		this.type = type;
	}
	
	public String getName(){
		return this.name;
	}
	
	public String getType(){
		return this.type;
	}
	
	public String getSound(){
		return this.sound;
	}
	
	public double getWeight(){
		return this.weight;
	}
	
	public void whatSound(){
		System.out.println("This animal makes the sound "+ sound);
	}
	
	public void setWeight(double w){
		this.weight =w;
	}
	
}
