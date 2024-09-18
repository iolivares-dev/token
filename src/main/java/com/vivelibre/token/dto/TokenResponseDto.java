package com.vivelibre.token.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TokenResponseDto {

    @JsonProperty("auth-vivelibre-token")
    private String token;

    @JsonProperty("date")
    private String date;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
