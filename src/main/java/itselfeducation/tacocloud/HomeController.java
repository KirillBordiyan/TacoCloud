package itselfeducation.tacocloud;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

//Spring automatically find and create object HomeController like been-component in Spring application context
@Controller
public class HomeController {
    @GetMapping("/")
    public String home(){
        return "home";
    }
}
