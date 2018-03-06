package cn.demo.reverseProxy;

import cn.demo.reverseProxy.filter.AccessPasswordFilter;
import cn.demo.reverseProxy.filter.AccessUserNameFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

/**
 * @Author: Leo
 * @Blog: http://blog.csdn.net/lc0817
 * @CreateTime: 2016/11/22 21:32
 * @Description:
 */
@SpringBootApplication
@EnableZuulProxy
@EnableEurekaClient
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public AccessUserNameFilter accessUserNameFilter() {
        return new AccessUserNameFilter();
    }

    @Bean
    public AccessPasswordFilter accessPasswordFilter() {
        return new AccessPasswordFilter();
    }

    //@Bean
    //public AccessTokenFilter accessTokenFilter() {
    //    return new AccessTokenFilter();
    //}
}
