package sjc.app.repository.dao;

import java.sql.SQLException;
import java.util.List;

import sjc.domain.model.Contract;

public interface ContractDao {
	public void addContract(Contract contract) throws SQLException;

	public Contract getContract(int id) throws SQLException;

	public List<Contract> getContracts() throws SQLException;
}
