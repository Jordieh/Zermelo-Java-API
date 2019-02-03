package dev.jb.zermelo.api.request;

import java.util.HashMap;
import java.util.StringJoiner;

public class AppointmentParameters extends HashMap<String, String> {

    public AppointmentParameters includeHidden(boolean value) {
        put("includeHidden", String.valueOf(value));
        return this;
    }

    public AppointmentParameters modifiedSince(long unix) {
        put("modifiedSince", String.valueOf(unix));
        return this;
    }

    public AppointmentParameters valid(boolean value) {
        put("valid", String.valueOf(value));
        return this;
    }

    public AppointmentParameters start(long unix) {
        put("start", String.valueOf(unix));
        return this;
    }

    public AppointmentParameters fields(AppointmentField... fields) {
        StringJoiner joiner = new StringJoiner(",");
        for (AppointmentField field : fields) {
            joiner.add(field.toString());
        }
        put("fields", joiner.toString());
        return this;
    }

    public AppointmentParameters end(long unix) {
        put("end", String.valueOf(unix));
        return this;
    }

    public AppointmentParameters user(String user) {
        put("user", user);
        return this;
    }

    public AppointmentParameters cancelled(boolean value) {
        put("cancelled", String.valueOf(value));
        return this;
    }

}
