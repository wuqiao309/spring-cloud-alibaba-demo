package feign;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author wuqiao
 * Created on 2022-09-17
 */
@RequestMapping("/feign")
public interface DemoFeignInterface {
    @PostMapping("/demo/hello")
    String demo(
            @RequestParam("uid") Integer uid
    );
}
