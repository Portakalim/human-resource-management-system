package com.portakalim.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.portakalim.hrms.business.abstracts.JobPositionService;
import com.portakalim.hrms.business.constants.Messages;
import com.portakalim.hrms.core.utilities.results.DataResult;
import com.portakalim.hrms.core.utilities.results.Result;
import com.portakalim.hrms.core.utilities.results.SuccessDataResult;
import com.portakalim.hrms.core.utilities.results.SuccessResult;
import com.portakalim.hrms.dataAccess.abstracts.JobPositionDao;
import com.portakalim.hrms.entities.concretes.JobPosition;
@Service
public class JobPositionManager implements JobPositionService {

	private JobPositionDao jobPositionDao;
	
	@Autowired
	public JobPositionManager(JobPositionDao jobPositionDao) {
		this.jobPositionDao=jobPositionDao;
	}
	
	@Override
	public Result add(JobPosition jobPosition) {
		this.jobPositionDao.save(jobPosition);
		return new SuccessResult(Messages.added("İş Pozisyonları"));
	}

	@Override
	public DataResult<List<JobPosition>> getAll() {
		var result = this.jobPositionDao.findAll();
		return new SuccessDataResult<List<JobPosition>>(result, Messages.listed("İş Posizyonları"));
	}

	@Override
	public DataResult<JobPosition> getById(int id) {
		var result = this.jobPositionDao.findById(id).get();
		return new SuccessDataResult<JobPosition>(result,Messages.listed);
	}

}
