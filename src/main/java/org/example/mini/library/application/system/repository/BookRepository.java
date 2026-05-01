package org.example.mini.library.application.system.repository;

import org.example.mini.library.application.system.model.BookEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<BookEntity, Long> {

    List<BookEntity> findByTitleIgnoreCase(String title);


    boolean existsByisbn(String isbn);

    @Query("SELECT b FROM BookEntity b WHERE b.quantity = 0")
    List<BookEntity> findUnavailableBooks();

}