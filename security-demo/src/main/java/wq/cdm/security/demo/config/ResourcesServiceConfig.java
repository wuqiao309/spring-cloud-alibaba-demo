package wq.cdm.security.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configurers.ResourceServerSecurityConfigurer;
import org.springframework.security.oauth2.provider.token.RemoteTokenServices;

/**
 * 配置资源服务器
 * @author wuqiao
 * Created on 2022-09-10
 */
@Configuration
@EnableResourceServer
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class ResourcesServiceConfig extends ResourceServerConfigurerAdapter {
    // @Override
    // public void configure(HttpSecurity http) throws Exception {
    //     http.authorizeRequests().anyRequest().authenticated()
    //             .and().requestMatchers().antMatchers("/user/**");
    // }

    @Bean
    public RemoteTokenServices tokenService() {
        RemoteTokenServices tokenService = new RemoteTokenServices();
        tokenService.setClientId("client");
        tokenService.setClientSecret("123123");
        tokenService.setCheckTokenEndpointUrl("http://localhost:8080/oauth/check_token");
        return tokenService;
    }
    @Override
    public void configure(ResourceServerSecurityConfigurer resources) throws Exception {
        resources.tokenServices(tokenService());
    }
}