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
public class HelloController {
    @GetMapping
    public String hello(@RequestParam(name = "name")String name, Model model){
        model.addAttribute("name",name);
        return "hello";
    }
}
