package upce.nnpia_cv_1;

import org.junit.jupiter.api.Test;
import upce.nnpia_cv_1.Controllers.MyController;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class MyControllerTest {

    @Test
    void sayHello(){
        MyController controller = new MyController();
        String test = controller.sayHello();
        assertEquals("Hey", test);
    }
}
