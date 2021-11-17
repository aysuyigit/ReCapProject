import business.abstracts.BrandService;
import business.abstracts.CarService;
import business.concretes.BrandManager;
import business.concretes.CarManager;
import dataAccess.concretes.BrandDao;
import dataAccess.concretes.CarDao;
import entities.Brand;
import entities.Car;
import entities.Color;

public class Main {

	public static void main(String[] args) {
		
		Car car = new Car(1, 1, 2000, 50, "Araba");
	    Brand brand = new Brand(1, "Ford");
	    Color color = new Color(1, "Gri");
		
		BrandService brandService = new BrandManager(new BrandDao());
		brandService.insert(brand);
		
		CarService carService = new CarManager(new CarDao());
		carService.insert(car);
		carService.getAll();
		
		System.out.println(car.getDescription() + " " +  brand.getBrandName());


	}}