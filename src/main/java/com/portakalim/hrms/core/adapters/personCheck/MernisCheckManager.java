package com.portakalim.hrms.core.adapters.personCheck;

import com.portakalim.hrms.entities.concretes.JobSeeker;

public class MernisCheckManager implements PersonCheckService {
	
	@Override
	public boolean fakeCheckIfRealPerson(JobSeeker jobSeeker) {
		return true;
	}

	@Override
	public boolean checkIfRealPerson(JobSeeker jobSeeker) {
		return true;
	}
}
