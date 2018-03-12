package zuul;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Description:
 *
 * @version 1.0 2018/2/24 下午3:50 by zucker
 */
@ConfigurationProperties("zuul.filter")
public class FilterConfiguration {
    private String root;
    private Integer interval;

    public String getRoot() {
        return root;
    }

    public void setRoot(String root) {
        this.root = root;
    }

    public Integer getInterval() {
        return interval;
    }

    public void setInterval(Integer interval) {
        this.interval = interval;
    }
}
