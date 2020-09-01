package co.grandcircus.lab25;

public class Forecast {
	
	private Location location;
	private Data data;
	private String productionCenter;
	public Forecast() {
		super();
	}
	public Location getLocation() {
		return location;
	}
	public void setLocation(Location location) {
		this.location = location;
	}
	public Data getData() {
		return data;
	}
	public void setData(Data data) {
		this.data = data;
	}
	
	public String getProductionCenter() {
		return productionCenter;
	}
	public void setProductionCenter(String productionCenter) {
		this.productionCenter = productionCenter;
	}
	@Override
	public String toString() {
		return "Forecast [location=" + location + ", data=" + data + ", productionCenter=" + productionCenter + "]";
	}
	
	

}
