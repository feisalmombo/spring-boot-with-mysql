package com.bestproject.springjpacourse;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {

    @Autowired
    private CourseService courseService;

    // Get All Course Route
    @RequestMapping("/topics/{id}/courses")
    public List<Course> getAllCourses() {
        return courseService.getAllCourses();
    }

    // Single Course with id Route
    @RequestMapping("/topics/{id}")
    public Optional<Course> getTopic(@PathVariable String id) {
        return courseService.getCourse(id);
    }

    // Add Course Route
    @RequestMapping(method = RequestMethod.POST, value = "/topics")
    public void addCourse(@RequestBody Course topic) {
        courseService.addCourse(topic);
    }

    // Update Course Route
    @RequestMapping(method = RequestMethod.PUT, value = "/topics/{id}")
    public void updateCourse(@RequestBody Course topic, @PathVariable String id) {
        courseService.updateCourse(id, topic);
    }

    // Delete Course Route
    @RequestMapping(method = RequestMethod.DELETE, value = "/topics/{id}")
    public void deleteCourse(@PathVariable String id) {
        courseService.deleteCourse(id);
    }
}
