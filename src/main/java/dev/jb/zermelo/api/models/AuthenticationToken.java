package dev.jb.zermelo.api.models;

import java.util.Calendar;

public class AuthenticationToken {

    private final String accessToken;
    private final String type;
    private final Calendar expirationTime;

    public AuthenticationToken(String accessToken, String type, Calendar expirationTime) {
        this.accessToken = accessToken;
        this.type = type;
        this.expirationTime = expirationTime;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public String getType() {
        return type;
    }

    public Calendar getExpirationTime() {
        return expirationTime;
    }

    @Override
    public String toString() {
        return "AuthenticationToken{" +
                "accessToken='" + accessToken + '\'' +
                ", type='" + type + '\'' +
                ", expirationTime=" + expirationTime +
                '}';
    }

}
