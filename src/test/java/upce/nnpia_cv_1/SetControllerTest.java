package upce.nnpia_cv_1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import upce.nnpia_cv_1.Controllers.SetController;
import upce.nnpia_cv_1.Services.GreetingService;

public class SetControllerTest {
    SetController setController;

    @BeforeEach
    void setUp(){
        setController = new SetController();
        setController.setGreetingService(new GreetingService());
    }

    @Test
    void SayHello(){
        System.out.println(setController.sayHello());
    }
}
