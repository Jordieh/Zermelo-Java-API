package dev.jb.zermelo.api.logger;

public class SystemLogger implements ZermeloLogger {

    @Override
    public void info(String s) {
        System.out.println(s);
    }

}
