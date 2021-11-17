package dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import core.utilites.results.DataResult;
import core.utilites.results.Result;
import core.utilites.results.SuccessDataResult;
import core.utilites.results.SuccessResult;
import dataAccess.abstracts.ColorRepository;
import entities.Brand;
import entities.Color;

public class ColorDao implements ColorRepository {

	List<Color> colors;

	public ColorDao() {
		colors = new ArrayList<Color>();
	}

	@Override
	public core.utilites.results.Result insert(Color data) {
		colors.add(data);
		return new SuccessResult("Renk Başarıyla eklendi.");
	}

	@Override
	public core.utilites.results.Result delete(Color data) {
		colors.remove(data);
		return new SuccessResult("Renk başarıyla çıkartıldı.");
	}

	@Override
	public core.utilites.results.Result update(Color data) {
		colors.set(data.getColorId(), data);
		return new SuccessResult("Renk listesi başarıyla güncellendi.");
	}

	@Override
	public DataResult<List<Color>> getAll() {
		return new SuccessDataResult(colors);
	}

	@Override
	public DataResult<Color> getById(int Id) {
		return new SuccessDataResult(colors.get(Id), "Renk id ile alındı.");
	}

}