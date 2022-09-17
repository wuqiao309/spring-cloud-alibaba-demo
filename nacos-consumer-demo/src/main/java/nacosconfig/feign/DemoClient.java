package nacosconfig.feign;

import org.springframework.cloud.openfeign.FeignClient;

import feign.DemoFeignInterface;

/**
 * @author wuqiao
 * Created on 2022-09-17
 */
@FeignClient(name = "nacos-discover-demo", path = "/feign")
public interface DemoClient extends DemoFeignInterface {
}
