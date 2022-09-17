package feign;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author wuqiao
 * Created on 2022-09-17
 */
@RequestMapping("/feign")
public interface DemoFeignInterface {
    @PostMapping("/demo/hello")
    DemoResponse demo(
            @RequestBody DemoRequest request
    );
}
