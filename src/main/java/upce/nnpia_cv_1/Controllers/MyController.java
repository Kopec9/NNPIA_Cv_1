package upce.nnpia_cv_1.Controllers;

import upce.nnpia_cv_1.Services.GreetingService;
import upce.nnpia_cv_1.Services.IGreetingService;

public class MyController {
    private final GreetingService greetingService;

    public MyController(){
        this.greetingService = new GreetingService();
    }

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
