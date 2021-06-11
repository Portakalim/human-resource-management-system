package com.portakalim.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.portakalim.hrms.business.abstracts.EmployerService;
import com.portakalim.hrms.business.constants.Messages;
import com.portakalim.hrms.core.utilities.CustomValidators;
import com.portakalim.hrms.core.utilities.results.DataResult;
import com.portakalim.hrms.core.utilities.results.ErrorResult;
import com.portakalim.hrms.core.utilities.results.Result;
import com.portakalim.hrms.core.utilities.results.SuccessDataResult;
import com.portakalim.hrms.core.utilities.results.SuccessResult;
import com.portakalim.hrms.dataAccess.abstracts.EmployerDao;
import com.portakalim.hrms.entities.concretes.Employer;

@Service
public class EmployerManager implements EmployerService {

	private EmployerDao employerDao;

	@Autowired
	public EmployerManager(EmployerDao employerDao) {
		this.employerDao = employerDao;
	}

	@Override
	public Result add(Employer employer) {
		System.out.println(employer.toString());

		if (CustomValidators.doHaveEmail(employer.getEmail())) {

			this.employerDao.save(employer);
			return new SuccessResult(Messages.added("İş veren"));
		}

		return new ErrorResult(Messages.emailDomainError);
	}

	@Override
	public DataResult<List<Employer>> getAll() {
		var result = this.employerDao.findAll();
		return new SuccessDataResult<List<Employer>>(result, Messages.listed("İş verenler"));
	}



}
