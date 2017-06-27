package eureka2.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by heyanjing on 2017/6/26 16:40.
 */
@RestController
public class Ctr {
    @RequestMapping("/")
    public String home() {
        return "service2-------" ;
    }

    @RequestMapping(value = "/sub" ,method = RequestMethod.GET)
    public Integer sub(@RequestParam Integer a, @RequestParam Integer b) {
        Integer r = a - b;
        return r;
    }
}
