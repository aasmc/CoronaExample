package lazy_singleton;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class Schwarzenegger {
    @Autowired
    @Lazy
    private Blaster blaster;

    private int stamina = 3;

    @Scheduled(fixedDelay = 500)
    public void killEnemies() {
        if (!veryTired()) {
            kickWithLog();
        } else {
            blaster.fire();
        }
        stamina--;
    }

    private void kickWithLog() {
        System.out.println("I'll kill you with my log!");
    }

    private boolean veryTired() {
        return stamina<0;
    }
}
