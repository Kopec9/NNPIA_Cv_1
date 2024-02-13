package upce.nnpia_cv_1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import upce.nnpia_cv_1.Controllers.ConstructorController;
import upce.nnpia_cv_1.Services.GreetingService;

public class ConstructorControllerTest {
    ConstructorController constructorController;

    @BeforeEach
    void setUp(){
        constructorController = new ConstructorController(new GreetingService());
    }

    @Test
    void SayHello(){
        System.out.println(constructorController.sayHello());
    }
}
