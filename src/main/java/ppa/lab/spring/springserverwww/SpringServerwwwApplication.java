package ppa.lab.spring.springserverwww;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Import;
import ppa.lab.spring.springserverwww.configuration.AppConfig;
import ppa.spring.domain.bean.SimplePerson;

@SpringBootApplication
@EntityScan(basePackages = {"ppa.spring.domain.bean"})
@Import({ AppConfig.class })
public class SpringServerwwwApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringServerwwwApplication.class, args);
    }

}
