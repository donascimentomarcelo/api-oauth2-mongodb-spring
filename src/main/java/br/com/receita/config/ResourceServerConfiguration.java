package br.com.receita.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configurers.ResourceServerSecurityConfigurer;

@Configuration
@EnableResourceServer
public class ResourceServerConfiguration extends ResourceServerConfigurerAdapter{
	
	@Override
	public void configure(ResourceServerSecurityConfigurer configurer) {
		configurer.resourceId("restauthenticationvalue");
	}
	
	@Override
	public void configure(HttpSecurity httpSecurity) throws Exception {
		httpSecurity
			.logout()
			.invalidateHttpSession(true)
			.clearAuthentication(true)
			.and().authorizeRequests()
			.antMatchers("/api/**").hasAnyRole("ADMIN")
			.anyRequest().denyAll();
			
	}
}
