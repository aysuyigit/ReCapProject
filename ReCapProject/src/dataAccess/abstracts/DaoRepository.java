package dataAccess.abstracts;

import java.util.List;

import core.utilites.results.DataResult;
import core.utilites.results.Result;

public interface DaoRepository<T> {

	Result insert(T data);

	Result delete(T data);

	Result update(T data);

	DataResult<List<T>> getAll();

	DataResult<T> getById(int Id);

}
