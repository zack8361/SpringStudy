package hello.hellospring.Controller;


import hello.hellospring.Service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;


/**
 * Spring Container 라는 Spring 통이 생긴다.
 * 거기 안에 Controller 객체를 생성해서 Spring 에 넣어준다.
 */
@Controller
public class MemberController {
    private final MemberService memberService;
    @Autowired
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }
    
}
