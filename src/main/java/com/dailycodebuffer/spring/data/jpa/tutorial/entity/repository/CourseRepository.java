package com.dailycodebuffer.spring.data.jpa.tutorial.entity.repository;

import com.dailycodebuffer.spring.data.jpa.tutorial.entity.entity.Course;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseRepository extends JpaRepository<Course,Long> {

}
