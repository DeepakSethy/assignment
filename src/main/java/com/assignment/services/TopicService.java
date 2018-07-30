package com.assignment.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.assignment.models.Topic;

/**
 * 
 * @author dsethy
 * Business Services
 */

@Service
public class TopicService {
	
	private List<Topic> topics = new ArrayList<>(Arrays.asList(new Topic("spring","Sp Framework","Spring Framework Desciption"),
			new Topic("java","collection","Java 8 Collection"),
			new Topic("JS","Java Script","Java Script Dynamic Language")
			));
	
	public List<Topic> getAllTopics(){
		return topics;
	}
	
	
	public Topic getTopic(String id){
		return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}

	public void addTopic(Topic topic) {
		topics.add(topic);
	}


	public void updateTopic(String id, Topic topic) {
		for(int i=0;i <topics.size() ;i++){
			Topic top = topics.get(i);
			if(top.getId().equals(id)){
				topics.set(i, topic);
				return;
			}
		}
		
	}

	public void deleteTopic(String id) {
		topics.removeIf(t -> t.getId().equals(id));
		
	}
}
