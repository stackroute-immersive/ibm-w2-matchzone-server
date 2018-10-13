package com.stackroute.matchzone.indexermodel;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.RestController;

import com.stackroute.matchzone.listener.KafkaConsumer;
import com.stackroute.matchzone.model.Project;

@RestController

public class IndexerOutput {

	@Autowired
	private KafkaTemplate<String, ProjectIndex> kafkaTemplate;
	
	
	static final  String topic="project1_data";
	
	@Autowired
	//RelationshipPropertyImplementation weightage;

	private static final Logger LOG = LoggerFactory.getLogger(KafkaConsumer.class);


	@KafkaListener(topics = "project_data", groupId = "group_json", containerFactory = "projectKafkaListenerFactory")
	public void consumeJson(Project project) {
		String projects= project.getProjectTitle();
		//LOG.info("Weightage is",weightage.weightageAssigner(skills));
		kafkaTemplate.send(topic,
				new ProjectIndex(project.getUserName(),project.getProjectTitle()));
		LOG.info("Produced JSON message on indexer='{}'");

	}

}
