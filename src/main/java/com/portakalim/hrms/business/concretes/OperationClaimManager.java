package com.portakalim.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.portakalim.hrms.business.abstracts.OperationClaimService;
import com.portakalim.hrms.business.constants.Messages;
import com.portakalim.hrms.core.utilities.results.Result;
import com.portakalim.hrms.core.utilities.results.SuccessResult;
import com.portakalim.hrms.dataAccess.abstracts.OperationClaimDao;
import com.portakalim.hrms.entities.concretes.OperationClaim;

@Service
public class OperationClaimManager implements OperationClaimService{

	private OperationClaimDao operationClaimDao;
	
	@Autowired
	public OperationClaimManager(OperationClaimDao operationClaimDao) {
		super();
		this.operationClaimDao = operationClaimDao;
	}

	@Override
	public List<OperationClaim> getAll() {
		return this.operationClaimDao.findAll();
	}

	@Override
	public Result add(OperationClaim operationClaim) {
		this.operationClaimDao.save(operationClaim);
		return new SuccessResult(Messages.added("Kullanıcılar"));
	}

}
