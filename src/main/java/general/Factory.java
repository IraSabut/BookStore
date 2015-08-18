package general;

import sjc.app.repository.dao.AuthorDao;
import sjc.app.repository.dao.UserDao;
import sjc.app.repository.dao.impl.AuthorDaoImpl;
import sjc.app.repository.dao.impl.UserDaoImpl;

public class Factory {
	private static Factory instance = new Factory();
	private UserDao userDao;
	private AuthorDao authorDao;

	public UserDao getUserDao() {
		if (userDao == null)
			userDao = new UserDaoImpl();
		return userDao;
	}

	public AuthorDao getAuthorDao() {
		if (authorDao == null)
			authorDao = new AuthorDaoImpl();
		return authorDao;
	}

	public Factory() {

	}

	public static Factory getInstance() {
		return Factory.instance;
	}

}
