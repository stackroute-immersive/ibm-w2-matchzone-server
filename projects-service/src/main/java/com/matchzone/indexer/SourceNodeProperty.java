package com.matchzone.indexer;

//Model class for SorceNodeProperty

public class SourceNodeProperty {
private String projectTitle;

public String getProjectTitle() {
	return projectTitle;
}

public void setProjectTitle(String projectTitle) {
	this.projectTitle = projectTitle;
}

public SourceNodeProperty(String projectTitle) {
	super();
	this.projectTitle = projectTitle;
}

public SourceNodeProperty() {
	super();
}

}
