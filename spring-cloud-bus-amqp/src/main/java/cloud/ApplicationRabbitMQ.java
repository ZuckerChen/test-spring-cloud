package cloud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description:
 *
 * @version 1.0 17/11/27 下午5:27 by zucker
 */
@SpringBootApplication
@RestController
public class ApplicationRabbitMQ {

    @Autowired
    Producer producer;

    @RequestMapping("/")
    public String home() {
        producer.send();
        return "Hello World";
    }

    public static void main(String[] args) {
        SpringApplication.run(ApplicationRabbitMQ.class, args);
    }

}