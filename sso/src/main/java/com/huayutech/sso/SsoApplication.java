package com.huayutech.sso;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.Collections;
import java.util.Map;

@SpringBootApplication
public class SsoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SsoApplication.class, args);
    }


    @Component
    @EnableOAuth2Sso
    public static class SecurityConfigurer extends WebSecurityConfigurerAdapter {
        @Override
        public void configure(HttpSecurity http) throws Exception {
            http.antMatcher("/dashboard/**").authorizeRequests().anyRequest()
                    .authenticated().and().csrf().disable()
                    .logout().logoutUrl("/dashboard/logout").permitAll()
                    .logoutSuccessUrl("/");
        }
    }

    @RestController
    @RequestMapping("/dashboard")
    public static class HomeController {
        @RequestMapping("/message")
        public Map<String, Object> dashboard() {
            return Collections.<String, Object> singletonMap("message", "Yay!");
        }

        @RequestMapping("/user")
        public Principal user(Principal user) {
            return user;
        }
    }
}
