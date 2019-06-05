package com.github.oaiqh.cdi.qualifiers;

@ISBN(type = ISBN.Type.THIRTEEN)
public class ISBN13Generator implements ISBNGenerator {
  public String generate() {
    return "8691234552897";
  }
}
