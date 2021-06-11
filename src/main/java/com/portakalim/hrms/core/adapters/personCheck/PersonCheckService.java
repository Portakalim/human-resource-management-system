package com.portakalim.hrms.core.adapters.personCheck;

import com.portakalim.hrms.entities.concretes.JobSeeker;

public interface PersonCheckService {
	boolean checkIfRealPerson(JobSeeker jobSeeker);
	boolean fakeCheckIfRealPerson(JobSeeker jobSeeker);
}

