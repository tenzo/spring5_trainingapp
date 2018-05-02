package dev.tenzo.spring5trainapp.repositories;

import dev.tenzo.spring5trainapp.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
