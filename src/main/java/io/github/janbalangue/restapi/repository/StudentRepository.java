package io.github.janbalangue.restapi.repository;

import io.github.janbalangue.restapi.model.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;

public interface StudentRepository extends MongoRepository<Student, String> {

    Optional<Student> findById(String id);
    Student findByFirstNameAndLastName(String firstName, String lastName);
    List<Student> findByGrade(Student.Grade grade);
}
