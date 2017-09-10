package app.niereaktor.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

//nazwa bowiązkowa dla security
@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter{

	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		//nieuwierzytelnione dla poniżsych URL ("/")
		http.authorizeRequests()
			.antMatchers("/").permitAll()
				
		//uwierzytelnienie dla każdego innego adresu URL
			.anyRequest().authenticated()
		//korzystanie z dostępnego formularza logowania	
			.and().formLogin().loginPage("/loginForm")
		//skierowanie na action z formularza	
			.loginProcessingUrl("/processLogin").permitAll()
		//wylogowywanie i przekierowanie na home
			.and().logout().logoutUrl("/Logout").logoutSuccessUrl("/");
		
	}
	
}
