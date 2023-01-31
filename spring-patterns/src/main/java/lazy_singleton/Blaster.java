package lazy_singleton;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
@Lazy
public class Blaster {
    @PostConstruct
    private void init() {
        System.err.println("You paid 100500 for the blaster");
    }

    public void fire() {
        System.out.println("BOOM-BOOM!!!");
    }
}
