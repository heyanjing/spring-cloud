package balance.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String add() {
        return restTemplate.getForEntity("http://SERVICE-ONE/add?a=10&b=20", String.class).getBody();
    }
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index() {
        return restTemplate.getForEntity("http://SERVICE-ONE/", String.class).getBody();
    }
}
