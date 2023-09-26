package in.shiv.repository;

import org.springframework.data.repository.CrudRepository;

import in.shiv.entity.Book;

public interface BookRepository extends CrudRepository<Book, Integer>{

}
