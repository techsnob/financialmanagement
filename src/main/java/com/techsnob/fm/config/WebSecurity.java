/*package com.techsnob.fm.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableWebSecurity
public class WebSecurity extends WebSecurityConfigurerAdapter {
    @Autowired
    UserRepository userRepository;
    
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
        .authorizeRequests()
        .antMatchers("/").access("hasRole(ADMIN)")
        .antMatchers("/**").permitAll()
        .and()
        .formLogin()
        .loginPage("/login")
        .failureUrl("/login?error=true");
  }
        @Override
       protected void configure(
          AuthenticationManagerBuilder auth) throws Exception {
     auth
       .userDetailsService(new UserDetailsService() {
       @Override
       public UserDetails loadUserByUsername(String username)
                  throws UsernameNotFoundException {
           return userRepository.findUserName(username);
       }
    });
  }
}
*/