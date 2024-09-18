package com.vivelibre.token.service;

import com.vivelibre.token.dto.TokenRequestDto;
import com.vivelibre.token.dto.TokenResponseDto;
import com.vivelibre.token.dto.client.ClientTokenRequestDto;
import com.vivelibre.token.dto.client.ClientTokenResponseDto;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.Objects;

@Service
public class TokenService {

    public TokenResponseDto getToken(TokenRequestDto requestDto) {
        TokenResponseDto response = null;
        RestTemplate restTemplate = new RestTemplate();
        String url = "http://localhost:8080/token";
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        if (Objects.nonNull(requestDto)) {
            ClientTokenRequestDto data = new ClientTokenRequestDto();
            data.setUserName(requestDto.getUserName());
            data.setPassword(requestDto.getPassword());

            HttpEntity<ClientTokenRequestDto> request = new HttpEntity<>(data, headers);

            ResponseEntity<ClientTokenResponseDto> clientResponse = restTemplate.postForEntity(url, request, ClientTokenResponseDto.class);

            if (Objects.nonNull(clientResponse.getBody())) {
                LocalDate currentDate = LocalDate.now();
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM d, yyyy", Locale.ENGLISH);
                String formattedDate = currentDate.format(formatter);

                response = new TokenResponseDto();
                response.setToken(clientResponse.getBody().getToken());
                response.setDate(formattedDate);
            }
        }

        return response;
    }

}


