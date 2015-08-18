package sjc.app.repository.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "payment_type")
public class PaymentTypeEntity {
	@Id
	@Column(name = "id_payment_type")
	private Long idPaymentType;

	@Column(name = "payment_type_name")
	private String paymentTypeName;

	public Long getIdPaymentType() {
		return idPaymentType;
	}

	public void setIdPaymentType(Long idPaymentType) {
		this.idPaymentType = idPaymentType;
	}

	public String getPaymentTypeName() {
		return paymentTypeName;
	}

	public void setPaymentTypeName(String paymentTypeName) {
		this.paymentTypeName = paymentTypeName;
	}

	public PaymentTypeEntity() {

	}

	public PaymentTypeEntity(Long idPaymentType, String paymentTypeName) {
		this.idPaymentType = idPaymentType;
		this.paymentTypeName = paymentTypeName;
	}

}
