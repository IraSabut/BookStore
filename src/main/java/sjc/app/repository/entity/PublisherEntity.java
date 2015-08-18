package sjc.app.repository.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "publisher")
public class PublisherEntity {

	@Id
	@Column(name = "id_publisher")
	private Long idPublisher;

	@Column(name = "publisher_name")
	private String publisherName;

	public PublisherEntity() {
	}

	public PublisherEntity(Long idPublisher, String publisherName) {

		this.idPublisher = idPublisher;
		this.publisherName = publisherName;
	}

	public Long getIdPublisher() {
		return idPublisher;
	}

	public void setIdPublisher(Long idPublisher) {
		this.idPublisher = idPublisher;
	}

	public String getPublisherName() {
		return publisherName;
	}

	public void setPublisherName(String publisherName) {
		this.publisherName = publisherName;
	}

}
