package wq.cdm.security.demo.user.model;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

/**
 * @author wuqiao
 * Created on 2022-09-13
 * TODO 更多用户信息
 */
public class MyUserDetail extends User {
    public MyUserDetail(String username, String password, Collection<? extends GrantedAuthority> authorities) {
        super(username, password, authorities);
    }
}
