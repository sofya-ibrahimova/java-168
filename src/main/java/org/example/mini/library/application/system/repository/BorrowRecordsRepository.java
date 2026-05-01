package org.example.mini.library.application.system.repository;

import org.example.mini.library.application.system.model.BorrowRecordsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface BorrowRecordsRepository extends JpaRepository<BorrowRecordsEntity, Long> {

    @Query("UPDATE BorrowRecordsEntity b SET b.status = 'returned', b.returnDate = CURRENT DATE " +
            "WHERE b.id = :id ")
    void returnBook(@Param("id") Long id); // ??аннотация

    @Query("SELECT b FROM BorrowRecordsEntity b WHERE b.status = 'borrowed'")
    List<BorrowRecordsEntity> findAllBorrowed();

    boolean existsByStudentIdAndBookId(Long studentId, Long bookId);
}


