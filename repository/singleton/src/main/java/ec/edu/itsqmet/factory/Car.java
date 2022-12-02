package ec.edu.itsqmet.factory;

public abstract class Car {
	private int year;
	
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String maxSpeed() {
		return "0 km/h";
	}
	
	
}
