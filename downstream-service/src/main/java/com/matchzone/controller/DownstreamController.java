package com.matchzone.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.matchzone.model.AcademicDetails;
import com.matchzone.model.Certification;
import com.matchzone.model.Location;
import com.matchzone.model.PersonalInfo;
import com.matchzone.model.Project;
import com.matchzone.model.Skills;
import com.matchzone.service.DownstreamService;

//Annotate this class with @RestController

@CrossOrigin("*")
@RestController
public class DownstreamController {

	private DownstreamService downstreamService;

	/*
	 * @Autowired for injecting constructor based dependency
	 */

	@Autowired
	public DownstreamController(DownstreamService downstreamService) {
		super();
		this.downstreamService = downstreamService;
	}
	
	/*
	 * Get method for getting user's AcademicDetails with a specific id with a mapping "/api/v1/acad/{id}".
	 */

	@GetMapping("api/v1/acad/{id}")
	public ResponseEntity<?> getAcademicDetails(@PathVariable("id") String id){
		ResponseEntity<?> responseEntity;
		AcademicDetails academicDetails = downstreamService.getAcademicDetails(id);
		if(academicDetails == null)
			responseEntity = new ResponseEntity<>("NOt found", HttpStatus.NOT_FOUND);
		else
			responseEntity = new ResponseEntity<AcademicDetails>(academicDetails, HttpStatus.OK);
		return responseEntity;
			
	}
	
	/*
	 * Get method for getting user's CertificationDetails with a specific id with a mapping "/api/v1/certi/{id}".
	 */

	@GetMapping("api/v1/certi/{id}")
	public ResponseEntity<?> getCertificationDetails(@PathVariable("id") String id){
		ResponseEntity<?> responseEntity;
		Certification certificationDetails = downstreamService.getCertification(id);
		if(certificationDetails == null)
			responseEntity = new ResponseEntity<>("NOt found", HttpStatus.NOT_FOUND);
		else
			responseEntity = new ResponseEntity<Certification>(certificationDetails, HttpStatus.OK);
		return responseEntity;
			
	}
	
	/*
	 * Get method for getting user's LocationDetails with a specific id with a mapping "/api/v1/loc/{id}".
	 */

	@GetMapping("api/v1/loc/{id}")
	public ResponseEntity<?> getLocationDetails(@PathVariable("id") String id){
		ResponseEntity<?> responseEntity;
		Location locationDetails = downstreamService.getLocation(id);
		if(locationDetails == null)
			responseEntity = new ResponseEntity<>("NOt found", HttpStatus.NOT_FOUND);
		else
			responseEntity = new ResponseEntity<Location>(locationDetails, HttpStatus.OK);
		return responseEntity;
			
	}
	
	/*
	 * Get method for getting user's PersonalDetails with a specific id with a mapping "/api/v1/person/{id}".
	 */

	@GetMapping("api/v1/person/{id}")
	public ResponseEntity<?> getPersonalInfoDetails(@PathVariable("id") String id){
		ResponseEntity<?> responseEntity;
		PersonalInfo personalInfo = downstreamService.getPersonalInfo(id);
		if(personalInfo == null)
			responseEntity = new ResponseEntity<>("NOt found", HttpStatus.NOT_FOUND);
		else
			responseEntity = new ResponseEntity<PersonalInfo>(personalInfo, HttpStatus.OK);
		return responseEntity;
			
	}
	
	/*
	 * Get method for getting user's ProjectDetails with a specific id with a mapping "/api/v1/proj/{id}".
	 */

	@GetMapping("api/v1/proj/{id}")
	public ResponseEntity<?> getProjectDetails(@PathVariable("id") String id){
		ResponseEntity<?> responseEntity;
		Project projectDetails= downstreamService.getProject(id);
		if(projectDetails== null)
			responseEntity = new ResponseEntity<>("NOt found", HttpStatus.NOT_FOUND);
		else
			responseEntity = new ResponseEntity<Project>(projectDetails, HttpStatus.OK);
		return responseEntity;
			
	}
	
	/*
	 * Get method for getting user's SkillsDetails with a specific id with a mapping "/api/v1/skills/{id}".
	 */

	@GetMapping("api/v1/skills/{id}")
	public ResponseEntity<?> getSkillsDetails(@PathVariable("id") String id){
		ResponseEntity<?> responseEntity;
		Skills skillsdetail= downstreamService.getSkills(id);
		if(skillsdetail == null)
			responseEntity = new ResponseEntity<>("NOt found", HttpStatus.NOT_FOUND);
		else
			responseEntity = new ResponseEntity<Skills>(skillsdetail, HttpStatus.OK);
		return responseEntity;
			
	}
	
	
	
}
