package sk.dokrcmy.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by Tomas.Gaspar on 02-Aug-16.
 */
@SpringBootApplication
public class Application {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(new Object[] { Application.class }, args);
    }
}
