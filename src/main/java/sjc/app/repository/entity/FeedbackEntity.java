package sjc.app.repository.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "feedback")
public class FeedbackEntity {
	@Id
	@Column(name = "id_feedback")
	private Long idFeedback;

	@Column(name = "feedback")
	private String feedback;

	public FeedbackEntity() {
	}

	public Long getIdfeedback() {
		return idFeedback;
	}

	public void setIdfeedback(Long idfeedback) {
		this.idFeedback = idfeedback;
	}

	public String getFeedback() {
		return feedback;
	}

	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}

}
