package upce.nnpia_cv_1;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import upce.nnpia_cv_1.Controllers.MyController;

@SpringBootApplication
public class NnpiaCv1Application {
	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(NnpiaCv1Application.class, args);

		MyController myController = context

	}

}
