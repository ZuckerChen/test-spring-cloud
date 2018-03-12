package client;

import com.netflix.appinfo.ApplicationInfoManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
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
    private final Logger logger = Logger.getLogger(getClass());

    @Autowired
    private DiscoveryClient client;

//    @Bean
//    @LoadBalanced
//    RestTemplate restTemplate() {
//        return new RestTemplate();
//    }
//
//    @Value("${eureka.server.name}")
//    private String eurekaServer;
//
//    @Autowired
//    RestTemplate restTemplate;
//
//
//    @RequestMapping(value = "/{user}")
//    public String home(@PathVariable("user") String user) {
//        return restTemplate.getForEntity("http://" +eurekaServer + "/ribbon/" + user, String.class).getBody();
//    }

    @RequestMapping("/hello")
    public String hello() {
        ServiceInstance instance = client.getLocalServiceInstance();

        logger.info("/hello, host:" + instance.getHost() + "， service id:" + instance.getServiceId());
        return "rep: hello!";
    }

    public static void main(String[] args) {
        SpringApplication.run(EurekaClientAppication.class, args);
    }
}
