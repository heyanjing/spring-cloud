package controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by heyanjing on 2017/6/26 11:36.
 */
@RestController
public class HomeController {
    private static final Logger log = LoggerFactory.getLogger(HomeController.class);

    @Value("${env}")
    private String env;

    @RequestMapping("/")
    public String home() {
        return "service2------" + env;
    }


}
