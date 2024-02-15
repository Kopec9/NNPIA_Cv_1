package upce.nnpia_cv_1.Controllers;

import upce.nnpia_cv_1.Services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyController {
    @Autowired
    public GreetingService greetingService;

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
