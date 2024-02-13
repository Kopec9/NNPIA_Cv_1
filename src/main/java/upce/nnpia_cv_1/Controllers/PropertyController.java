package upce.nnpia_cv_1.Controllers;

import upce.nnpia_cv_1.Services.GreetingService;

public class PropertyController {
    public GreetingService greetingService;

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
