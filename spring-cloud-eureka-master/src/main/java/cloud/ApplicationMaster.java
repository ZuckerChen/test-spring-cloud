package cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Description:
 *
 * @version 1.0 17/11/27 上午11:44 by zucker
 */
@EnableEurekaServer
@SpringBootApplication
public class ApplicationMaster {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationMaster.class, args);
    }
}
