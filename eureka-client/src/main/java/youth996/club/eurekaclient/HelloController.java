package youth996.club.eurekaclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhanxinjian
 * @date 2019/10/23
 * @Descritption
 */
@RestController
public class HelloController {
    @Value("${server.port")
    String port;

    @RequestMapping("/hello")
    public String home(@RequestParam String name) {
        return "hello" + name + ",i am from port:" + port;
    }
}
