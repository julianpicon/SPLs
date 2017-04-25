package co.com.itshirt.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.boot.web.servlet.ErrorPage;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "co.com.itshirt.repository")
@EntityScan(basePackages = "co.com.itshirt.domain")
public class Application {

	private static final String PATH = "/errors";
	
    public static void main(String[] args) throws Throwable {
        SpringApplication.run(Application.class, args);
    }
    
//    @Bean
//    public EmbeddedServletContainerCustomizer containerCustomizer() {
//    	System.err.println("eror pers ent.");
//      return (container -> {
//   	   //route all errors towards /error .
//   	   final ErrorPage errorPage=new ErrorPage(PATH);
//   	   container.addErrorPages(errorPage);
//      });
//    }
    
}