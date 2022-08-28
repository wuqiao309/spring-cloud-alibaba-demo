package nacosconfig.test;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wuqiao
 * Created on 2022-08-28
 */

@RestController
@RequestMapping("/config")
@RefreshScope
public class ConfigController {

    @Value("${config.info}")
    private String info;

    @Value("${test}")
    private String test;

    /**
     * http://localhost:8080/config/get
     */
    @RequestMapping("/get")
    public String get() {
        return info + "///" + test;
    }
}
