package com.portakalim.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.portakalim.hrms.entities.concretes.CurriculumVitae;

public interface CurriculumVitaeDao extends JpaRepository<CurriculumVitae, Integer> {

}
