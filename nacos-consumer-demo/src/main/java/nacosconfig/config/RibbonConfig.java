package nacosconfig.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author wuqiao
 * Created on 2022-09-16
 */
@Configuration
public class RibbonConfig {
    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    // @Bean
    // public IRule ribbonRule() {
    //     // return new BestAvailableRule(); // 最少并发
    //     // return new RandomRule(); // 随机
    // }
}
