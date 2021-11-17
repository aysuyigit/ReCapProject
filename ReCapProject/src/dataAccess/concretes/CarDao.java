package dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import core.utilites.results.DataResult;
import core.utilites.results.Result;
import core.utilites.results.SuccessDataResult;
import core.utilites.results.SuccessResult;
import dataAccess.abstracts.CarRepository;
import entities.Brand;
import entities.Car;

public class CarDao implements CarRepository {

	List<Car> cars;

	public CarDao() {
		cars = new ArrayList<Car>();
		// TODO Auto-generated constructor stub
	}

	@Override
	public core.utilites.results.Result insert(Car data) {
		cars.add(data);
		return new SuccessResult("Araba Başarıyla eklendi.");
	}

	@Override
	public core.utilites.results.Result delete(Car data) {
		cars.remove(data);
		return new SuccessResult("Araba başarıyla çıkartıldı.");
	}

	@Override
	public core.utilites.results.Result update(Car data) {
		cars.set(data.getBrandId(), data);
		return new SuccessResult("Araba listesi başarıyla güncellendi.");
	}

	@Override
	public DataResult<List<Car>> getAll() {
		return new SuccessDataResult(cars);
	}

	@Override
	public DataResult<Car> getById(int Id) {
		return new SuccessDataResult(cars.get(Id), "Araba id ile alındı.");
	}
}