package hello.hellospring.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class helloController {


    @GetMapping("/hello")
    public String hello(Model model){
       model.addAttribute("data","hello!!!!");

//      hello.html 을 찾아서 랜더링 시켜라.
       return "hello";
    }

}
