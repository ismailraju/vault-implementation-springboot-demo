package com.raju.vaultimpmlementaiondemo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

//@ConfigurationProperties(prefix = "com.raju")
@Data
@AllArgsConstructor
@NoArgsConstructor
//@Configuration
public class Creds {
    //    @Value("${com.raju.username}")
    String username;
}
