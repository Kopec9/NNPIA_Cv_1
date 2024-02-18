package upce.nnpia_cv_1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import upce.nnpia_cv_1.Controllers.SetController;
import upce.nnpia_cv_1.Services.GreetingService;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SetControllerTest {
    SetController setController;

    @BeforeEach
    void setUp(){
        setController = new SetController();
        setController.setGreetingService(new GreetingService());
    }

    @Test
    void SayHello(){
        String test = setController.sayHello();
        assertEquals("Hello, World!", test);
    }
}
