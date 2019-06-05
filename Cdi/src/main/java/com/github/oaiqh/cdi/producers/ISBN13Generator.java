package com.github.oaiqh.cdi.producers;

import javax.inject.Inject;

public class ISBN13Generator implements ISBNGenerator {

  @Inject @ThirteenDigits
  private int prefix;

  @Inject @ThirteenDigits
  private String number;

  @Inject @Separator
  private String separator;

  public String generate() {
    return String.format("%d%s%s", prefix, separator, number);
  }
}
