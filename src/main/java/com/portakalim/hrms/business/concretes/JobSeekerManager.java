package com.portakalim.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.portakalim.hrms.business.abstracts.JobSeekerService;
import com.portakalim.hrms.business.constants.Messages;
import com.portakalim.hrms.core.adapters.personCheck.MernisCheckManager;
import com.portakalim.hrms.core.adapters.personCheck.PersonCheckService;
import com.portakalim.hrms.core.utilities.results.DataResult;
import com.portakalim.hrms.core.utilities.results.ErrorResult;
import com.portakalim.hrms.core.utilities.results.Result;
import com.portakalim.hrms.core.utilities.results.SuccessDataResult;
import com.portakalim.hrms.core.utilities.results.SuccessResult;
import com.portakalim.hrms.dataAccess.abstracts.JobSeekerDao;
import com.portakalim.hrms.entities.concretes.JobSeeker;

@Service
public class JobSeekerManager implements JobSeekerService {

	private JobSeekerDao jobSeekerDao;

	@Autowired
	public JobSeekerManager(JobSeekerDao jobSeekerDao) {
		super();
		this.jobSeekerDao = jobSeekerDao;
	}

	@Override
	public Result add(JobSeeker jobSeeker) {
		System.out.println(jobSeeker.toString());
		PersonCheckService personCheckService = new MernisCheckManager();

		
			if (personCheckService.fakeCheckIfRealPerson(jobSeeker)) {
				this.jobSeekerDao.save(jobSeeker);
				return new SuccessResult(Messages.added("İş Arayanlar"));
			}
			
			return new ErrorResult(Messages.validError);

	}

	@Override
	public DataResult<List<JobSeeker>> getAll() {
		var result = this.jobSeekerDao.findAll();
		return new SuccessDataResult<List<JobSeeker>>(result, Messages.listed("İş Arayanlar"));
	}


}
