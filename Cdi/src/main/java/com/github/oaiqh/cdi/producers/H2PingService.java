package com.github.oaiqh.cdi.producers;

import java.sql.Connection;
import java.sql.SQLException;
import javax.inject.Inject;

public class H2PingService {
  @Inject private Connection connection;

  public void ping() throws SQLException {
    connection.createStatement().executeQuery("select 1");
  }
}
