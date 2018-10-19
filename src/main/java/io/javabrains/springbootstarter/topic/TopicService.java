package io.javabrains.springbootstarter.topic;

import java.util.ArrayList;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {

	@Autowired
	TopicRepository topicRepository;
	
	public List<Topic> getAllTopics(){
		List<Topic> topics = new ArrayList<>();
		
		topicRepository.findAll().forEach(topics::add);
		return topics;
	}

	public void addFilmTopic(Topic topic) {
		topicRepository.save(topic);
	}


	public void updateFilmTopic(String id, Topic topic) {
		topicRepository.save(topic);
	}

	public void deleteFilmTopic(String id) {
		topicRepository.deleteById(id);
	}
}