package com.portakalim.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.portakalim.hrms.business.abstracts.OperationClaimService;
import com.portakalim.hrms.core.utilities.results.Result;
import com.portakalim.hrms.entities.concretes.OperationClaim;

@RestController
@RequestMapping("/api/operationclaims")
public class OperationClaimsController {
	
	private OperationClaimService operationClaimService;
	
	@Autowired
	public OperationClaimsController(OperationClaimService operationClaimService) {
		super();
		this.operationClaimService = operationClaimService;
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody OperationClaim operationClaim) {
		return this.operationClaimService.add(operationClaim);
	}
	
	@GetMapping("/getall")
	public List<OperationClaim> getAll() {
		return this.operationClaimService.getAll();
	}
	
}
