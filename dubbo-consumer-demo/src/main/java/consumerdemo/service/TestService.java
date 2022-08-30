package consumerdemo.service;

import org.apache.dubbo.common.constants.ClusterRules;
import org.apache.dubbo.common.constants.LoadbalanceRules;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Service;

import dubbo.sdk.DubboServiceDemo;

/**
 * @author wuqiao
 * Created on 2022-08-30
 */
@Service
public class TestService {
    @DubboReference(
            loadbalance = LoadbalanceRules.RANDOM, // 负载均衡
            cluster = ClusterRules.FAIL_OVER, // 服务容错
            retries = 2, // 失败重试次数
            timeout = 1000, // 超时时间。
            mock = "return ok", // 降级、mock
            async = false // 异步调用
    )
    private DubboServiceDemo dubboServiceDemo;

    public String showMsg(String str) {
        return dubboServiceDemo.showMsg(str);
    }
}
