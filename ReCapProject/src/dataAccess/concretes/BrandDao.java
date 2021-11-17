package dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import core.utilites.results.DataResult;
import core.utilites.results.SuccessDataResult;
import core.utilites.results.SuccessResult;
import dataAccess.abstracts.BrandRepository;
import entities.Brand;

public class BrandDao implements BrandRepository {

	List<Brand> brands;

	public BrandDao() {
		brands = new ArrayList<Brand>();

	}

	@Override
	public core.utilites.results.Result insert(Brand data) {
		brands.add(data);
		return new SuccessResult("Marka Başarıyla eklendi.");
	}

	@Override
	public core.utilites.results.Result delete(Brand data) {
		brands.remove(data);
		return new SuccessResult("Marka başarıyla çıkartıldı.");
	}

	@Override
	public core.utilites.results.Result update(Brand data) {
		brands.set(data.getBrandId(), data);
		return new SuccessResult("Marka listesi başarıyla güncellendi.");
	}

	@Override
	public DataResult<List<Brand>> getAll() {		
		return new SuccessDataResult(brands);
	}

	@Override
	public DataResult<Brand> getById(int Id) {
		return new SuccessDataResult(brands.get(Id), "Marka id ile alındı.");
	}

}
