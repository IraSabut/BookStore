package sjc.app.repository.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "rating")
public class RatingEntity {

	@Id
	@Column(name = "id_rating")
	private Long idRating;

	@Column(name = "rating")
	private String rating;

	public RatingEntity() {

	}

	public Long getIdRating() {
		return idRating;
	}

	public void setIdRating(Long idRating) {
		this.idRating = idRating;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

}
