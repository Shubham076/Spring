package com.shubham.demo.repositories;
import com.shubham.demo.models.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
