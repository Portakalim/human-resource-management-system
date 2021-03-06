package com.portakalim.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.portakalim.hrms.business.abstracts.CityService;
import com.portakalim.hrms.business.constants.Messages;
import com.portakalim.hrms.core.utilities.results.DataResult;
import com.portakalim.hrms.core.utilities.results.SuccessDataResult;
import com.portakalim.hrms.dataAccess.abstracts.CityDao;
import com.portakalim.hrms.entities.concretes.City;

public class CityManager implements CityService {
	
	private CityDao cityDao;
	
	@Autowired
	public CityManager(CityDao cityDao) {
		super();
		this.cityDao = cityDao;
	}

	@Override
	public DataResult<List<City>> getAll() {
		var result = this.cityDao.findAll();
		return new SuccessDataResult<List<City>>(result, Messages.listed("Şehirler"));
	}

	@Override
	public DataResult<City> getById(int id) {
		var result = this.cityDao.findById(id).get();
		return new SuccessDataResult<City>(result,Messages.listed);
	}

}