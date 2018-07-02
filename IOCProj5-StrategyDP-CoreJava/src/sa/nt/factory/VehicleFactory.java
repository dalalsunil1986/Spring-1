package sa.nt.factory;

import java.util.HashMap;
import java.util.Map;

import sa.nt.comp.CNGEngine;
import sa.nt.comp.DieselEngine;
import sa.nt.comp.Engine;
import sa.nt.comp.PetrolEngine;
import sa.nt.comp.Vehicle;

public class VehicleFactory {
	private static Map<String,Object> cacheMap=new HashMap<String, Object>();
	
	public static Object getInstance(String nickName,String engineType){
		 Engine engg=null;
		 Vehicle vehicle =null;
		if(!cacheMap.containsKey(nickName)){
			if(nickName.equals("dEngg")){
				engg=new DieselEngine();
				cacheMap.put(nickName,engg);
			}
			else if(nickName.equals("pEngg")){
				engg=new PetrolEngine();
				cacheMap.put(nickName,engg);
			}
			else if(nickName.equals("cEngg")){
				engg=new CNGEngine();
				cacheMap.put(nickName,engg);
			}
			else if(nickName.equals("vehicle")){
				vehicle=new Vehicle();
				if(engineType.equals("diesel")){
				   engg=new DieselEngine();
				   vehicle.setEngg(engg);
				}
				else if(engineType.equals("petrol")){
					   engg=new PetrolEngine();
					   vehicle.setEngg(engg);
				}
				else if(engineType.equals("cng")){
					   engg=new CNGEngine();
					   vehicle.setEngg(engg);
				}
				else{
					throw new IllegalArgumentException("inavalid Engine type");
				}
				cacheMap.put(nickName,vehicle);
			}
			else{
				throw new IllegalArgumentException("Invalid NickName");
			}
		}//if
			return cacheMap.get(nickName);
		
	}//getInstance()
}//class

