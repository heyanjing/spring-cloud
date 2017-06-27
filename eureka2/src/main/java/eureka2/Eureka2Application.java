package eureka2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Created by heyanjing on 2017/6/24 15:52.
 */
@SpringBootApplication
//@EnableEurekaClient
@EnableDiscoveryClient
public class Eureka2Application {

    public static void main(String[] args) {
        SpringApplication.run(Eureka2Application.class, args);
        //new SpringApplicationBuilder(Service1Application.class).web(true).run(args);
    }

}
