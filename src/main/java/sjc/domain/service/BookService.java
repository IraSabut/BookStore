package sjc.domain.service;

import java.util.List;

import sjc.domain.model.Book;

public interface BookService {

	void saveBook(Book book);

	void deleteBook(Book book);

	Book getBookById(Long bookId);

	List<Book> getBooks();

	void updateBook(Book book);

}
