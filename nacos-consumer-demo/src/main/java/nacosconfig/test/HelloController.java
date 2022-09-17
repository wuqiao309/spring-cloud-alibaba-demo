package nacosconfig.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import feign.DemoRequest;
import feign.DemoResponse;
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

    @PostMapping("/feign/demo/hello")
    public DemoResponse hello2() {
        DemoRequest demoRequest = new DemoRequest();
        demoRequest.setUid(123123123);
        return demoClient.demo(demoRequest);
    }


    @RequestMapping("/hello")
    public String hello() {
        return "hello-consumer -> " + restTemplate.getForObject("http://nacos-discover-demo/hello", String.class);
    }
}
