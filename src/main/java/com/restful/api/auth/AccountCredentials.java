package com.restful.api.auth;

/**
* @author Damiano Alves on 22/02/19
* damiano.alves@gmail.com
*/

public class AccountCredentials {

    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}