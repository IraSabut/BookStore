package sjc.app.repository.dao.impl;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.Session;

import sjc.app.repository.dao.AuthorDao;
import sjc.app.repository.hibernate.HibernateUtil;
import sjc.domain.model.Author;

public class AuthorDaoImpl implements AuthorDao {

	public void addAuthor(Author author) throws SQLException {
		Session session = null;
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			session.beginTransaction();
			session.save(author);
			session.getTransaction().commit();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if ((session != null) && (session.isOpen()))
				session.close();
		}
	}

	public void updateAuthor(Author author) throws SQLException {

	}

	public Author getAuthor(int id) throws SQLException {
		Author author = null;
		Session session = null;
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			author = (Author) session.load(Author.class, id);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if ((session != null) && (session.isOpen()))
				session.close();
		}

		return author;
	}

	public List<Author> getAuthors() throws SQLException {
		List<Author> authors = null;
		Session session = null;
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			authors = session.createCriteria(Author.class).list();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if ((session != null) && (session.isOpen()))
				session.close();
		}

		return authors;

	}

}
