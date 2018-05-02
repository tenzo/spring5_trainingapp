package dev.tenzo.spring5trainapp.repositories;

import dev.tenzo.spring5trainapp.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
