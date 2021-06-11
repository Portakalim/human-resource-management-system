package com.portakalim.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.portakalim.hrms.entities.concretes.OperationClaim;

public interface OperationClaimDao extends JpaRepository<OperationClaim, Integer>{

}
