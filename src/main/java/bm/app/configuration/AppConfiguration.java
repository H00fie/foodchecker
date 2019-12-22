package bm.app.configuration;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("bm.app.repositories")
public class AppConfiguration {
}
