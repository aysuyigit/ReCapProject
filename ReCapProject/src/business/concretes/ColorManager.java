package business.concretes;

import java.util.List;

import business.abstracts.ColorService;
import core.utilites.results.DataResult;
import core.utilites.results.Result;
import core.utilites.results.SuccessDataResult;
import core.utilites.results.SuccessResult;
import dataAccess.abstracts.BrandRepository;
import dataAccess.abstracts.ColorRepository;
import entities.Color;

public class ColorManager implements ColorService {

	private ColorRepository colorRepository;

	public ColorManager(ColorRepository colorRepository) {
		super();
		this.colorRepository = colorRepository;
	}

	@Override
	public Result insert(Color data) {
		colorRepository.insert(data);
		return new SuccessResult("Renk başarıyla eklendi.");
	}

	@Override
	public Result delete(Color data) {
		colorRepository.delete(data);
		return new SuccessResult("Renk başarıyla silindi");
	}

	@Override
	public Result update(Color data) {
		colorRepository.update(data);
		return new SuccessResult("Renk başarıyla güncellendi.");
	}

	@Override
	public DataResult<List<Color>> getAll() {
		return new SuccessDataResult(colorRepository.getAll(), "Renkler Listelendi");
	}

	@Override
	public DataResult<Color> getById(int Id) {
		return new SuccessDataResult(colorRepository.getById(Id), "Renk Id eklendi");
	}

}
