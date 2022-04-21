package com.spring.data.jpa.repository;

import java.util.List;

import javax.transaction.Transactional;

import com.spring.data.jpa.entity.Student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    public List<Student> findByFirstName(String firstName);

    public List<Student> findByFirstNameContaining(String firstName);

    public List<Student> findByGuardianName(String name);

    public Student findByEmailId(String email);

    @Query("select s from Student s where s.emailId = ?1")
    public Student getStudentByEmail(String email);

    @Query(value = "SELECT * from tbl_student s where s.email_address =?1", nativeQuery = true)
    Student getStudentByEmailAdd(String emailId);

    @Transactional
    @Modifying
    @Query(value = "update tbl_student set first_name =?1 where email_address = ?2", nativeQuery = true)
    int updateStudentNameByEmailId(String firstName, String emailId);
}
