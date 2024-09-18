package com.vivelibre.token.dto.client;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ClientTokenRequestDto {

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
