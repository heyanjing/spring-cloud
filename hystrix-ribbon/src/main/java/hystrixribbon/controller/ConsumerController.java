package hystrixribbon.controller;

import hystrixribbon.service.ComputeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by heyanjing on 2017/6/24 17:09.
 */
@RestController
public class ConsumerController {
    private static final Logger log = LoggerFactory.getLogger(ConsumerController.class);

    @Autowired
    ComputeService computeService;

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String add(@RequestParam(name = "a",defaultValue = "1") Integer a,@RequestParam(name = "b",defaultValue = "2") Integer b) {
        return this.computeService.add(a,b);
    }
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index() {
        return computeService.index();
    }
}
