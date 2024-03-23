package dev.nampd.realnote.jwt.request;

import lombok.Data;

@Data
public class RefreshTokenRequest {

    private String token;
}
