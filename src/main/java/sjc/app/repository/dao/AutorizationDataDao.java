package sjc.app.repository.dao;

import java.sql.SQLException;
import java.util.List;

import sjc.domain.model.AuthorizationData;

public interface AutorizationDataDao {
	public void addAutorisationData(AuthorizationData autorisationData) throws SQLException;

	public AuthorizationData getUAutorisationData(int id) throws SQLException;

	public List<AuthorizationData> getAutorisationDaties() throws SQLException;

}
