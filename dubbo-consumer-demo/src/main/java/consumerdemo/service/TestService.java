package consumerdemo.service;

import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Service;

import dubbo.sdk.DubboServiceDemo;

/**
 * @author wuqiao
 * Created on 2022-08-30
 */
@Service
public class TestService {
    @DubboReference
    private DubboServiceDemo dubboServiceDemo;

    public String showMsg(String str) {
        return dubboServiceDemo.showMsg(str);
    }
}
