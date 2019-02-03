package dev.jb.zermelo.api.models;

import java.util.Arrays;
import java.util.List;

public class User {

    private final String code;
    private final String password;
    private final String[] roles;
    private final String firstName;
    private final String prefix;
    private final String lastName;
    private final String email;
    private final String username;

    public User(String code, String password, String[] roles, String firstName, String prefix, String lastName, String email, String username) {
        this.code = code;
        this.password = password;
        this.roles = roles;
        this.firstName = firstName;
        this.prefix = prefix;
        this.lastName = lastName;
        this.email = email;
        this.username = username;
    }

    public String getCode() {
        return code;
    }

    public String getPassword() {
        return password;
    }

    public List<String> getRoles() {
        return Arrays.asList(roles);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getPrefix() {
        return prefix;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getUsername() {
        return username;
    }

}
