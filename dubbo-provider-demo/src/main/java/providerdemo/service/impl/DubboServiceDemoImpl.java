package providerdemo.service.impl;

import org.apache.dubbo.config.annotation.DubboService;

import dubbo.sdk.DubboServiceDemo;

/**
 * @author wuqiao
 * Created on 2022-08-30
 */
@DubboService(
        stub = "dubbo.sdk.DubboServiceDemoStub" // 本地存根
)
public class DubboServiceDemoImpl implements DubboServiceDemo {
    @Override
    public String showMsg(String str) {
        return "hello:" + str;
    }
}
