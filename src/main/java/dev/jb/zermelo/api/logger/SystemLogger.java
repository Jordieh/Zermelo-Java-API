package dev.jb.zermelo.api.logger;

import org.slf4j.Logger;

/**
 * Logs all output to {@link System#out}.
 *
 * @author Jordieh
 */
public class SystemLogger implements ZermeloLogger {

    @Override
    public void info(String s) {
        System.out.println(s);
    }

}
