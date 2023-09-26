package in.shiv.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import in.shiv.entity.Book;

public interface BookRepository extends JpaRepository<Book, Serializable>{
	

}
