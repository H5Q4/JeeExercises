package com.github.oaiqh.cdi.producers;

import java.sql.SQLException;
import javax.enterprise.inject.se.SeContainer;
import javax.enterprise.inject.se.SeContainerInitializer;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class H2PingServiceTest {

  private SeContainer container;

  @BeforeEach
  void setUp() {
    container = SeContainerInitializer.newInstance().initialize();
  }

  @AfterEach
  void tearDown() {
    container.close();
  }

  @Test
  void ping() throws SQLException {
    H2PingService h2PingService = container.select(H2PingService.class).get();
    h2PingService.ping();
  }
}