package sk.dokrcmy.sample;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by Tomas.Gaspar on 02-Aug-16.
 */

@RestController
@RequestMapping("/testPerson")
public class PersonController {

    /**
     * http://localhost:8888/testPerson/1
     *
     * @param personId
     * @return
     */
    @RequestMapping(method = RequestMethod.GET, value = "/{personId}")
    public Map<String, String> getPerson(@PathVariable("personId") Integer personId) {

        Map<String, String> response = new LinkedHashMap<String, String>();
        if (personId == 1) {
            response.put("id", "1");
            response.put("firstName", "Tomas");
            response.put("lastName", "Gaspar");
        } else if (personId == 2) {
            response.put("id", "2");
            response.put("firstName", "Michal");
            response.put("lastName", "Grom");
        } else {
            response = null;
        }
        return response;
    }




}
