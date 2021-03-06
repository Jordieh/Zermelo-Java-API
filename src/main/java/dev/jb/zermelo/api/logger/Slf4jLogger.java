package dev.jb.zermelo.api.logger;

import org.slf4j.Logger;

/**
 * Logs all output to the provided {@link Logger}.
 *
 * @author Jordieh
 */
public class Slf4jLogger implements ZermeloLogger {

    private final Logger logger;

    public Slf4jLogger(Logger logger) {
        this.logger = logger;
    }

    @Override
    public void info(String s) {
        logger.info(s);
    }

}
