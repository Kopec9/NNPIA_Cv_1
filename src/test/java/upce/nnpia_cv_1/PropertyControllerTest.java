package upce.nnpia_cv_1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import upce.nnpia_cv_1.Controllers.PropertyController;
import upce.nnpia_cv_1.Services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class PropertyControllerTest {
    @Autowired
    PropertyController propertyController;

    @BeforeEach
    void setUp(){
        //propertyController = new PropertyController();
        propertyController.greetingService = new GreetingService();
    }

    @Test
    void sayHello(){
        System.out.println(propertyController.sayHello());
    }
}
