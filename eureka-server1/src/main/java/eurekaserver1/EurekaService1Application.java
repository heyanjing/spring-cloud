package eurekaserver1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by heyanjing on 2017/6/24 15:36.
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaService1Application {
    public static void main(String[] args) {
        SpringApplication.run(EurekaService1Application.class, args);
    }
}
