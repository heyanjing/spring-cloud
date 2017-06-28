package eureka2.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by heyanjing on 2017/6/26 16:40.
 */
@RestController
public class Ctr {
    private static final Logger log = LoggerFactory.getLogger(Ctr.class);

    @Value("${env}")
    private String env;

    @RequestMapping("/")
    public String home() {
        return "service2-------"+env;
    }

    @RequestMapping(value = "/sub", method = RequestMethod.GET)
    public Integer sub(@RequestParam(name = "a",defaultValue = "1") Integer a, @RequestParam(name = "b",defaultValue = "2") Integer b) {
        Integer r = a - b;
        return r;
    }
}
