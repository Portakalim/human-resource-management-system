package com.portakalim.hrms.business.abstracts;

import java.util.List;

import com.portakalim.hrms.core.utilities.results.DataResult;
import com.portakalim.hrms.core.utilities.results.Result;
import com.portakalim.hrms.entities.concretes.JobPosition;

public interface JobPositionService {
	Result add(JobPosition jobPosition);
	DataResult<List<JobPosition>> getAll();
	DataResult<JobPosition> getById(int id);
}
