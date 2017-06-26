package service2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by heyanjing on 2017/6/24 15:52.
 */
@SpringBootApplication
@EnableEurekaClient
@RestController
public class Service2Application {

    @RequestMapping("/")
    public String home() {
        return "service2";
    }

    public static void main(String[] args) {
        SpringApplication.run(Service2Application.class,args);
        //new SpringApplicationBuilder(Service1Application.class).web(true).run(args);
    }

}
