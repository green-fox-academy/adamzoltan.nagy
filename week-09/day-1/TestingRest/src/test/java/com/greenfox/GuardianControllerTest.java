package com.greenfox;

import com.greenfox.Controller.GuardianController;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup;

import java.nio.charset.Charset;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
/**
 * Created by Adam on 2017. 05. 15..
 */

@RunWith(SpringRunner.class)
@SpringBootTest(classes = GuardianController.class)
@WebAppConfiguration
@EnableWebMvc
public class GuardianControllerTest {


  private MediaType contentType = new MediaType(MediaType.APPLICATION_JSON.getType(),
          MediaType.APPLICATION_JSON.getSubtype(),
          Charset.forName("utf8"));

  private MockMvc mockMvc;

  @Autowired
  private WebApplicationContext webApplicationContext;

  @Before
  public void setup() throws Exception {
    this.mockMvc = webAppContextSetup(webApplicationContext).build();
  }

  @Test
  public void GrootSuccessfullTest() throws Exception {
    mockMvc.perform(get("/groot")
            .param("message", "somemessage")
            .contentType(MediaType.APPLICATION_JSON))
            .andExpect(status().isOk())
            .andExpect(content().contentType(contentType))
            .andExpect(content().json("{\"recieved\": \"somemessage\", \"translated\": \"I am Groot!\"}", true));

  }

  @Test
  public void GrootFailTest() throws Exception {
    mockMvc.perform(get("/groot")
            .contentType(MediaType.APPLICATION_JSON))
            .andExpect(status().is4xxClientError())
            .andExpect(content().contentType(contentType))
            .andExpect(content()
                    .json("{\"message\": \"I am Groot!\"}", true));
  }

  @Test
  public void YonduSuccessfullTest() throws Exception {
    mockMvc.perform(get("/yondu?distance=100.0&time=10.0")
            .contentType(MediaType.APPLICATION_JSON))
            .andExpect(status().isOk())
            .andExpect(content().contentType(contentType))
            .andExpect(content().json("{\"distance\": \"100.0\", \"time\": \"10.0\",\"speed\": \"10.0\" }", true));

  }

  @Test
  public void YondutFailTest() throws Exception {
    mockMvc.perform(get("/groot")
            .contentType(MediaType.APPLICATION_JSON))
            .andExpect(status().is4xxClientError())
            .andExpect(content().contentType(contentType))
            .andExpect(content()
                    .json("{\"message\": \"I am Groot!\"}", true));
  }

}
