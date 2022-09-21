package com.raju.vaultimpmlementaiondemo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@Slf4j
//@EnableConfigurationProperties(Creds.class)
public class VaultImplementationDemoApplication implements CommandLineRunner {

//    @Autowired
    Creds creds;


    @Value("${com.raju.password}")
    String ps;
    public static void main(String[] args) {
        SpringApplication.run(VaultImplementationDemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

//        log.info("======user: {}", creds.username);
        log.info("======pass: {}", ps);

    }
}
