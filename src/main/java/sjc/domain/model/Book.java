package sjc.domain.model;

import java.math.BigDecimal;

public class Book {
	private Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Genre getGenre() {
		return genre;
	}

	public void setGenre(Genre genre) {
		this.genre = genre;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public Author getAutor() {
		return autor;
	}

	public void setAutor(Author autor) {
		this.autor = autor;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public boolean isNewOrNot() {
		return newOrNot;
	}

	public void setNewOrNot(boolean newOrNot) {
		this.newOrNot = newOrNot;
	}

	public Feedback getFeedback() {
		return feedback;
	}

	public void setFeedback(Feedback feedback) {
		this.feedback = feedback;
	}

	public Rating getRating() {
		return rating;
	}

	public void setRating(Rating rating) {
		this.rating = rating;
	}

	public Publisher getPublisher() {
		return publisher;
	}

	public void setPublisher(Publisher publisher) {
		this.publisher = publisher;
	}

	private Genre genre;
	private String bookName;
	private Author autor;
	private Integer year;
	private BigDecimal price;
	private boolean newOrNot;
	private Feedback feedback;
	private Rating rating;
	private Publisher publisher;

}
