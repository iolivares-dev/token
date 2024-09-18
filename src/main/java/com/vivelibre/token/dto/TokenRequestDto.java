package com.vivelibre.token.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TokenRequestDto {

    @JsonProperty("username")
    private String username;

    @JsonProperty("password")
    private String password;

    public String getUserName() {
        return username;
    }

    public void setUserName(String userName) {
        this.username = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
