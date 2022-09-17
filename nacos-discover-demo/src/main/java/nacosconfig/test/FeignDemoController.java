package nacosconfig.test;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import feign.DemoFeignInterface;

/**
 * @author wuqiao
 * Created on 2022-09-17
 */
@RestController
@RequestMapping("/feign")
public class FeignDemoController implements DemoFeignInterface {
    @Override
    public String demo(Integer uid) {
        System.out.println(uid);
        return "hello:" + uid;
    }
}
