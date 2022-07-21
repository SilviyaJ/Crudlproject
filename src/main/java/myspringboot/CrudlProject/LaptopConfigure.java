package myspringboot.CrudlProject;

import java.util.Collection;
import java.util.stream.Stream;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class LaptopConfigure { 
	
	@Bean
	public InMemoryUserDetailsManager praba() {
		UserDetails myUser1=User.withDefaultPasswordEncoder().username("jessy").password("black").roles("ADMIN").build();
		UserDetails myUser2=User.withDefaultPasswordEncoder().username("karan").password("brown").roles("ADMIN").build();
		
		Collection<UserDetails> myusers=Stream.of(myUser1,myUser2).toList();
		return new InMemoryUserDetailsManager(myusers);
		
	}
	
	
	@Bean
	public SecurityFilterChain sil(HttpSecurity hp) throws Exception {
		hp.authorizeRequests().anyRequest().authenticated();
		hp.csrf().disable();
		hp.httpBasic();
		hp.formLogin();
		return hp.build();
		
	}

}
