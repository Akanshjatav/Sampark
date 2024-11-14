package com.Akansh.Sampark;

import com.Akansh.Sampark.Models.User;
import com.Akansh.Sampark.Models.UserType;
import com.Akansh.Sampark.Repository.UserDAO;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
@ComponentScan
public class SamparkApplication {

    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(SamparkApplication.class, args);

    }
    @Bean
    CommandLineRunner runner(UserDAO dao) {
        return args ->{
           User user = new User("fvbddfvb", UserType.NGO,"akanshjatav129@gmail.com", "cgjhjcgkjcgv","jvhjhv","dfbdsfb"  );
            dao.save(user);
        };
    }
}
