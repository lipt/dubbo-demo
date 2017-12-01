package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import lpt.user.UserService;

import javax.annotation.Resource;

@Controller
public class UserController {
    @Resource
    private UserService demoService;

    @RequestMapping(value = "/test", produces = "application/json; charset=utf-8")
    @ResponseBody
    public String testDubbo() {
        String userName = demoService.getUserName();
        return "test" + userName;

    }
}
