package sjc.domain.service;

import java.util.List;

import sjc.domain.model.Account;
import sjc.domain.model.Book;
import sjc.domain.model.BookSearchCritearia;
import sjc.domain.model.Cart;
import sjc.domain.model.Genre;
import sjc.domain.model.Order;

public interface BookStoreService {
	List<Book> findBooksByGenre(Genre genre);

	Book findBook(Long id);

	Order findOrder(Long id);

	List<Book> findRandomBooks();

	List<Order> findOrdersForAccount(Account account);

	Order store(Order order);

	List<Book> findBooks(BookSearchCritearia bookSearchCriteria);

	Order createOrder(Cart cart, Account account);

	List<Genre> findAllGenres();

	void addBook(Book book);
}
