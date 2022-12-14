package com.stuent.dpply.common.config.restemplate;

import com.stuent.dpply.common.exception.error.InternalServerException;
import lombok.NonNull;
import org.springframework.http.HttpStatus;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.web.client.ResponseErrorHandler;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RestTemplateErrorHandler implements ResponseErrorHandler {

    @Override
    public boolean hasError(ClientHttpResponse response) throws IOException {

        final HttpStatus status = response.getStatusCode();
        return status.series() == HttpStatus.Series.SERVER_ERROR;
    }

    @Override
    public void handleError(ClientHttpResponse response) throws IOException {
        final String error = getErrorAsString(response);

        throw InternalServerException.EXCEPTION;
    }

    private String getErrorAsString(@NonNull final ClientHttpResponse response) throws IOException {
        try (
                BufferedReader bufferedReader = new BufferedReader((new InputStreamReader(response.getBody())))
        ) {
            return bufferedReader.readLine();
        }
    }

}
