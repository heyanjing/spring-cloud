package hystrixribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by heyanjing on 2017/6/27 11:34.
 */
@Service
public class ComputeService {
    private static final Logger log = LoggerFactory.getLogger(ComputeService.class);
    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "addFall")
    public String add(Integer a,Integer b) {
        return restTemplate.getForEntity("http://SERVICE-ONE/add?a="+a+"&b="+b+"", String.class).getBody();
    }

    public String addFall(Integer a,Integer b) {
        return "error--add"+a+b;
    }
    @HystrixCommand(fallbackMethod = "indexFall")
    public String index() {
        return restTemplate.getForEntity("http://SERVICE-ONE/", String.class).getBody();
    }

    public String indexFall() {
        return "error---index";
    }
}
