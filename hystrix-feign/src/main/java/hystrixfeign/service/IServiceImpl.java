package hystrixfeign.service;

import org.springframework.stereotype.Component;

/**
 * Created by heyanjing on 2017/6/27 17:52.
 */
@Component
public class IServiceImpl implements IService {
    @Override
    public String home() {
        return "error--home";
    }

    @Override
    public Integer add(Integer a, Integer b) {
        return  -99;
    }
}
