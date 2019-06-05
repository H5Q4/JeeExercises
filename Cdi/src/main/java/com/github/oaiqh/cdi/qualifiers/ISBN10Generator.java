package com.github.oaiqh.cdi.qualifiers;


@ISBN @TenDigits
public class ISBN10Generator implements ISBNGenerator {
  public String generate() {
    return "8354329001";
  }
}
