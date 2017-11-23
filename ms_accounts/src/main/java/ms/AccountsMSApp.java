package ms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


//@EnableAutoConfiguration
@EnableDiscoveryClient
@SpringBootApplication
public class AccountsMSApp {
    public static void main(String[] args) {
        // Tell Boot to look for accounts-ms.yml
        System.setProperty("spring.config.name", "accounts-ms");
        SpringApplication.run(AccountsMSApp.class, args);
    }
}
