package nacosconfig.test;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wuqiao
 * Created on 2022-08-28
 */

@RestController
@RequestMapping
public class HelloController {


    @RequestMapping("/hello")
    public String hello() {
        return "hello-discover";
    }
}
