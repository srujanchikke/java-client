package com.hyperswitch;

import com.fasterxml.jackson.databind.ObjectMapper;
import feign.Response;
import feign.Types;
import feign.jackson.JacksonDecoder;

import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;

import com.hyperswitch.client.model.ApiResponse;

public class ApiResponseDecoder extends JacksonDecoder {

    public ApiResponseDecoder(ObjectMapper mapper) {
        super(mapper);
    }

    @Override
    public Object decode(Response response, Type type) throws IOException {
        //Detects if the type is an instance of the parameterized class ApiResponse
        if (type instanceof ParameterizedType && Types.getRawType(type).isAssignableFrom(ApiResponse.class)) {
            //The ApiResponse class has a single type parameter, the Dto class itself
            Type responseBodyType = ((ParameterizedType) type).getActualTypeArguments()[0];
            Object body = super.decode(response, responseBodyType);
            Map<String, Collection<String>> responseHeaders = Collections.unmodifiableMap(response.headers());
            return new ApiResponse<>(response.status(), responseHeaders, body);
        } else {
            //The response is not encapsulated in the ApiResponse, decode the Dto as normal
            return super.decode(response, type);
        }
    }
}
