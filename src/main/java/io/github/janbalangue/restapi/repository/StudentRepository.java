package io.github.janbalangue.restapi.repository;

import io.github.janbalangue.restapi.model.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface StudentRepository extends MongoRepository<Student, String> {

    Optional<Student> findById(String id);
    Student findByName(String name);
    void deleteById(String id);
}
