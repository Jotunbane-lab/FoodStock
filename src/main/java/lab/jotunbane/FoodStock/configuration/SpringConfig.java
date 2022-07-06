package lab.jotunbane.FoodStock.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@ComponentScan(basePackages = {"configuration", "services"})
@EnableJpaRepositories("repositories")
public class SpringConfig {
}
