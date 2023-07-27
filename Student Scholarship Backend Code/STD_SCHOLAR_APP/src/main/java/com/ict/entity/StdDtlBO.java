package com.ict.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class StdDtlBO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String firstName;
    private String lastName;
    private String email;
    private Long mobile;
    private Double jeeMark;
    private Double boardMark;
    private String cast;
    private String language;
    private String gender;
    private String disability;
    private LocalDate dob;
    private Double amount;
    private Integer scTimes;
    private String division;
    private Float percentage;

    public StdDtlBO() {
    }

    public StdDtlBO(Integer id, String firstName, String lastName, String email, Long mobile, Double jeeMark,
            Double boardMark, String cast, String language, String gender, String disability, LocalDate dob,
            Double amount, Integer scTimes, String division, Float percentage) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.mobile = mobile;
        this.jeeMark = jeeMark;
        this.boardMark = boardMark;
        this.cast = cast;
        this.language = language;
        this.gender = gender;
        this.disability = disability;
        this.dob = dob;
        this.amount = amount;
        this.scTimes = scTimes;
        this.division = division;
        this.percentage = percentage;
    }

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getMobile() {
		return mobile;
	}

	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}

	public Double getJeeMark() {
		return jeeMark;
	}

	public void setJeeMark(Double jeeMark) {
		this.jeeMark = jeeMark;
	}

	public Double getBoardMark() {
		return boardMark;
	}

	public void setBoardMark(Double boardMark) {
		this.boardMark = boardMark;
	}

	public String getCast() {
		return cast;
	}

	public void setCast(String cast) {
		this.cast = cast;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDisability() {
		return disability;
	}

	public void setDisability(String disability) {
		this.disability = disability;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public Integer getScTimes() {
		return scTimes;
	}

	public void setScTimes(Integer scTimes) {
		this.scTimes = scTimes;
	}

	public String getDivision() {
		return division;
	}

	public void setDivision(String division) {
		this.division = division;
	}

	public Float getPercentage() {
		return percentage;
	}

	public void setPercentage(Float percentage) {
		this.percentage = percentage;
	}

}
