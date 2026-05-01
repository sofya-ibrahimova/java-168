package org.example.mini.library.application.system.service;

import org.example.mini.library.application.system.dto.StudentDto;
import org.example.mini.library.application.system.exception.EntityNotFoundException;
import org.example.mini.library.application.system.exception.ValidationException;
import org.example.mini.library.application.system.model.StudentEntity;
import org.example.mini.library.application.system.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    private StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public void save(StudentDto studentDto) {
        Boolean isEmailExist = studentRepository.existsByEmail(studentDto.getEmail());
        if (isEmailExist){
            throw new ValidationException("EMAIL_ALSO_EXIST!"); //is email unique?
        }
        StudentEntity student = toEntity(studentDto);
        studentRepository.save(student);
    }

    public List<StudentDto> findAll() {
        List<StudentDto> students = studentRepository.findAll()
                .stream()
                .map(this::toDto)
                .toList();
        return students;
    }


    public StudentDto findById(Long id) {
        StudentEntity student = studentRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("STUDENT_WITH_ID " + id + " NOT_FOUND"));
        StudentDto studentDto = toDto(student);
        return studentDto;
    }


    private StudentDto toDto(StudentEntity student) {
        return new StudentDto(
                student.getId(),
                student.getFullName(),
                student.getEmail(),
                student.getPhone(),
                student.getCreatedAt()
        );
    }

    private StudentEntity toEntity(StudentDto student) {
        return new StudentEntity(
                student.getId(),
                student.getFullName(),
                student.getEmail(),
                student.getPhone(),
                student.getCreatedAt()
        );

    }
}
