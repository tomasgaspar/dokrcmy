package sk.dokrcmy.sample;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.TestRestTemplate;
import org.springframework.boot.test.WebIntegrationTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by Tomas.Gaspar on 02-Aug-16.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
@WebIntegrationTest
public class PersonControllertIntegrationTest {

    private RestTemplate restTemplate = new TestRestTemplate();

    @Test
    public void getPerson() {
        Map<String, String> response = restTemplate.getForObject("http://localhost:8989/testPerson/1", Map.class);

        assertNotNull(response);

        String firstName =  response.get("firstName").toString();
        String lastName =  response.get("lastName").toString();
        String id =  response.get("id").toString();
        assertEquals("Tomas", firstName);
        assertEquals("Gaspar", lastName);
        assertEquals("1", id);

        response = restTemplate.getForObject("http://localhost:8989/testPerson/2", Map.class);

        firstName =  response.get("firstName");
        lastName =  response.get("lastName").toString();
        id =  response.get("id").toString();
        assertEquals("Michal", firstName);
        assertEquals("Grom", lastName);
        assertEquals("2", id);
    }
}
