package dev.jb.zermelo.api.models;

import java.util.Calendar;

public class Announcement {

    private final long id;
    private final Calendar start;
    private final Calendar end;
    private final String title;
    private final String text;

    public Announcement(long id, Calendar start, Calendar end, String title, String text) {
        this.id = id;
        this.start = start;
        this.end = end;
        this.title = title;
        this.text = text;
    }

    public long getId() {
        return id;
    }

    public Calendar getStart() {
        return start;
    }

    public Calendar getEnd() {
        return end;
    }

    public String getTitle() {
        return title;
    }

    public String getText() {
        return text;
    }

}
