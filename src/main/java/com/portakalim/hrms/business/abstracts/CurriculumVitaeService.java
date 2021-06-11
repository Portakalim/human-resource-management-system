package com.portakalim.hrms.business.abstracts;

import java.util.List;

import com.portakalim.hrms.core.utilities.results.DataResult;
import com.portakalim.hrms.core.utilities.results.Result;

import com.portakalim.hrms.entities.concretes.CurriculumVitae;

public interface CurriculumVitaeService {
	Result add(CurriculumVitae curriculumVitae);
	Result update(CurriculumVitae curriculumVitae);
	DataResult<List<CurriculumVitae>> getAll();
	DataResult<List<CurriculumVitae>> getById(int id);
	DataResult<List<CurriculumVitae>> getByJobSeekerId(int jobSeekerId);
}
