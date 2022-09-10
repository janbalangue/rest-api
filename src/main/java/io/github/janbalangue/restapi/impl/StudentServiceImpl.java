package io.github.janbalangue.restapi.impl;

import io.github.janbalangue.restapi.model.Student;
import io.github.janbalangue.restapi.service.StudentService;

import java.util.List;
import java.util.Optional;

public class StudentServiceImpl implements StudentService {

    @Override
    public List<Student> findAll() {
        return null;
    }


    @Override
    public Optional<Student> findById(String id) {
        return Optional.empty();
    }

    @Override
    public Student findByFirstNameAndLastName(String firstName, String lastName) {
        return null;
    }

    @Override
    public List<Student> findByGrade(String grade) {
        return null;
    }

    @Override
    public Student saveOrUpdateStudent(Student student) {
        return null;
    }

    @Override
    public void deleteStudentById(String id) {

    }
}
