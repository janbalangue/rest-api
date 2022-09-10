package io.github.janbalangue.restapi.controller;

import io.github.janbalangue.restapi.dto.StudentDTO;
import io.github.janbalangue.restapi.service.StudentService;
import io.github.janbalangue.restapi.util.ObjectMapperUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
