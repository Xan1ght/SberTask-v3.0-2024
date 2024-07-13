package mvc.spring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    @GetMapping(value = "/home")
    public String home(Model page) {
        page.addAttribute("username", "Дмитрий");
        page.addAttribute("color", "orange");
        page.addAttribute("youStr", "Посмотрел? Теперь иди работать.");
        page.addAttribute("size", "8em");
        return "home.html";
    }
}
