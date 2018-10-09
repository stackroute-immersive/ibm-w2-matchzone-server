package com.matchzone.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Skills {

	@Id
	private String profileId;
	private String iTSkills;
	private String version;
	private String level;
	private String lastUsed;

	public Skills() {
		super();
	}

	public Skills(String profileId, String iTSkills, String version, String level, String lastUsed) {
		super();
		this.profileId = profileId;
		this.iTSkills = iTSkills;
		this.version = version;
		this.level = level;
		this.lastUsed = lastUsed;
	}

	public String getProfileId() {
		return profileId;
	}

	public void setProfileId(String profileId) {
		this.profileId = profileId;
	}

	public String getiTSkills() {
		return iTSkills;
	}

	public void setiTSkills(String iTSkills) {
		this.iTSkills = iTSkills;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public String getLastUsed() {
		return lastUsed;
	}

	public void setLastUsed(String lastUsed) {
		this.lastUsed = lastUsed;
	}

}
