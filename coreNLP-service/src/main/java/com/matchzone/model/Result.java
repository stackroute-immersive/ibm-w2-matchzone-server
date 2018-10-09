package com.matchzone.model;

import java.util.List;

public class Result {

    private String profileId;
    private List<String> skills;
    private String location;
    private String extra;
    private String organization;
	
    
    public Result() {
		super();
	}
	public Result(String profileId, List<String> skills, String location, String extra, String organization) {
		super();
		this.profileId = profileId;
		this.skills = skills;
		this.location = location;
		this.extra = extra;
		this.organization = organization;
	}
	public String getProfileId() {
		return profileId;
	}
	public void setProfileId(String profileId) {
		this.profileId = profileId;
	}
	public List<String> getSkills() {
		return skills;
	}
	public void setSkills(List<String> skills) {
		this.skills = skills;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getExtra() {
		return extra;
	}
	public void setExtra(String extra) {
		this.extra = extra;
	}
	public String getOrganization() {
		return organization;
	}
	public void setOrganization(String organization) {
		this.organization = organization;
	}
	@Override
	public String toString() {
		return "Result [profileId=" + profileId + ", skills=" + skills + ", location=" + location + ", extra=" + extra
				+ ", organization=" + organization + "]";
	}
	
    
   

    
    
    



}
