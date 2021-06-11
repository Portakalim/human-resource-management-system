package com.portakalim.hrms.entities.concretes;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "job_advertisements")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler", "jobAdvertisement" })
public class JobAdvertisement {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@NotEmpty(message = "İş açıklaması boş bırakılamaz")
	@Column(name = "job_description")
	private String jobDescription;

	@Column(name = "salary_min")
	private double salaryMin;

	@Column(name = "salary_max")
	private double salaryMax;

	@NotNull(message = "Pozisyon sayısı belirtilmelidir.")
	@Column(name = "open_position_total")
	private int openPositionTotal;

	@NotNull(message = "Tarih belirilmeilidr.")
	@Column(name = "creation_date")
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
	private LocalDate creationDate;

	@NotNull(message = "Deadline tarihi belirtilmelidir.")
	@Column(name = "deadline")
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
	private LocalDate deadline;

	@NotNull(message = "Aktif durumu belirtilmelidir")
	@Column(name = "activated")
	private boolean activated;
	
	@ManyToOne()
	@JoinColumn(name="employer_id", referencedColumnName = "user_id")
	private Employer employer;

	@ManyToOne()
	@JoinColumn(name = "job_position_id", referencedColumnName = "id")
	private JobPosition jobPosition;

	@ManyToOne()
	@JoinColumn(name = "cities_id", referencedColumnName = "id")
	private City city;

}