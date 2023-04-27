package Service;

import model.GreenModel;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;

public class calculate {
	
	/**
	 * The final result is calculated here using the provided table . It can also extend onto more complex data if needed 
	 * @param object
	 * @return
	 */
	public String cal(GreenModel object) {
		String distance = object.getDistance();
		String vehicle = object.getVehicle();
		String unit = object.getUnit();
		String unitWt = object.getWeightUnit();
		double emmS = 0;
		if (StringUtils.isNotEmpty(distance) && StringUtils.isNotEmpty(vehicle)) {
			double dist = Double.parseDouble(distance);
			int coEmm = referMap(vehicle);

			if (StringUtils.isNotEmpty(unit) && StringUtils.equalsIgnoreCase("m", unit)) {
				dist = dist / 1000;
			}
			if (StringUtils.isNotEmpty(unitWt)&&StringUtils.equalsIgnoreCase("kg", unitWt)) {
				emmS = (coEmm * dist)/1000;
				emmS = Math.round(emmS*100.0)/100.0;

			} else{
				unitWt = "g";
				emmS = (coEmm * dist);
				emmS = Math.round(emmS*100.0)/100.0;
			}

		}
		return emmS + unitWt + " of CO2-equivalent.";
	}
	/**
	 * The Data method sereves as the source of logic to drive the data outputs
	 * @param vehicle
	 * @return
	 */
	public int referMap(String vehicle) {
		Map<String, Integer> Data = new HashMap<String, Integer>();

		Data.put("small-diesel-car", 142);
		Data.put("small-petrol-car", 154);
		Data.put("small-plugin-hybrid-car", 73);
		Data.put("small-electric-car", 50);
		Data.put("medium-diesel-car", 171);
		Data.put("medium-petrol-car", 192);
		Data.put("medium-plugin-hybrid-car", 110);
		Data.put("medium-electric-car", 58);
		Data.put("large-diesel-car", 209);
		Data.put("large-petrol-car", 282);
		Data.put("large-plugin-hybrid-car", 126);
		Data.put("large-electric-car", 73);
		Data.put("bus", 27);
		Data.put("train", 6);
		vehicle = vehicle.toLowerCase().trim();
		
			if(Data.get(vehicle)!=null)
			{
				return Data.get(vehicle);
			}
			else
			{return 0;}
		

	}

}
