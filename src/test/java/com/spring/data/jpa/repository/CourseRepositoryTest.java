package com.spring.data.jpa.repository;

import java.util.List;

import com.spring.data.jpa.entity.Course;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CourseRepositoryTest {

    @Autowired
    private CourseRepository courseRepository;

    @Test
    void getAllCourses() {
        List<Course> coursesList = courseRepository.findAll();
        System.out.println(coursesList);
    }
}
