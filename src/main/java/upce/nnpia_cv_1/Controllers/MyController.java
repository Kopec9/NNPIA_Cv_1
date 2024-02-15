package upce.nnpia_cv_1.Controllers;

import upce.nnpia_cv_1.Services.GreetingService;
import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import upce.nnpia_cv_1.Services.IGreetingService;

@Controller
public class MyController {

    @Autowired
    private final IGreetingService greetingService;

    public MyController(){
        this.greetingService = new GreetingService();
    }
    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
