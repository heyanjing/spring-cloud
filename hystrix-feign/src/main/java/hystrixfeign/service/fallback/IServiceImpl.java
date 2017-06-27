package hystrixfeign.service.fallback;

import hystrixfeign.service.IService;
import org.springframework.stereotype.Repository;

/**
 * Created by heyanjing on 2017/6/27 11:48.
 */
@Repository
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
