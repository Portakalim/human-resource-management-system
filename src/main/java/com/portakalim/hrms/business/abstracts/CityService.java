package com.portakalim.hrms.business.abstracts;

import java.util.List;

import com.portakalim.hrms.core.utilities.results.DataResult;
import com.portakalim.hrms.entities.concretes.City;

public interface CityService {
	DataResult<List<City>> getAll();
	DataResult<City> getById(int id);

}
