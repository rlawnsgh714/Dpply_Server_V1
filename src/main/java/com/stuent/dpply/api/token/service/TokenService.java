package com.stuent.dpply.api.token.service;

import com.stuent.dpply.api.token.domain.enums.JWT;

public interface TokenService {

    String generateToken(String id, JWT jwt);
}
