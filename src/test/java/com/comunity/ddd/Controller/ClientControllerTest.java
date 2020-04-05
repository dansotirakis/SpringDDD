package com.comunity.ddd.Controller;

import com.comunity.ddd.DddApplicationTests;
import org.junit.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

public class ClientControllerTest extends DddApplicationTests {

  private MockMvc mockMvc;

  @Autowired
  private ClientController clientController;

//  @Before
//  public void setUp(){
//    this.mockMvc = MockMvcBuilders.standaloneSetup(clientController).build();
//  }
}
