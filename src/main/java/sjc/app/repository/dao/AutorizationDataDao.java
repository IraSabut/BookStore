package sjc.app.repository.dao;

import java.sql.SQLException;

import sjc.domain.model.AuthorizationData;

public interface AutorizationDataDao {
	public void addAutorisationData(AuthorizationData autorisationData) throws SQLException;

	public AuthorizationData getUAutorisationData(int id) throws SQLException;

}
