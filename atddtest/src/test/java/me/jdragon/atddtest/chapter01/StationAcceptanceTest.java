package me.jdragon.atddtest.chapter01;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.reactive.AutoConfigureWebTestClient;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.reactive.server.WebTestClient;


/**
 * @author choijaeyong on 2020/02/11.
 * @project atddtest
 * @description
 */
@SpringBootTest
@AutoConfigureWebTestClient
public class StationAcceptanceTest {
  @Autowired
  private WebTestClient webTestClient;

  @Test
  public void createStation() {

  }


}