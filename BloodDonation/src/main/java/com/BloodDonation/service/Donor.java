package com.BloodDonation.service;

import jakarta.persistence.*;

@Entity
public class Donor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String phone;
    private String bloodGroup;
    private String socialMedia;
    private String lastDonation;

    public Donor() {
    	super();
    }

    public Donor(Long id, String name, String phone, String bloodGroup, String socialMedia, String lastDonation) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.bloodGroup = bloodGroup;
        this.socialMedia = socialMedia;
        this.lastDonation = lastDonation;
    }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public String getSocialMedia() {
		return socialMedia;
	}

	public void setSocialMedia(String socialMedia) {
		this.socialMedia = socialMedia;
	}

	public String getLastDonation() {
		return lastDonation;
	}

	public void setLastDonation(String lastDonation) {
		this.lastDonation = lastDonation;
	}

}
