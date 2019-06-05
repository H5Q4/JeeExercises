package com.github.oaiqh.cdi.intro.loosecoupling;

import java.util.Date;

public class Book {
  private String title;
  private String isbn;
  private String description;
  private float price;
  private Date publishAt;

  @Override public String toString() {
    return "Book{" +
        "title='" + title + '\'' +
        ", isbn='" + isbn + '\'' +
        ", description='" + description + '\'' +
        ", price=" + price +
        ", publishAt=" + publishAt +
        '}';
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getIsbn() {
    return isbn;
  }

  public void setIsbn(String isbn) {
    this.isbn = isbn;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public float getPrice() {
    return price;
  }

  public void setPrice(float price) {
    this.price = price;
  }

  public Date getPublishAt() {
    return publishAt;
  }

  public void setPublishAt(Date publishAt) {
    this.publishAt = publishAt;
  }
}
