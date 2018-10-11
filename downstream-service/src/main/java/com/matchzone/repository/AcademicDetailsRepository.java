package com.matchzone.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.matchzone.model.AcademicDetails;

/*Marking this class as @Repository as it will interact with the MongoDB
 * */

@Repository
public interface AcademicDetailsRepository extends MongoRepository<AcademicDetails, String>{

}
