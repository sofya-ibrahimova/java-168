package org.example.mini.library.application.system.controller;


import org.example.mini.library.application.system.dto.StudentDto;
import org.example.mini.library.application.system.service.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {
    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping
    public void save(@RequestBody StudentDto studentDto) {
        studentService.save(studentDto);
    }

    @GetMapping
    public List<StudentDto> findAll() {
        return studentService.findAll();
    }

    @GetMapping("/{id}")
    public StudentDto findById(@PathVariable Long id) {
        return studentService.findById(id);
    }
}
