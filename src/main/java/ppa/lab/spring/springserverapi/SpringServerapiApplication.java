package ppa.lab.spring.springserverapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Import;
import ppa.lab.spring.springserverapi.configuration.AppConfig;

@SpringBootApplication
@EntityScan(basePackages = {"ppa.spring.domain.bean"})
@Import({ AppConfig.class })
public class SpringServerapiApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringServerapiApplication.class, args);
    }

}
