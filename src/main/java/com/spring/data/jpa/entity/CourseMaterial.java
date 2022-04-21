package com.spring.data.jpa.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CourseMaterial {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long courseMaterialId;
    private String url;

    @OneToOne
    @JoinColumn(name = "course_id", referencedColumnName = "courseId")
    private Course course;
}
