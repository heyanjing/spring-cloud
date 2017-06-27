package hystrixfeign.controller;

import hystrixfeign.service.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by heyanjing on 2017/6/27 10:39.
 */
@RestController
public class Ctr {
    @Autowired
    IService iService;

    @RequestMapping("/")
    public String home() {
        return this.iService.home();
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public Integer add(@RequestParam(name = "a",defaultValue = "2") Integer a, @RequestParam(name = "b",defaultValue = "2") Integer b) {
        return this.iService.add(a, b);
    }

}
