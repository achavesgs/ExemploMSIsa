package com.example.ExemploMS.client.impl;

import com.example.ExemploMS.client.ClientService;
import com.example.ExemploMS.client.vo.BuscaTokenRequest;
import com.example.ExemploMS.client.vo.Token;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class ClientServiceImpl implements ClientService {

    Logger logger = LoggerFactory.getLogger(ClientServiceImpl.class);

    @Value("${token.path}")
    private String tokenPath = "";

    @Value("${server.key}")
    private String serverKey;

    @Value("${server.secret}")
    private String serverSecret;

    @Autowired
    private RestTemplate restTemplate;

    public Token geraToken(){
        logger.info("geraToken");

        BuscaTokenRequest body = new BuscaTokenRequest(serverKey, serverSecret);

        ResponseEntity<Token> response = restTemplate.exchange(
                tokenPath,
                HttpMethod.POST,
                new HttpEntity(body, null),
                Token.class
        );
        return response.getBody();
    }
}
