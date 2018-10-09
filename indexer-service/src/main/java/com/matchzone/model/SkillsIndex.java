package com.matchzone.model;


public class SkillsIndex {
	private String iTSkills;
	private String version;
	private String level;
	private String lastUsed;
    private String profileId;
  //  private String message;

//	public String getMessage() {
//		return message;
//	}
//
//	public void setMessage(String message) {
//		this.message = message;
//	}

	public String getiTSkills() {
		return iTSkills;
	}


	public SkillsIndex(String iTSkills, String version, String level, String lastUsed, String profileId) {
		super();
		this.iTSkills = iTSkills;
		this.version = version;
		this.level = level;
		this.lastUsed = lastUsed;
		this.profileId = profileId;
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

	public String getProfileId() {
		return profileId;
	}

	public void setProfileId(String profileId) {
		this.profileId = profileId;
	}

	public SkillsIndex() {
		super();
	}
	 @Override
	    public String toString() {
	        final StringBuffer sb = new StringBuffer("SkillsIndex{");
	        sb.append("iTSkills='").append(iTSkills).append('\'');
	        sb.append(", version='").append(version).append('\'');
	        sb.append(", level='").append(level).append('\'');
	        sb.append(", lastUsed='").append(lastUsed).append('\'');
	        sb.append('}');
	        return sb.toString();
	    }
	
	
}

