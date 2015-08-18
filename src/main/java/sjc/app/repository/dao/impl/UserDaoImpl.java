package sjc.app.repository.dao.impl;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.Session;

import sjc.app.repository.dao.UserDao;
import sjc.app.repository.hibernate.HibernateUtil;
import sjc.domain.model.User;

public class UserDaoImpl implements UserDao {

	public void addUser(User user) throws SQLException {
		Session session = null;
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			session.beginTransaction();
			session.save(user);
			session.getTransaction().commit();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if ((session != null) && (session.isOpen()))
				session.close();
		}

	}

	public User getUser(int id) throws SQLException {
		User user = null;
		Session session = null;
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			user = (User) session.load(User.class, id);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if ((session != null) && (session.isOpen()))
				session.close();
		}

		return user;
	}

	public List<User> getUsers() throws SQLException {
		List<User> users = null;
		Session session = null;
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			users = session.createCriteria(User.class).list();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if ((session != null) && (session.isOpen()))
				session.close();
		}

		return users;
	}

	public void updateUser(User user) throws SQLException {
		// TODO Auto-generated method stub

	}

}
