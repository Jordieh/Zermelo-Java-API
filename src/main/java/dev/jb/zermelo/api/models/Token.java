package dev.jb.zermelo.api.models;

import java.util.Calendar;

public class Token {

    private final String token;
    private final Calendar created;
    private final Calendar expires;
    private final Calendar timeout;
    private final String user;
    private final long rolemask;
    private final String authcode;

    public static Token fromAuthenticationToken(AuthenticationToken token) {
        return new Token(token.getAccessToken(), null, token.getExpirationTime(), null, null, 0L, null);
    }

    public static Token fromAccessTokenString(String s) {
        return new Token(s, null, null, null, null, 0L, null);
    }

    public Token(String token, Calendar created, Calendar expires, Calendar timeout, String user, long rolemask, String authcode) {
        this.token = token;
        this.created = created;
        this.expires = expires;
        this.timeout = timeout;
        this.user = user;
        this.rolemask = rolemask;
        this.authcode = authcode;
    }

    public String getToken() {
        return token;
    }

    public Calendar getCreated() {
        return created;
    }

    public Calendar getExpires() {
        return expires;
    }

    public Calendar getTimeout() {
        return timeout;
    }

    public String getUser() {
        return user;
    }

    public long getRolemask() {
        return rolemask;
    }

    public String getAuthcode() {
        return authcode;
    }

    @Override
    public String toString() {
        System.out.println("CALLED: " + token);
        return token;
    }

}
