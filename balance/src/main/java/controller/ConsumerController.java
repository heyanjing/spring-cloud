package controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by heyanjing on 2017/6/24 17:09.
 */
@RestController
public class ConsumerController {
    private static final Logger log = LoggerFactory.getLogger(ConsumerController.class);

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping("/")
    public String home() {
        log.warn("进来了");
        return restTemplate.getForEntity("http://SERVICE1", String.class).getBody();
    }
}
