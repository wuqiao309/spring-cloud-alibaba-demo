package nacosconfig.test;

import org.springframework.web.bind.annotation.RestController;

import feign.DemoFeignInterface;
import feign.DemoRequest;
import feign.DemoResponse;

/**
 * @author wuqiao
 * Created on 2022-09-17
 */
@RestController
public class FeignDemoController implements DemoFeignInterface {
    @Override
    public DemoResponse demo(DemoRequest request) {
        System.out.println(request);
        DemoResponse demoResponse = new DemoResponse();
        demoResponse.setMsg("hello:" + request.getUid());
        return demoResponse;
    }
}
