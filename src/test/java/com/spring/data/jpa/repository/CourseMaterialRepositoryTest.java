package com.spring.data.jpa.repository;

import com.spring.data.jpa.entity.Course;
import com.spring.data.jpa.entity.CourseMaterial;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CourseMaterialRepositoryTest {
    @Autowired
    private CourseMaterialRepository repo;

    @Test
    void saveCourseMaterial() {
        Course course = Course.builder().credit(2).title("how to dsa").build();

        CourseMaterial courseMaterial = CourseMaterial.builder().course(course).url("www.howtodsa.com").build();

        repo.save(courseMaterial);
    }

    @Test
    void fetchLazy() {
        System.out.println(repo.findById((long) 2));
    }
}
