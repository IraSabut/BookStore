package general;

import java.sql.SQLException;
import java.util.List;

import sjc.app.repository.dao.AuthorDao;
import sjc.app.repository.dao.AutorizationDataDao;
import sjc.app.repository.dao.ContractDao;
import sjc.app.repository.dao.UserDao;
import sjc.domain.model.Author;
import sjc.domain.model.AuthorizationData;
import sjc.domain.model.Contract;
import sjc.domain.model.User;

public class Project {

	public static void main(String[] args) throws SQLException {
		Factory factory = Factory.getInstance();

		UserDao userDao = factory.getUserDao();
		List<User> users = userDao.getUsers();
		System.out.println(
				"Adress    AmountOfMoney     Email      FirstName LastName    id   phoneNumber    authorizationData");
		for (User user : users) {
			System.out.println(user.getAddress() + " " + user.getAmountOfMoney() + " " + user.getEmail() + " "
					+ user.getFirstName() + " " + user.getLastName() + " " + user.getUserId() + " "
					+ user.getPhoneNumber() + " " + user.getAuthorizationData());

		}

		ContractDao contractDao = factory.getContractDao();
		List<Contract> contracts = contractDao.getContracts();
		System.out.println(
				"IdBook    NumberOfBooks    ProductionCost    ValuePayments FullPaymentToTheAuthor    idContract   DateOfPublication    IsSigned");
		for (Contract contract : contracts) {
			System.out.println(contract.getIdBook() + " " + contract.getNumberOfBooks() + " "
					+ contract.getProductionCost() + " " + contract.getValuePayments() + " "
					+ contract.getFullPaymentToTheAuthor() + " " + contract.getIdContract() + " "
					+ contract.getDateOfPublication() + " " + contract.getIsSigned());

		}
		AutorizationDataDao autorizationDataDao = factory.getAuth();
		System.out.println("IdAutorizationData   Login Password  Role");
		List<AuthorizationData> autorization = autorizationDataDao.getAutorisationDaties();
		for (AuthorizationData auth : autorization) {
			System.out.println(auth.getIdAutorizationData() + " " + auth.getLogin() + " " + auth.getPassword() + " "
					+ auth.getRole());

		}

		AuthorDao authorDao = factory.getAuthorDao();
		System.out.println("AutorId    User");
		List<Author> authors = authorDao.getAuthors();
		for (Author autho : authors) {
			System.out.println(autho.getAuthorId() + " " + autho.getUser());
		}

	}

}
