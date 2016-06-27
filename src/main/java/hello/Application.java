package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    // try to visit
    // http://localhost:8080/greeting
    // and
    // http://localhost:8080/greeting?name=User
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
