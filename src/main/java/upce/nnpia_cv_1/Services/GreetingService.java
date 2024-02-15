package upce.nnpia_cv_1.Services;

import org.springframework.stereotype.Service;

@Service
public class GreetingService implements IGreetingService{
    @Override
    public String sayGreeting() {
        return "Hey";
    }
}
