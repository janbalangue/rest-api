package io.github.janbalangue.restapi.controller;

import io.github.janbalangue.restapi.dto.StudentDTO;
import io.github.janbalangue.restapi.model.Student;
import io.github.janbalangue.restapi.model.Student.Grade;
import io.github.janbalangue.restapi.service.StudentService;
import io.github.janbalangue.restapi.util.ObjectMapperUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping(value = "/")
    public List<StudentDTO> getAllStudents() {
        return ObjectMapperUtils.mapAll(studentService.findAll(), StudentDTO.class);
    }

    @GetMapping(value = "/byId/{id}")
    public StudentDTO getStudentById(@PathVariable("id") String id) {
        return ObjectMapperUtils.map(studentService.findById(id), StudentDTO.class);
    }

    @GetMapping(value = "/byName/{name}")
    public StudentDTO getStudentByName(@PathVariable("name") String name) {
        return ObjectMapperUtils.map(studentService.findByName(name), StudentDTO.class);
    }
    @GetMapping(value = "/byGrade/{grade}")
    public StudentDTO getStudentByGrade(@PathVariable("grade") Grade grade) {
        return ObjectMapperUtils.map(studentService.findByGrade(grade), StudentDTO.class);
    }

    @PostMapping(value = "/save")
    public ResponseEntity<?> saveOrUpdateStudent(@RequestBody StudentDTO studentDTO) {
        studentService.saveOrUpdateStudent(ObjectMapperUtils.map(studentDTO, Student.class));
        return new ResponseEntity("Student added successfully", HttpStatus.OK);
    }
}
