package org.example.mini.library.application.system.repository;

import org.example.mini.library.application.system.model.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<StudentEntity, Long> {

    boolean existsByEmail(String email);


}
