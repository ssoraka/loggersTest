package example.workers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Random;

public class Worker implements Runnable {
    private static final Logger log = LoggerFactory.getLogger(Worker.class);
    private Random random = new Random();

    @Override
    public void run() {
        while (true) {

            log.trace("trace");
            log.debug("debug");
            log.info("русский текст");
            log.warn("warn");
            log.error("error");
            try {
                Thread.sleep(1000l);
            } catch (Exception e) {}
        }
    }
}
