package combpddyer.cmmunity1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Auther: 奔跑的玉哥儿
 * @Date: 2019/9/5
 * @Description: combpddyer.cmmunity1.controller
 * @Version: 1.0
 */

@Controller
public class IndexController {
    @GetMapping("/")
    public String index(){
        return "index";
    }
}
