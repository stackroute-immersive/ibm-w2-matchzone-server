package com.matchzone.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Location {

	@Id
	private String profileId;
	private String city;
	private String state;
	private String country;

	
	public String getProfileId() {
		return profileId;
	}

	public void setProfileId(String profileId) {
		this.profileId = profileId;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Location(String profileId, String city, String state, String country) {
		super();
		this.profileId = profileId;
		this.city = city;
		this.state = state;
		this.country = country;
	}

	public Location() {
		super();
	}

}
