package com.github.oaiqh.cdi.alternatives;

import javax.enterprise.inject.se.SeContainer;
import javax.enterprise.inject.se.SeContainerInitializer;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookServiceTest {

  SeContainer container;

  @BeforeEach
  void setUp() {
    container = SeContainerInitializer.newInstance().initialize();
  }

  @AfterEach
  void tearDown() {
    container.close();
  }

  @Test
  void shouldCheckIsbn13() {
    BookService bookService = container.select(BookService.class).get();
    Book book = bookService.createBook("Beginning Java EE 8");
    assertEquals(13, book.getIsbn().length());
  }

  @Test
  void shouldCheckMock() {
    BookService bookService = container.select(BookService.class).get();
    Book book = bookService.createBook("Beginning Java EE 8");
    assertTrue(book.getIsbn().startsWith("Mock"));
  }
}