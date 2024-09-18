package com.vivelibre.token.controller;

import com.vivelibre.token.dto.TokenRequestDto;
import com.vivelibre.token.dto.TokenResponseDto;
import com.vivelibre.token.service.TokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TokenController {

    @Autowired
    TokenService tokenService;

    @PostMapping("/token")
    public TokenResponseDto getToken(@RequestBody TokenRequestDto requestDto) {
        return  tokenService.getToken(requestDto);
    }

}
