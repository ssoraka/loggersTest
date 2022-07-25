package example;

import example.workers.Worker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

public class Main {
    private final static Logger log = LoggerFactory.getLogger(Main.class);


    public static void main(String[] args) throws IOException {
        log.trace("trace");
        log.debug("debug");
        log.info("info");
        log.warn("warn");
        log.error("error");

        new Thread(new Worker()).start();
    }
}
