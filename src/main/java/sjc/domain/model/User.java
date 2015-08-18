package sjc.domain.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User {
	@Id
	@Column(name = "idUser")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long userId;
	@Column(name = "address")
	private String address;
	@Column(name = "phoneNumber")
	private int phoneNumber;
	@Column(name = "email")
	private String email;
	@Column(name = "lastName")
	private String lastName;
	@Column(name = "firstName")
	private String firstName;
	@Column(name = "patronymic")
	private String patronymic;
	@Column(name = "amountOfMoney")
	private int amountOfMoney;
	@Column(name = "idAutorizationData")
	private AuthorizationData authorizationData;

	public User() {

	}

	public User(Long userId, String address, int phoneNumber, String email, String lastName, String firstName,
			String patronymic, int amountOfMoney, AuthorizationData authorizationData) {
		this.userId = userId;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.lastName = lastName;
		this.firstName = firstName;
		this.patronymic = patronymic;
		this.amountOfMoney = amountOfMoney;
		this.authorizationData = authorizationData;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getPatronymic() {
		return patronymic;
	}

	public void setPatronymic(String patronymic) {
		this.patronymic = patronymic;
	}

	public int getAmountOfMoney() {
		return amountOfMoney;
	}

	public void setAmountOfMoney(int amountOfMoney) {
		this.amountOfMoney = amountOfMoney;
	}

	public AuthorizationData getAuthorizationData() {
		return authorizationData;
	}

	public void setAuthorizationData(AuthorizationData authorizationData) {
		this.authorizationData = authorizationData;
	}

}
