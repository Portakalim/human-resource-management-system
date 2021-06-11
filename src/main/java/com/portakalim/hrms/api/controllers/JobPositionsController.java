package com.portakalim.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.portakalim.hrms.business.abstracts.JobPositionService;
import com.portakalim.hrms.core.utilities.results.DataResult;
import com.portakalim.hrms.core.utilities.results.Result;
import com.portakalim.hrms.entities.concretes.JobPosition;

@RestController
@RequestMapping("/api/jobpositions")
public class JobPositionsController {
	private JobPositionService jobPositionService;
	
	@Autowired
	public JobPositionsController(JobPositionService jobPositionService) {
		this.jobPositionService = jobPositionService;
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody JobPosition jobPosition) {
		return this.jobPositionService.add(jobPosition);
	}
	
	@GetMapping("/getAll")
	public DataResult<List<JobPosition>> getAll(){
		return this.jobPositionService.getAll();
	}

}
