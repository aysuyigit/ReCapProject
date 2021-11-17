package business.concretes;

import java.util.List;

import business.abstracts.BrandService;
import core.utilites.results.DataResult;
import core.utilites.results.Result;
import core.utilites.results.SuccessDataResult;
import core.utilites.results.SuccessResult;
import dataAccess.abstracts.BrandRepository;
import entities.Brand;

public class BrandManager implements BrandService {

	private BrandRepository brandRepository;

	public BrandManager(BrandRepository brandRepository) {
		this.brandRepository = brandRepository;
	}

	@Override
	public Result insert(Brand data) {
		brandRepository.insert(data);
		return new SuccessResult("Başarıyla eklendi.");
	}

	@Override
	public Result delete(Brand data) {
		brandRepository.delete(data);
		return new SuccessResult("Başarıyla silindi.");
	}

	@Override
	public Result update(Brand data) {		
		brandRepository.update(data);
		return new SuccessResult("Güncellendi.");
	}

	@Override
	public DataResult<List<Brand>> getAll() {
		return new SuccessDataResult(brandRepository.getAll(), "Listelendi.");
	}

	@Override
	public DataResult<Brand> getById(int Id) {
		return new SuccessDataResult(brandRepository.getById(Id), "Id ile alındı.");
	}

}
