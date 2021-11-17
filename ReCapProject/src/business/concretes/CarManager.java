package business.concretes;

import java.util.List;

import business.abstracts.CarService;
import core.utilites.results.DataResult;
import core.utilites.results.Result;
import core.utilites.results.SuccessDataResult;
import core.utilites.results.SuccessResult;
import dataAccess.abstracts.CarRepository;
import entities.Car;

public class CarManager implements CarService {

	private CarRepository carRepository;

	public CarManager(CarRepository carRepository) {

		this.carRepository = carRepository;
	}

	@Override
	public Result insert(Car data) {
		carRepository.insert(data);
		return new SuccessResult("Araba başarıyla eklendi.");
	}

	@Override
	public Result delete(Car data) {
		carRepository.delete(data);
		return new SuccessResult("Araba başarıyla silindi");
	}

	@Override
	public Result update(Car data) {
		carRepository.update(data);
		return new SuccessResult("Araba başarıyla güncellendi.");
	}

	@Override
	public DataResult<List<Car>> getAll() {

		return new SuccessDataResult(carRepository.getAll(), "Arabalar listelendi.");
	}

	@Override
	public DataResult<Car> getById(int Id) {

		return new SuccessDataResult(carRepository.getById(Id), "Arabalar id ile listelendi.");
	}

}
