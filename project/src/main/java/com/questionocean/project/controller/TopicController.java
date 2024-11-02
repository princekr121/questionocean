package com.questionocean.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.questionocean.project.entity.Topic;
import com.questionocean.project.repository.TopicRepository;

@RestController
public class TopicController {
	@Autowired
	TopicRepository repository ;
	@GetMapping("/topics")
	public List<Topic> getAllTopics(){
		return repository.findAll();

	}

}
