package hello.hellospring.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class helloController {


    @GetMapping("/hello")
    public String hello(Model model){
       model.addAttribute("data","hello!!!!");

//      hello.html 을 찾아서 랜더링 시켜라.
       return "hello";
    }

    @GetMapping("/hello-mvc")
    public String helloMvc(@RequestParam("name") String name,Model model){
        model.addAttribute("name", name);
//        hello-template 를 찾아서 렌더링 시켜라.
        return "hello-template";
    }

    @GetMapping("/hello-string")
    @ResponseBody
//    http protocol body 부에 내가 직접 데이터를 넣어주겠다.
//    그대로 데이터만 내려주는 방식.
//    크게 쓰이는 방식은 아니다..
    public String helloString(@RequestParam("name") String name){

        return "hello" + name;
    }
}
