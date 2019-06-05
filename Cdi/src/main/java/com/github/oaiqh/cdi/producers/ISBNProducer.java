package com.github.oaiqh.cdi.producers;

import javax.enterprise.inject.Produces;

public class ISBNProducer {
  @Produces
  @ThirteenDigits
  private int prefix = 978;

  @Produces
  @ThirteenDigits
  private String number = "3738695027";

  @Produces
  @Separator
  public String separator() {
    return "-";
  }
}
