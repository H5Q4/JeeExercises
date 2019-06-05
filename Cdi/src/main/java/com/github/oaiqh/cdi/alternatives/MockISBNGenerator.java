package com.github.oaiqh.cdi.alternatives;

import javax.enterprise.inject.Alternative;

@Alternative
public class MockISBNGenerator implements ISBNGenerator {
  public String generate() {
    return "Mock: 9861230988345";
  }
}
