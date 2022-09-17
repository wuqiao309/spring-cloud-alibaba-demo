package nacosconfig.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import nacosconfig.feign.DemoClient;

/**
 * @author wuqiao
 * Created on 2022-08-28
 */

@RestController
@RequestMapping
public class HelloController {
    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private DemoClient demoClient;

    @RequestMapping("/feign/demo/hello")
    public String hello2() {
        return demoClient.demo(1232312);
    }


    @RequestMapping("/hello")
    public String hello() {
        return "hello-consumer -> " + restTemplate.getForObject("http://nacos-discover-demo/hello", String.class);
    }
}
