package consumerdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import consumerdemo.service.TestService;

/**
 * @author wuqiao
 * Created on 2022-08-30
 */
@RestController
public class TestController {
    @Autowired
    private TestService testService;

    @GetMapping("/hello/{str}")
    public String showMsg(@PathVariable("str") String str) {
        return testService.showMsg(str);
    }
}
