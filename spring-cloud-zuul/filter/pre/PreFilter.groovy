package pre

import com.netflix.zuul.ZuulFilter
import javax.servlet.http.HttpServletRequest
import com.netflix.zuul.context.RequestContext
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Description:
 * @version 1.0 2018/2/24 下午4:31 by zucker
 */
class PreFilter extends ZuulFilter {
    Logger log= LoggerFactory.getLogger(PreFilter.class)

    @Override
    String filterType() {
        return "pre"
    }

    @Override
    int filterOrder() {
        return 1000
    }

    @Override
    boolean shouldFilter() {
        return true
    }

    @Override
    Object run() {
        HttpServletRequest request = RequestContext.getCurrentContext().getRequest()
        log.info("this is a pre filter: Send{} request to{}",
                request.getMethod(), request.getRequestURL().toString())
        return null
    }
}
