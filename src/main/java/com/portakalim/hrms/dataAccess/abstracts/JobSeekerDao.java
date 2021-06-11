package com.portakalim.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.portakalim.hrms.entities.concretes.JobSeeker;

public interface JobSeekerDao extends JpaRepository<JobSeeker,Integer> {
}
