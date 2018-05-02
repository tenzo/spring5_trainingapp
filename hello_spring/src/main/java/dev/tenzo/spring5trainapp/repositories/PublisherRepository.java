package dev.tenzo.spring5trainapp.repositories;

import dev.tenzo.spring5trainapp.model.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
