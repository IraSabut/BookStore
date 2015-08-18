package sjc.app.repository.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "genre")
public class GenreEntity {
	@Id
	@Column(name = "id_genre")
	private Long idGenre;

	@Column(name = "genre_name")
	private String genreName;

	public GenreEntity() {
	}

	public GenreEntity(Long idGenre, String genreName) {

		this.idGenre = idGenre;
		this.genreName = genreName;
	}

	public Long getIdGenre() {
		return idGenre;
	}

	public void setIdGenre(Long idGenre) {
		this.idGenre = idGenre;
	}

	public String getGenreName() {
		return genreName;
	}

	public void setGenreName(String genreName) {
		this.genreName = genreName;
	}

}
