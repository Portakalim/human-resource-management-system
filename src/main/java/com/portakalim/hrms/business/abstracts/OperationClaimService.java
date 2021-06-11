package com.portakalim.hrms.business.abstracts;

import java.util.List;

import com.portakalim.hrms.core.utilities.results.Result;
import com.portakalim.hrms.entities.concretes.OperationClaim;



public interface OperationClaimService {
	Result add(OperationClaim operationClaim);
	List<OperationClaim> getAll();
}
