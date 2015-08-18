package general;

import sjc.app.repository.dao.AuthorDao;
import sjc.app.repository.dao.AutorizationDataDao;
import sjc.app.repository.dao.ContractDao;
import sjc.app.repository.dao.UserDao;
import sjc.app.repository.dao.impl.AuthorDaoImpl;
import sjc.app.repository.dao.impl.AutorizationDataDaoImpl;
import sjc.app.repository.dao.impl.ContractDaoImpl;
import sjc.app.repository.dao.impl.UserDaoImpl;

public class Factory {
	private static Factory instance = new Factory();
	private UserDao userDao;
	private AuthorDao authorDao;
	private ContractDao contractDao;
	private AutorizationDataDao authorizationDataDao;

	public UserDao getUserDao() {
		if (userDao == null)
			userDao = new UserDaoImpl();
		return userDao;
	}

	public ContractDao getContractDao() {
		if (contractDao == null)
			contractDao = new ContractDaoImpl();
		return contractDao;
	}

	public AuthorDao getAuthorDao() {
		if (authorDao == null)
			authorDao = new AuthorDaoImpl();
		return authorDao;
	}

	public AutorizationDataDao getAuth() {
		if (authorizationDataDao == null)
			authorizationDataDao = new AutorizationDataDaoImpl();
		return authorizationDataDao;
	}

	public Factory() {

	}

	public static Factory getInstance() {
		return Factory.instance;
	}

}
