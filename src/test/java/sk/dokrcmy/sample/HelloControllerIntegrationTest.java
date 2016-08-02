package sk.dokrcmy.sample;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.TestRestTemplate;
import org.springframework.boot.test.WebIntegrationTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.client.RestTemplate;

import static org.junit.Assert.assertEquals;

/**
 * Created by Tomas.Gaspar on 02-Aug-16.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
@WebIntegrationTest
public class HelloControllerIntegrationTest {

    private RestTemplate restTemplate = new TestRestTemplate();

    @Test
    public void hello() {
        String response = restTemplate.getForObject("http://localhost:8989/hello", String.class);
        assertEquals("Hello World", response);

        response = restTemplate.getForObject("http://localhost:8989/hello?name=Tomas", String.class);
        assertEquals("Hello Tomas", response);
    }
}
