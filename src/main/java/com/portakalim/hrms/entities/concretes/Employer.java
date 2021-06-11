package com.portakalim.hrms.entities.concretes;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@PrimaryKeyJoinColumn(name="user_id",referencedColumnName = "id")
@Table(name = "employers")
@EqualsAndHashCode(callSuper = true)
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler", "employer" })
public class Employer extends User {

	@NotEmpty(message = "Şirket ismi boş bırakılmamalıdır.")
	@Column(name = "company_name")
	private String companyName;

	@NotEmpty(message = "Şirket sitesi boş bırakılmamalıdır.")
	@Column(name = "company_website")
	private String companyWebsite;

	@NotEmpty(message = "Telefon numarası boş bırakılmamalıdır.")
	@Column(name = "phone_number")
	private String phoneNumber;

	@NotNull(message = "Active olup olmaması belirtilmelidir.")
	@Column(name = "activated")
	private boolean activated;

	@Column(name = "activation_system_personnel_id")
	private int activationSystemPersonnelId;

	@Column(name = "activation_date")
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
	private LocalDate activationDate;
	
	@JsonIgnore
	@OneToMany(mappedBy = "employer")
	private List<JobAdvertisement> jobAdvertisements;
		
}
	

