package com.portakalim.hrms.business.abstracts;

import java.util.List;

import com.portakalim.hrms.core.utilities.results.DataResult;
import com.portakalim.hrms.core.utilities.results.Result;
import com.portakalim.hrms.entities.concretes.SystemPersonnel;

public interface SystemPersonnelService {
	Result add(SystemPersonnel systemPersonnel);
	DataResult<List<SystemPersonnel>> getAll();
}
