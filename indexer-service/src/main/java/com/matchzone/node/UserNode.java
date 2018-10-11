package com.matchzone.node;

import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;

//Model Class annotated with @NodeEntity will be represented as nodes in the graph.

@NodeEntity
public class UserNode {

	@Id
	private String profileId;

	public String getProfileId() {
		return profileId;
	}

	public void setProfileId(String profileId) {
		this.profileId = profileId;
	}

	public UserNode(String profileId) {
		super();
		this.profileId = profileId;

	}

}
