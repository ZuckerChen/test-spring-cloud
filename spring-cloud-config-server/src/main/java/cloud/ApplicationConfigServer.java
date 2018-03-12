package cloud;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Description:
 *
 * @version 1.0 17/11/27 上午9:49 by zucker
 */
@SpringBootApplication
@EnableConfigServer
@EnableDiscoveryClient
public class ApplicationConfigServer {
    public static void main(String[] args) {
        new SpringApplicationBuilder(ApplicationConfigServer.class).web(true).run(args);
    }
}
