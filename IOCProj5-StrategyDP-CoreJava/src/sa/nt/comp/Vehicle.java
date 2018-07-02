package sa.nt.comp;

public class Vehicle {
	private Engine engg;
	
	public Vehicle() {
		System.out.println("Viechle:0-param constuctor");
	}
	
	public void setEngg(Engine engg){
		System.out.println("Viechle::setEngg(-)");
		this.engg=engg;
	}
	
	public void move(){
		engg.start();
		System.out.println("Viechle is moving.....");
	}
	
	public void park(){
		engg.stop();
		System.out.println("Viechled Parked for rest");
	}

}
