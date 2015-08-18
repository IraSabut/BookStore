package sjc.domain.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "contract")
public class Contract {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idContract")
	private Integer idContract;
	@Column(name = "idBook")
	private Book idBook;
	@Column(name = "numberOfBooks")
	private int numberOfBooks;
	@Column(name = "valuePayments")
	private int valuePayments;
	@Column(name = "dateOfPublication")
	private Date dateOfPublication;
	@Column(name = "isSigned")
	private Boolean isSigned;
	@Column(name = "productionCost")
	private int productionCost;
	@Column(name = "fullPaymentToTheAuthor")
	private Integer fullPaymentToTheAuthor;

	public Integer getIdContract() {
		return idContract;
	}

	public void setIdContract(Integer idContract) {
		this.idContract = idContract;
	}

	public int getNumberOfBooks() {
		return numberOfBooks;
	}

	public void setNumberOfBooks(int numberOfBooks) {
		this.numberOfBooks = numberOfBooks;
	}

	public int getValuePayments() {
		return valuePayments;
	}

	public void setValuePayments(int valuePayments) {
		this.valuePayments = valuePayments;
	}

	public Date getDateOfPublication() {
		return dateOfPublication;
	}

	public void setDateOfPublication(Date dateOfPublication) {
		this.dateOfPublication = dateOfPublication;
	}

	public Boolean getIsSigned() {
		return isSigned;
	}

	public void setIsSigned(Boolean isSigned) {
		this.isSigned = isSigned;
	}

	public int getProductionCost() {
		return productionCost;
	}

	public void setProductionCost(int productionCost) {
		this.productionCost = productionCost;
	}

	public Integer getFullPaymentToTheAuthor() {
		return fullPaymentToTheAuthor;
	}

	public void setFullPaymentToTheAuthor(Integer fullPaymentToTheAuthor) {
		this.fullPaymentToTheAuthor = fullPaymentToTheAuthor;
	}

}
