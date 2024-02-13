package upce.nnpia_cv_1;

import org.junit.jupiter.api.Test;
import upce.nnpia_cv_1.Controllers.MyController;

public class MyControllerTest {
    @Test
    void sayHello(){
        MyController controller = new MyController();

        System.out.println(controller.sayHello());
    }
}
