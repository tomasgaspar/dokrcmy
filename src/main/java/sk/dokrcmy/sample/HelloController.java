package sk.dokrcmy.sample;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Tomas.Gaspar on 02-Aug-16.
 */
@RestController
public class HelloController {


    /**
     * http://localhost:8888/hello?name=Tomas
     * or
     * http://localhost:8888/hello -> used default value
     * @param name
     * @return
     */
    @RequestMapping("/hello")
    public String greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return String.format("Hello %s", name);
    }
}
