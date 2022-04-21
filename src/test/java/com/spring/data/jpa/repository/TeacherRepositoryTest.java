package com.spring.data.jpa.repository;

import java.util.List;

import com.spring.data.jpa.entity.Course;
import com.spring.data.jpa.entity.Teacher;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TeacherRepositoryTest {
    @Autowired
    private TeacherRepository teacherRepository;

    @Test
    void shouldCreateATeacher() {
        Course a = Course.builder().credit(3).title("new ").build();
        Course b = Course.builder().credit(5).title("new new").build();
        Teacher teacher = Teacher.builder()
                // .courseList(List.of(a, b))
                .email("new@teacher.com").name("hai new")
                .build();
        teacherRepository.save(teacher);

    }

}
