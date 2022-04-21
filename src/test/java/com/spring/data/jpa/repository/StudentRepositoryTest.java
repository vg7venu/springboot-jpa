package com.spring.data.jpa.repository;

import java.util.List;

import com.spring.data.jpa.entity.Course;
import com.spring.data.jpa.entity.Guardian;
import com.spring.data.jpa.entity.Student;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class StudentRepositoryTest {

    @Autowired
    private StudentRepository studentRepository;

    @Test
    void shouldSaveStudent() {
        Student student = Student.builder().emailId("venugopal2@gmail.com").firstName("venu")
                .lastName("lastName").guardian(new Guardian("name", "email", "mobile")).build();
        studentRepository.save(student);
    }

    @Test
    void shouldGetAllStudents() {
        List<Student> student = studentRepository.findAll();
        System.out.println(student);
    }

    @Test
    void shouldPrintStudentUsingFirstName() {
        List<Student> students = studentRepository.findByFirstName("venu");
        System.out.println(students.size());
    }

    @Test
    void shouldPrintStudentUsingFirstNameContaining() {
        List<Student> students = studentRepository.findByFirstNameContaining("ve");
        System.out.println(students.size());
    }

    @Test
    void shouldPrintStudentUsingGuardianName() {
        List<Student> students = studentRepository.findByGuardianName("name");
        System.out.println(students);
    }

    @Test
    void shouldGetStudenyByEmail() {
        Student student = studentRepository.getStudentByEmail("venugopal@gmail.com");
        System.out.println(student);
    }

    @Test
    void shouldFindStudentByEmail() {
        Student student = studentRepository.findByEmailId("venugopal@gmail.com");
        System.out.println(student);
    }

    @Test
    void shouldTestNativeQuery() {
        Student student = studentRepository.getStudentByEmailAdd("venugopal@gmail.com");
        System.out.println(student);
    }

    @Test
    void shouldUpdateStudent() {
        studentRepository.updateStudentNameByEmailId("gmomomomo", "venugopal@gmail.com");
        // System.out.println("\n\n\n" + a);
    }

}
