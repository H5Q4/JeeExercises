package com.github.oaiqh.cdi.intro.tightcoupling;

public class BookService {
  private ISBNGenerator isbnGenerator;

  public BookService(ISBNGenerator isbnGenerator) {
    this.isbnGenerator = isbnGenerator;
  }

  public Book createBook(String title) {
    Book book = new Book();
    book.setIsbn(isbnGenerator.generate());
    return book;
  }
}
