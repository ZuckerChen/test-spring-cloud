package client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Description:
 *
 * @version 1.0 17/11/27 上午9:45 by zucker
 */
@SpringBootApplication
@EnableEurekaClient
@RestController
//@EnableDiscoveryClient
public class EurekaClientAppication {

    @Bean
    @LoadBalanced
    RestTemplate restTemplate() {
        return new RestTemplate();
    }

    @Value("${eureka.server.name}")
    private String eurekaServer;

    @Autowired
    RestTemplate restTemplate;


    @RequestMapping(value = "/{user}")
    public String home(@PathVariable("user") String user) {
        return restTemplate.getForEntity("http://" +eurekaServer + "/ribbon/" + user, String.class).getBody();
    }

    public static void main(String[] args) {
        SpringApplication.run(EurekaClientAppication.class, args);
    }
}
