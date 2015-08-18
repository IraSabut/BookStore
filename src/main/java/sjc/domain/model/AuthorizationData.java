package sjc.domain.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "autorizationData")
public class AuthorizationData {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idAutorizationData")
	private Integer idAutorizationData;
	@javax.validation.constraints.NotNull
	@Column(name = "login")
	private String login;
	@javax.validation.constraints.NotNull
	@Column(name = "password")
	private String password;
	@Column(name = "idRole")
	private String role;

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public Integer getIdAutorizationData() {
		return idAutorizationData;
	}

	public void setIdAutorizationData(Integer idAutorizationData) {
		this.idAutorizationData = idAutorizationData;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
