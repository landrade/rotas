package br.com.landrade.routes.domain;

public class RouteDetails {

	private final String time;

	private final Double distance;

	// O ideal que fosse um BigDecimal ou uma classe "Money"
	private final Double fuelCost;

	// O ideal que fosse um BigDecimal ou uma classe "Money"
	private final Double totalCost;

	/**
	 * Construtor padrão para Totalizador de rota
	 * 
	 * @param routes
	 */
	public RouteDetails(String time, Double distance, Double fuelCost, Double totalCost) {
		this.time = time;
		this.distance = distance;
		this.fuelCost = fuelCost;
		this.totalCost = totalCost;
	}

	/**
	 * @return Tempo total
	 */
	public String getTime() {
		return time;
	}

	/**
	 * @return Distancia total
	 */
	public Double getDistance() {
		return distance;
	}

	/**
	 * @return Custo com gasolina
	 */
	public Double getFuelCost() {
		return fuelCost;
	}

	/**
	 * @return Custo total incluindo pedagios
	 */
	public Double getTotalCost() {
		return totalCost;
	}

}
