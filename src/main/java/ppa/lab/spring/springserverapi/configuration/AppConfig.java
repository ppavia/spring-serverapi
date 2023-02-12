package ppa.lab.spring.springserverapi.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import ppa.spring.domain.bean.SimplePerson;

@Configuration
@EnableJpaRepositories({"ppa.lab.spring.springserverapi.model.repository"})
@Import({ SimplePerson.class
        , DatasourceProxyConfig.class})
@ComponentScan(basePackages = {
        "ppa.lab.spring.springserverapi.model.repository"
        , "ppa.lab.spring.springserverapi.service"
        , "ppa.spring.domain.bean"
})
public class AppConfig {
}
