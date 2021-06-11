package com.portakalim.hrms.entities.concretes;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="system_personnels")
@PrimaryKeyJoinColumn(name="user_id",referencedColumnName = "id")
@EqualsAndHashCode(callSuper = true)
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler", "user"})
public class SystemPersonnel extends User{

	@ManyToOne()
    @JoinColumn(name = "operation_claim_id", referencedColumnName = "id")
    private OperationClaim operationClaim;
}
