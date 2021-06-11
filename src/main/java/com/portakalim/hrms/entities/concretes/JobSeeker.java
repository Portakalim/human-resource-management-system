package com.portakalim.hrms.entities.concretes;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.*;
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
@Table(name = "job_seekers")
@PrimaryKeyJoinColumn(name="user_id",referencedColumnName = "id")
@EqualsAndHashCode(callSuper = true)
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler", "jobSeeker"})
public class JobSeeker extends User {

	@NotEmpty(message = "İsim boş bırakılmamalıdır.")
	@Column(name = "first_name")
	private String firstName;

	@NotEmpty(message = "Soy isim boş bırakılmamalıdır.")
	@Column(name = "last_name")
	private String lastName;

	@NotEmpty(message = "Tc Kimlik boş bırakılmamalıdır.")
	@Column(name = "nationality_id")
	private String nationalityId;

	@NotEmpty(message = "Doğum tarihi boş bırakılmamalıdır.")
	@Column(name = "date_of_birth")
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
	private LocalDate dateOfBirth;

	@NotNull(message = "Active olup olmaması belirtilmelidir.")
	@Column(name = "activated")
	private boolean activated;

	@Column(name = "activation_date")
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
	private LocalDate activationDate;
	
	@JsonIgnore
	@OneToMany(mappedBy = "jobSeeker")
	private List<JobSeekerSchool> jobSeekerSchools;

}
