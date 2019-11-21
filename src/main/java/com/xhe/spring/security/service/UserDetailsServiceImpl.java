package com.xhe.spring.security.service;

import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * @Auther: xhe
 * @Date: 2019/11/12 14:50
 * @Description:
 */
@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        UserPrincipal user = new UserPrincipal();
//        user.setId(100L);
//        user.setAuthorities(AuthorityUtils.commaSeparatedStringToAuthorityList("admin"));
//        user.setPassword("{bcrypt}$2a$10$IVzj1Wd.ZQdOIWdb1htQjexU94uoNeuk1crlQ9ExVupPi0Iy1uv.C");
//        user.setUsername("admin");
        return new User("admin","{bcrypt}$2a$10$IVzj1Wd.ZQdOIWdb1htQjexU94uoNeuk1crlQ9ExVupPi0Iy1uv.C", AuthorityUtils.commaSeparatedStringToAuthorityList("admin"));
        //return user;
    }
}
