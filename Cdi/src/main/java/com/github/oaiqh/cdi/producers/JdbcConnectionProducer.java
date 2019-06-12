package com.github.oaiqh.cdi.producers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.enterprise.inject.Disposes;
import javax.enterprise.inject.Produces;

public class JdbcConnectionProducer {
  @Produces
  private Connection createConnection() {
    Connection connection = null;
    try {
      Class.forName("org.h2.Driver");
      connection = DriverManager.getConnection("jdbc:h2:mem:test_mem", "sa", "");
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    } catch (SQLException e) {
      e.printStackTrace();
    }
    return connection;
  }

  private void closeConnection(@Disposes Connection connection) throws SQLException {
    connection.close();
    System.out.println("Connection closed!");
  }
}
