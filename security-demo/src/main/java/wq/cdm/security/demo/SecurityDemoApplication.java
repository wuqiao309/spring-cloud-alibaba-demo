package wq.cdm.security.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * ## 授权码模式
 * 1. 请求授权码： http://localhost:8080/oauth/authorize?response_type=code&client_id=client&redirect_uri=http://www.baidu.com&scope=all
 * 2. PostMan请求token：
        curl --location --request POST 'http://localhost:8080/oauth/token' \
            --header 'Authorization: Basic Y2xpZW50OjEyMzEyMw==' \
            --header 'Content-Type: application/x-www-form-urlencoded' \
            --data-urlencode 'grant_type=authorization_code' \
            --data-urlencode 'code=XH11vq' \
            --data-urlencode 'redirect_uri=http://www.baidu.com'
 * 3. 请求用户信息
        http://localhost:8080/user/getCurrentUser?access_token=c4f4e559-b517-4245-88aa-64424e9b4317
        或者
        curl --location --request GET 'http://localhost:8080/user/getCurrentUser' \
            --header 'Authorization: Bearer c4f4e559-b517-4245-88aa-64424e9b4317'


 * ## 简化模式
 *      http://localhost:8080/oauth/authorize?client_id=client&response_type=token&scope=all&redirect_uri=http://www.baidu.com
 *      授权后，token携带在重定向url请求参数中
 *      https://www.baidu.com/#access_token=6039e327-a35f-4026-8a9d-67e09526e5b5&token_type=bearer&expires_in=3599
 *
 * ## 账号密码模式
     http://localhost:8080/oauth/token?username=admin&password=1234&grant_type=password&client_id=client&client_secret=123123&scope=all
 *
 * ## 客户端模式
 *      http://localhost:8080/oauth/token?grant_type=client_credentials&scope=all&client_id=client&client_secret=123123
 *
 *
 * ## 更新token
 *      http://localhost:8080/oauth/token?grant_type=refresh_token&client_id=client&client_secret=123123&refresh_token=dc03bdc2-ca3b-4690-9265-d31a21896d02
 */
@SpringBootApplication
public class SecurityDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SecurityDemoApplication.class, args);
    }

}
