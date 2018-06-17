package test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import test.entity.User;
import test.service.TestService;

import java.util.List;
@Controller
public class TestController {
    @Autowired
    private TestService testService;
@RequestMapping("/findUser.action")
    private String findUser(User user,Model model){
        List<User>userList=testService.findUserByName(user);
        model.addAttribute("userList",userList);
        return "test/test.jsp";
    }
}
