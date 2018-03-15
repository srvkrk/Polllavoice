package com.Polllavoice.config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.lavoice")
@Import({JDBCTransactionConfiguration.class})
public class AppConfig {
	@Bean
	public InternalResourceViewResolver resolver() {
	   InternalResourceViewResolver resolver = new InternalResourceViewResolver();
	   resolver.setViewClass(JstlView.class);
	   resolver.setPrefix("/WEB-INF/jsp/");
	   resolver.setSuffix(".jsp");
	   return resolver;
	}
}

