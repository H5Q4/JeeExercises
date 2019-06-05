package com.github.oaiqh.cdi.alternatives;

import javax.inject.Inject;

public class BookService {

  @Inject
  private ISBNGenerator isbnGenerator;

  public Book createBook(String title) {
    Book book = new Book();
    book.setIsbn(isbnGenerator.generate());
    return book;
  }
}
