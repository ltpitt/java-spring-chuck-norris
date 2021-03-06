package it.davidenastri.javaspringchucknorris;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
// Added to enable XML configuration
@ImportResource("classpath:joke-config.xml")
public class JavaSpringChuckNorrisApplication {

    public static void main(String[] args) {
        SpringApplication.run(JavaSpringChuckNorrisApplication.class, args);
    }

}
