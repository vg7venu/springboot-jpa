package com.spring.data.jpa.repository;

import java.util.List;

import com.spring.data.jpa.entity.Course;
import com.spring.data.jpa.entity.Teacher;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CourseRepositoryTest {

    @Autowired
    private CourseRepository courseRepository;

    @Test
    void shouldGetAllCourses() {
        List<Course> coursesList = courseRepository.findAll();
        System.out.println(coursesList);
    }

    @Test
    void shouldCreateCourseWithTeacher() {
        Teacher teacher = Teacher.builder()
                .email("new@teacher.com").name("hai new")
                .build();
        Course a = Course.builder().credit(3).title("new ").teacher(teacher).build();
        courseRepository.save(a);
    }

}
