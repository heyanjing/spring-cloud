package eureka1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Created by heyanjing on 2017/6/24 15:52.
 */
@SpringBootApplication
//@EnableEurekaClient
//@RestController
@EnableDiscoveryClient
public class Eureka1Application {

    public static void main(String[] args) {
        SpringApplication.run(Eureka1Application.class,args);
        //new SpringApplicationBuilder(Service1Application.class).web(true).run(args);
    }

}
