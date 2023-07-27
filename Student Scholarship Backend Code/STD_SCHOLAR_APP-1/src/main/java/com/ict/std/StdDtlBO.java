package com.ict.std;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;


@Entity
@Table(name="angular_soumya")
public class StdDtlBO {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String firstName;
    private String lastName;
    private String email;
    private Long mobile;
    private Double jeeMark;
    private Double boardMark;
    private String cast;
    @Transient
    private List<String> language;
    private String gender;
    private String diability;
    private String dob;
    private Double amount;
    private String scTimes;
    private String division;
    private Float percentage;
    private String lang;
    public StdDtlBO() {
    }

	public String getLang() {
		return lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
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
	
	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getdiability() {
		return diability;
	}

	public void setdiability(String diability) {
		this.diability = diability;
	}

	public List getLanguage() {
		return language;
	}

	public void setLanguage(List language) {
		this.language = language;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public String getScTimes() {
		return scTimes;
	}

	public void setScTimes(String scTimes) {
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
