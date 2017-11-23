package ms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

//http://localhost:1111/eureka/apps
//Eureka
@SpringBootApplication
@EnableEurekaServer
public class ServiceRegistrationApp {
    public static void main(String[] args) {
        // Tell Boot to look for service-discovery.yml
        System.setProperty("spring.config.name", "service-registration");
        SpringApplication.run(ServiceRegistrationApp.class, args);
    }
}
