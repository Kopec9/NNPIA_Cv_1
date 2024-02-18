package upce.nnpia_cv_1.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import upce.nnpia_cv_1.Services.GreetingService;
import upce.nnpia_cv_1.Services.IGreetingService;


@Controller
public class ConstructorController {
    private final IGreetingService greetingService;
    @Autowired
    public ConstructorController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
