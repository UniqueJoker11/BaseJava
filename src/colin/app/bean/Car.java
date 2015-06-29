package colin.app.bean;

public class Car {

	private String name;
	private String brand;
	private String yearSize;
	private String num;
	private Car(String name, String brand, String yearSize, String num) {
		super();
		this.name = name;
		this.brand = brand;
		this.yearSize = yearSize;
		this.num = num;
	}
	public Car() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getYearSize() {
		return yearSize;
	}
	public void setYearSize(String yearSize) {
		this.yearSize = yearSize;
	}
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	
}
