package com.dailycodebuffer.spring.data.jpa.tutorial.entity.repository;

import com.dailycodebuffer.spring.data.jpa.tutorial.entity.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {
}
