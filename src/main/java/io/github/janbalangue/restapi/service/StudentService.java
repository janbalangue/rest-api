package io.github.janbalangue.restapi.service;

import io.github.janbalangue.restapi.model.Student;

import java.util.List;
import java.util.Optional;

public interface StudentService {

    List<Student> findAll();
    Optional<Student> findById(String id);
    Student findByName(String name);
    Student saveOrUpdateStudent(Student student);
    void deleteStudentById(String id);
}
