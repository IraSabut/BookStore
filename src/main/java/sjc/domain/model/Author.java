package sjc.domain.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "author")
public class Author {
	@Id
	@Column(name = "idAuthor")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long authorId;

	public Long getAuthorId() {
		return authorId;
	}

	public void setAuthorId(Long authorId) {
		this.authorId = authorId;
	}

	public int getUser() {
		return user;
	}

	public void setUser(int user) {
		this.user = user;
	}

	@Column(name = "idUser")
	private int user;

	public Author() {

	}

	public Author(Long authorId, int user) {
		this.authorId = authorId;
		this.user = user;
	}

}
