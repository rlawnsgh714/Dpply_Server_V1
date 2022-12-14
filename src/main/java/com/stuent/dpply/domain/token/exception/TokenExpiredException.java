package com.stuent.dpply.domain.token.exception;

import com.stuent.dpply.domain.token.error.TokenErrorCode;
import com.stuent.dpply.common.exception.CustomException;

public class TokenExpiredException extends CustomException {

    private TokenExpiredException() {
        super(TokenErrorCode.TOKEN_EXPIRED);
    }

    public static final CustomException EXCEPTION = new TokenExpiredException();
}
