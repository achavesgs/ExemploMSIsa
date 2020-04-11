package com.example.ExemploMS.client.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.beans.factory.annotation.Value;

public class BuscaTokenRequest {

    @JsonProperty("server_key")
    private String server_key;

    @JsonProperty("server_secret")
    private String server_secret;

    public BuscaTokenRequest(String serveKey, String serverSecret){
        this.server_key = serveKey;
        this.server_secret = serverSecret;
    }
}
