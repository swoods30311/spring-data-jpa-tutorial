package com.dailycodebuffer.spring.data.jpa.tutorial.entity.repository;

import com.dailycodebuffer.spring.data.jpa.tutorial.entity.entity.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class StudentRepositoryTest {

    @Autowired
    //Arrange
    private StudentRepository studentRepository;

    @Test
    public void saveStudent(){
        //Act: causing the action we want to occur so it can be tested
        Student student = Student.builder()
                .emailId("shabbir@gmail.com")
                .firstName("Shabbir")
                .lastName("Dawoodi")
                .guardianName("Nikhil")
                .guardianEmail("nikhil@gmail.com")
                .guardianMobile("9999999999").
                build();

        studentRepository.save(student);
    }

    @Test
    public void printAllStudent() {
        List<Student> studentList =
                studentRepository.findAll();

        System.out.println("studentList = " + studentList);
    }
}