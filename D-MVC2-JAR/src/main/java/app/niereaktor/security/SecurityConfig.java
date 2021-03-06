package app.niereaktor.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	
	@Override
	protected void configure (HttpSecurity http) throws Exception {
		http
			.authorizeRequests()
				.antMatchers("/").permitAll()
				.antMatchers("/contact").permitAll()
				.antMatchers("/success").permitAll()
				.antMatchers("/registerForm").permitAll()
				.antMatchers("/saveRegister").permitAll()
				.antMatchers("/errorPage").permitAll()
				.antMatchers("/add").permitAll()
				.antMatchers("/blog").permitAll()
				.anyRequest().authenticated()
			.and()
				.formLogin()
				.loginPage("/loginForm").permitAll()
				.loginProcessingUrl("/processLogin").permitAll()
			.and()
				.logout().logoutUrl("/").logoutSuccessUrl("/").permitAll();
	}
	
}
