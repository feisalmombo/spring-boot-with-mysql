package com.bestproject.springjpacourse;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {

    @Autowired
    private CourseRepository topicRepository;

    public List<Course> getAllTopics() {
        List<Course> topics = new ArrayList<>();
        topicRepository.findAll()
                .forEach(topics::add);
        return topics;
    }

    public Optional<Course> getTopic(String id) {
        return topicRepository.findById(id);

    }

    public void addTopic(Course topic) {
        topicRepository.save(topic);
    }

    public void updateTopic(String id, Course topic) {
        topicRepository.save(topic);
    }

    public void deleteTopic(String id) {
        topicRepository.deleteById(id);
    }
}