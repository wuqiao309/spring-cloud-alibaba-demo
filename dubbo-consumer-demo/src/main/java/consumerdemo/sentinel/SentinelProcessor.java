package consumerdemo.sentinel;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.alibaba.csp.sentinel.slots.block.authority.AuthorityException;
import com.alibaba.csp.sentinel.slots.block.degrade.DegradeException;
import com.alibaba.csp.sentinel.slots.block.flow.FlowException;
import com.alibaba.csp.sentinel.slots.block.flow.param.ParamFlowException;
import com.alibaba.csp.sentinel.slots.system.SystemBlockException;

/**
 * @author wuqiao
 * Created on 2022-09-01
 */
public class SentinelProcessor {
    /**
     * 参数列表需要和原函数一致，可以多一个异常参数
     * 返回值类型也要和原函数一致
     * 默认是@SentinelResource注解中方法，选择其他类中的要是static的
     */
    public static String fallback(String str, Throwable e) {
        return "===被异常降级啦===";
    }

    /**
     * 参数列表需要和原函数一致，可以多一个异常参数
     * 返回值类型也要和原函数一致
     * 默认是@SentinelResource注解中方法，选择其他类中的要是static的
     */
    public static String handleException(String str, BlockException e) {
        String error = null;
        if (e instanceof FlowException) {
            error = "接口限流了";

        } else if (e instanceof DegradeException) {
            error = "服务降级了";

        } else if (e instanceof ParamFlowException) {
            error = "热点参数限流了";

        } else if (e instanceof SystemBlockException) {
            error = "触发系统保护规则了";

        } else if (e instanceof AuthorityException) {
            error = "授权规则不通过";
        }
        return "===被限流啦===";
    }
}
