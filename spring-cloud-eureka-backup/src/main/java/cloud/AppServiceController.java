package cloud;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description:
 *
 * @version 1.0 17/11/27 下午2:16 by zucker
 */
@RestController
public class AppServiceController {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private DiscoveryClient client;

    @SuppressWarnings("deprecation")
    @RequestMapping("/hello/{user}")
    public String hello(@PathVariable("user") String user) {
        ServiceInstance info = client.getLocalServiceInstance();
        logger.info("/add, host:" + info.getHost() + ", port: " + info.getPort() + ", service_id:"
                + info.getServiceId() + ", user:" + user);
        return "Hello " + user;
    }
}
