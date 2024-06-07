package pl.edu.vistula.first_project_java_spring.controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {

    @GetMapping("/hello")
    @ResponseBody
    public String hello() {
        return "Hello Vistula, from my first Spring Boot!";
    }
    @GetMapping("/greeting")
    public String greeting(@RequestParam(name= "name", required= false, defaultValue = "World") String name, Model model) {
        model.addAttribute("name", name);
        return "greeting";
    }
    //http://localhost:9000/greeting?name=Vistula
}