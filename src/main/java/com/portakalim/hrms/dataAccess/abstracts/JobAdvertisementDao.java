package com.portakalim.hrms.dataAccess.abstracts;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.portakalim.hrms.entities.concretes.JobAdvertisement;

public interface JobAdvertisementDao extends JpaRepository<JobAdvertisement, Integer> {
	List<JobAdvertisement> getByEmployer_Id(int id);
	List<JobAdvertisement> getByActivatedTrue();
	List<JobAdvertisement> getByCreationDateBetweenAndActivated(LocalDate startDate, LocalDate finalDate,
			boolean activated);

}
