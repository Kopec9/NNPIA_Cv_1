package upce.nnpia_cv_1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import upce.nnpia_cv_1.Controllers.ConstructorController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import upce.nnpia_cv_1.Services.GreetingService;

@SpringBootTest
public class ConstructorControllerTest {

    @Autowired
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
