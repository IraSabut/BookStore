package sjc.app.repository.dao.impl;

import java.sql.SQLException;

import org.hibernate.Session;

import sjc.app.repository.dao.AutorizationDataDao;
import sjc.app.repository.hibernate.HibernateUtil;
import sjc.domain.model.AuthorizationData;

public class AutorizationDataDaoImpl implements AutorizationDataDao {

	public void addAutorisationData(AuthorizationData autorisationData) throws SQLException {
		Session session = null;
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			session.beginTransaction();
			session.save(autorisationData);
			session.getTransaction().commit();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if ((session != null) && (session.isOpen()))
				session.close();
		}

	}

	public AuthorizationData getUAutorisationData(int id) throws SQLException {
		AuthorizationData autorisationData = null;
		Session session = null;
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			autorisationData = (AuthorizationData) session.load(AuthorizationData.class, id);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if ((session != null) && (session.isOpen()))
				session.close();
		}

		return autorisationData;
	}

}
