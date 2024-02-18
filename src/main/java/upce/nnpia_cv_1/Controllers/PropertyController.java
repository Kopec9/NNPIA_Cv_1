package upce.nnpia_cv_1.Controllers;

import upce.nnpia_cv_1.Services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import upce.nnpia_cv_1.Services.IGreetingService;

@Controller
public class PropertyController {
    @Autowired
    public IGreetingService greetingService;

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
