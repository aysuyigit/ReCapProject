package entities;

public class Car {

	private int id;
	private int brandId;
	private int modelYear;
	private int dailyPrice;
	private String description;

	public Car(int id, int brandId, int modelYear, int dailyPrice, String description) {
		super();
		this.id = id;
		this.brandId = brandId;
		this.modelYear = modelYear;
		this.dailyPrice = dailyPrice;
		this.description = description;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getBrandId() {
		return brandId;
	}

	public void setBrandId(int brandId) {
		this.brandId = brandId;
	}

	public int getModelYear() {
		return modelYear;
	}

	public void setModelYear(int modelYear) {
		this.modelYear = modelYear;
	}

	public int getDailyPrice() {
		return dailyPrice;
	}

	public void setDailyPrice(int dailyPrice) {
		this.dailyPrice = dailyPrice;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
