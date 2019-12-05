package orn.nure.julia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.EnableJms;

@SpringBootApplication
@EnableJms
public class JMSBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(JMSBootApplication.class, args);
    }

}