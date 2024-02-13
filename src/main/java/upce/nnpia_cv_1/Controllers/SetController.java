package upce.nnpia_cv_1.Controllers;

import upce.nnpia_cv_1.Services.GreetingService;

public class SetController {
    private GreetingService greetingService;

    public void setGreetingService(GreetingService greetingService){
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
