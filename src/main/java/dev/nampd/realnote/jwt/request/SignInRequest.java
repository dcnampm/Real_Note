package dev.nampd.realnote.jwt.request;

import lombok.Data;

@Data
public class SignInRequest {
    private String email;
    private String password;

}
