package br.com.landrade.routes.webservices;

public class RouteDetailsDTO {
	
	private String time;

	private double distance;

	private double fuelCost;

	private double totalCost;

	/**
	 * @return the time
	 */
	public String getTime() {
		return time;
	}

	/**
	 * @param time the time to set
	 */
	public void setTime(String time) {
		this.time = time;
	}

	/**
	 * @return the distance
	 */
	public double getDistance() {
		return distance;
	}

	/**
	 * @param distance the distance to set
	 */
	public void setDistance(double distance) {
		this.distance = distance;
	}

	/**
	 * @return the fuelCost
	 */
	public double getFuelCost() {
		return fuelCost;
	}

	/**
	 * @param fuelCost the fuelCost to set
	 */
	public void setFuelCost(double fuelCost) {
		this.fuelCost = fuelCost;
	}

	/**
	 * @return the totalCost
	 */
	public double getTotalCost() {
		return totalCost;
	}

	/**
	 * @param totalCost the totalCost to set
	 */
	public void setTotalCost(double totalCost) {
		this.totalCost = totalCost;
	}
	
	

}
