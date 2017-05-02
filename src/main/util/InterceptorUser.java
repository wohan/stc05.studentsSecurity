package main.util;
import org.apache.log4j.Logger;
import org.apache.log4j.spi.LoggerFactory;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by admin on 02.05.2017.
 */

public class InterceptorUser extends HandlerInterceptorAdapter {

    //private static final Logger logger = LoggerFactory.getLogger(InterceptorUser.class);

    @Override
    public boolean preHandle(HttpServletRequest request,
                             HttpServletResponse response, Object handler) throws Exception {

        //logger.info("Client User-Agent: " + request.getHeader("User-Agent"));

        //logger.info("Before handling the request");
        return super.preHandle(request, response, handler);
    }
}
