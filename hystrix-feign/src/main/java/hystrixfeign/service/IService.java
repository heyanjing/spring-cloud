package hystrixfeign.service;

import hystrixfeign.service.fallback.IServiceImpl;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by heyanjing on 2017/6/27 10:33.
 */
@FeignClient(name = "SERVICE-ONE",fallback = IServiceImpl.class)
public interface  IService {

    @RequestMapping("/")
     String home();

    @RequestMapping(method = RequestMethod.GET, value = "/add")
    Integer add(@RequestParam(value = "a") Integer a, @RequestParam(value = "b") Integer b);
}
