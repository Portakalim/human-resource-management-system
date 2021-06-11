package com.portakalim.hrms.business.abstracts;

import java.util.List;

import com.portakalim.hrms.core.utilities.results.DataResult;
import com.portakalim.hrms.core.utilities.results.Result;
import com.portakalim.hrms.entities.concretes.JobAdvertisement;

public interface JobAdvertisementService {

	Result add(JobAdvertisement jobAdvertisement);
	DataResult<List<JobAdvertisement>> getAll();
	DataResult<JobAdvertisement> getById(int id);
	DataResult<List<JobAdvertisement>> getByEmployerId(int id);
	DataResult<List<JobAdvertisement>> getActivated();
	DataResult<List<JobAdvertisement>> getByDateRange(String startDate, String finalDate,
			boolean activated);

}
