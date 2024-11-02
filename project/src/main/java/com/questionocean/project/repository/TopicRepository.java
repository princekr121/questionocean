package com.questionocean.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.questionocean.project.entity.Topic;

public interface TopicRepository extends JpaRepository<Topic,Integer>{

}
