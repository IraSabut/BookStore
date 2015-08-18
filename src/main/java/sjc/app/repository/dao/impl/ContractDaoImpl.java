package sjc.app.repository.dao.impl;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.Session;

import sjc.app.repository.dao.ContractDao;
import sjc.app.repository.hibernate.HibernateUtil;
import sjc.domain.model.Contract;

public class ContractDaoImpl implements ContractDao {

	public void addContract(Contract contract) throws SQLException {

		Session session = null;
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			session.beginTransaction();
			session.save(contract);
			session.getTransaction().commit();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if ((session != null) && (session.isOpen()))
				session.close();
		}
	}

	public Contract getContract(int id) throws SQLException {
		Contract contract = null;
		Session session = null;
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			contract = (Contract) session.load(Contract.class, id);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if ((session != null) && (session.isOpen()))
				session.close();
		}

		return contract;
	}

	public List<Contract> getContracts() throws SQLException {
		List<Contract> contracts = null;
		Session session = null;
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			contracts = session.createCriteria(Contract.class).list();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if ((session != null) && (session.isOpen()))
				session.close();
		}

		return contracts;
	}

}
