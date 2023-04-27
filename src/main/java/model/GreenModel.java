package model;
public class GreenModel {
	 private String distance;
	 private String vehicle;
	 private String unit;
	 private String weightUnit;
	
	public GreenModel() {
	}
	/**
	 * @param distance
	 * @param vehicle
	 * @param unit
	 * @param weightUnit
	 */
	public GreenModel(String distance, String vehicle, String unit, String weightUnit) {
		this.distance = distance;
		this.vehicle = vehicle;
		this.unit = unit;
		this.weightUnit = weightUnit;
	}
	@Override
	public String toString() {
		return "GreenModel [distance=" + distance + ", vehicle=" + vehicle + ", unit=" + unit + ", weightUnit="
				+ weightUnit + "]";
	}
	public String getDistance() {
		return distance;
	}

	public void setDistance(String distance) {
		this.distance = distance;
	}

	public String getVehicle() {
		return vehicle;
	}

	public void setVehicle(String vehicle) {
		this.vehicle = vehicle;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}
	public String getWeightUnit() {
		return weightUnit;
	}
	public void setWeightUnit(String weightUnit) {
		this.weightUnit = weightUnit;
	}
	
	

}
