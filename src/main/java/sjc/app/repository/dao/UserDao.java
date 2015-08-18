package sjc.app.repository.dao;

import java.sql.SQLException;
import java.util.List;

import sjc.domain.model.User;

public interface UserDao {
	public void addUser(User user) throws SQLException;

	public void updateUser(User user) throws SQLException;

	public User getUser(int id) throws SQLException;

	public List<User> getUsers() throws SQLException;
}
