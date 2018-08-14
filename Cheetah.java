
public class Cheetah extends Animal{

	public Cheetah(String name, double weight, String sound) {
		super(name, weight, sound, "Cheetah");
	}
	
	public void whatSound(){
		System.out.println("Cheetah's make a "+getSound());
	}
	
	public void weight(){
		System.out.println("He weights "+getWeight());
	}
	
	public void weight(boolean personal){
		if(personal){
			System.out.println(getName()+" weights "+getWeight());
		}else{
			weight();
		}
	}
}
