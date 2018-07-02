package sa.nt.test;

import sa.nt.comp.Vehicle;
import sa.nt.factory.VehicleFactory;

public class StrategyDPTest {

	public static void main(String[] args) {
		Vehicle vehicle=null,vehicle1=null;
		//get vehicle  object  from Factory
		vehicle=(Vehicle)VehicleFactory.getInstance("vehicle","petrol");
		
		vehicle.move();
		vehicle.park();
		System.out.println("............................");
		vehicle1=(Vehicle)VehicleFactory.getInstance("vehicle","petrol");
		vehicle1.move();
		vehicle1.park();

		System.out.println(vehicle.hashCode()+"   "+vehicle1.hashCode());
		
	}//main method 
}//class