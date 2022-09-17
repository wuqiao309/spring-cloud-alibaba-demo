package nacosconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClients;

import nacosconfig.config.LoadBalancerConfig;

@SpringBootApplication
@LoadBalancerClients(
        @LoadBalancerClient(name = "nacos-discover-demo", configuration = LoadBalancerConfig.class)
)
public class NacosLoadBalancerConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(NacosLoadBalancerConsumerApplication.class, args);
    }

}
