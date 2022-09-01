package dubbo.sdk;


import lombok.extern.slf4j.Slf4j;

/**
 * @author wuqiao
 * Created on 2022-08-30
 */
@Slf4j
public class DubboServiceDemoStub implements DubboServiceDemo {
    private DubboServiceDemo dubboServiceDemo;

    public DubboServiceDemoStub(DubboServiceDemo dubboServiceDemo) {
        this.dubboServiceDemo = dubboServiceDemo;
    }

    @Override
    public String showMsg(String str) {
        log.info("param:{}", str);
        return dubboServiceDemo.showMsg(str);
    }
}
