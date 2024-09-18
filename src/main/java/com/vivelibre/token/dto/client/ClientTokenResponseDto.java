package com.vivelibre.token.dto.client;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ClientTokenResponseDto {


    private String token;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
