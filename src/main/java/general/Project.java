package general;

import java.sql.SQLException;
import java.util.List;

import sjc.app.repository.dao.AuthorDao;
import sjc.app.repository.dao.UserDao;
import sjc.domain.model.Author;
import sjc.domain.model.User;

public class Project {

	public static void main(String[] args) throws SQLException {
		Factory factory = Factory.getInstance();

		UserDao userDao = factory.getUserDao();
		List<User> users = userDao.getUsers();
		System.out.println(
				"Adress    AmountOfMoney     Email      FirstName LastName    id   phoneNumber    authorizationData");
		for (User user : users) {
			System.out.println(user.getAddress() + " " + user.getAmountOfMoney() + " " + user.getEmail() + " "
					+ user.getFirstName() + " " + user.getLastName() + " " + user.getUserId() + " "
					+ user.getPhoneNumber() + " " + user.getAuthorizationData());

		}

		AuthorDao authorDao = factory.getAuthorDao();
		System.out.println("AutorId    User");
		Author a = new Author();
		a.setAuthorId(1L);
		;
		a.setUser(2);
		List<Author> authors = authorDao.getAuthors();

		Author author = new Author(1L, 2);

		authorDao.addAuthor(author);

		for (Author autho : authors) {
			System.out.println(autho.getAuthorId() + " " + autho.getUser());
		}

	}

}
