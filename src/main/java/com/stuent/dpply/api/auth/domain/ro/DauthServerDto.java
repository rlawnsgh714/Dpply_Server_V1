package com.stuent.dpply.api.auth.domain.ro;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class DauthServerDto {

    private String access_token;
    private String refresh_token;
    private String token_type;
    private String expires_in;
}