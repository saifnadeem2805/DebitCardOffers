package com.bankoffer.cloud.debitcardserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Level;
import java.util.logging.Logger;

@SpringBootApplication
//@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class, DataSourceTransactionManagerAutoConfiguration.class, HibernateJpaAutoConfiguration.class})
@EnableJpaAuditing
@EnableEurekaClient
@RestController
public class DebitcardServerApplication {
    private static final Logger LOG = Logger.getLogger(DebitcardServerApplication.class.getName());

    public static void main(String[] args) {
        SpringApplication.run(DebitcardServerApplication.class, args);
    }

    @RequestMapping(value = "/")
    public String home() {
        LOG.log(Level.INFO, "Index API is calling");
        return "Eureka Client application";
    }

}
