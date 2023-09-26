package in.shiv.service;

import java.util.List;

import in.shiv.entity.Book;

public interface BookService {
	public String upsertData(Book book);
	public List<Book> getAllBooks();
	public String deleteBook(Integer bookId);

}
