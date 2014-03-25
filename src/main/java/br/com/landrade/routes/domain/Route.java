package br.com.landrade.routes.domain;

import java.util.Arrays;
import java.util.List;

public class Route {
	
	public enum RouteType {
		DEFAULT_FAST(0), EVITANDO_TRANSITO(23);
		
		private final int code;
		
		private RouteType(int code) {
			this.code = code;
		}
		
		public int getCode() {
			return this.code;
		}
		
		public static RouteType toEnum(int code) {
			if (code == 0)
				return RouteType.DEFAULT_FAST;
			if (code == 23)
				return RouteType.EVITANDO_TRANSITO;
			
			return null;
		}
	}
	
	private final List<Point> stops;
	
	private RouteType type;
	
	/**
	 * Construtor padrão de rota
	 * @param stops Paradas na rota
	 */
	public Route(Point... stops) {
		this.stops = Arrays.asList(stops);
	}

	/**
	 * @return Paradas
	 */
	public List<Point> getStops() {
		return stops;
	}
	
	/* Equals and Hashcode*/

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((stops == null) ? 0 : stops.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Route other = (Route) obj;
		if (stops == null) {
			if (other.stops != null)
				return false;
		} else if (!stops.equals(other.stops))
			return false;
		return true;
	}

	public RouteType getType() {
		return type;
	}

	public void setType(RouteType type) {
		this.type = type;
	}
	

}
