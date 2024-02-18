package upce.nnpia_cv_1.Controllers;

import upce.nnpia_cv_1.Services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import upce.nnpia_cv_1.Services.IGreetingService;

@Controller
public class SetController {
    private IGreetingService greetingService;

    @Autowired
    public void setGreetingService(GreetingService greetingService){
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
