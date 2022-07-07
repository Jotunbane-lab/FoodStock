package lab.jotunbane.FoodStock.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.LocalEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

import javax.sql.DataSource;

@Configuration
@ComponentScan(basePackages = {"lab.jotunbane.FoodStock.configuration", "lab.jotunbane.FoodStock.service"})
@EnableJpaRepositories("lab.jotunbane.FoodStock.repository")
public class SpringConfig {
//    @Bean
//    public DataSource getDataSource(){
//        DriverManagerDataSource dataSource = new DriverManagerDataSource();
//        dataSource.setDriverClassName("org.postgresql.Driver");
//        dataSource.setUrl("jdbc:postgresql://localhost:5432/Foodstock");
//        dataSource.setUsername("postgres");
//        dataSource.setPassword("IT123");
//
//        return dataSource;
//    }
//
//    @Bean
//    public LocalContainerEntityManagerFactoryBean entityManagerFactory(){
//        LocalContainerEntityManagerFactoryBean entityManager = new LocalContainerEntityManagerFactoryBean();
//        entityManager.setDataSource(getDataSource());
//        entityManager.setJpaVendorAdapter(new HibernateJpaVendorAdapter());
//        entityManager.setPackagesToScan("lab.jotunbane.FoodStock.model");
//
//        return entityManager;
//    }
}
