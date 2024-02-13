package upce.nnpia_cv_1.Controllers;

import upce.nnpia_cv_1.Services.GreetingService;

public class ConstructorController {
    private final GreetingService greetingService;


    public ConstructorController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
