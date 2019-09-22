package practice;


public class Mobile
{
	String brand;
	double price;
	int ram;
	
	
	public Mobile(String brand, double price, int ram) {
		super();
		this.brand = brand;
		this.price = price;
		this.ram = ram;
	}
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	

	@Override
	public String toString() {
		return "Laptop [brand=" + brand + ", price=" + price + ", ram=" + ram + "]";
	}

	

}

