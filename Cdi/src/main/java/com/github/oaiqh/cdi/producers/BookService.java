package com.github.oaiqh.cdi.producers;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.inject.Inject;

public class BookService {

  @Inject
  private ISBNGenerator isbnGenerator;

  @Inject
  private Logger logger;

  public Book createBook(String title) {
    Book book = new Book();
    book.setTitle(title);
    book.setIsbn(isbnGenerator.generate());
    logger.log(Level.INFO, book.toString());
    return book;
  }
}
