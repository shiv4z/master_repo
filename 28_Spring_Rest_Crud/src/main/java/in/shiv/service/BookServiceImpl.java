package in.shiv.service;

import java.util.List;

import org.springframework.stereotype.Service;

import in.shiv.entity.Book;
import in.shiv.repo.BookRepository;

@Service
public class BookServiceImpl implements BookService {

	private BookRepository bookRepository;

	public BookServiceImpl(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}

	@Override
	public String upsertData(Book book) {
		Integer bookId = book.getBookId();
		Book save = bookRepository.save(book);
		if (bookId == null) {
			return "Record inserted successfully..";
		} else {
			return "Record updated successfully..";
		}

	}

	@Override
	public List<Book> getAllBooks() {
		List<Book> bookList = bookRepository.findAll();
		return bookList;
	}

	@Override
	public String deleteBook(Integer bookId) {
		bookRepository.deleteById(bookId);
		return "Record deleted success";
	}

}
