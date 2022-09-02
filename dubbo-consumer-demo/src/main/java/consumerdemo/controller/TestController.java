package consumerdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.csp.sentinel.annotation.SentinelResource;

import consumerdemo.sentinel.SentinelProcessor;
import consumerdemo.service.TestService;

/**
 * @author wuqiao
 * Created on 2022-08-30
 */
@RestController
public class TestController {
    @Autowired
    private TestService testService;

    @GetMapping({"/hello/{str}", "/show/{str}"})
    @SentinelResource(value = "showMsg",
            fallback = "fallback", fallbackClass = SentinelProcessor.class,
            blockHandler = "handleException", blockHandlerClass = SentinelProcessor.class)
    public String showMsg(@PathVariable("str") String str) {
        if ("0".equals(str)) {
            int i = 1 / 0;
        }
        return testService.showMsg(str);
    }
}
