package com.nhuquan.spWebFlux;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.*;

import static org.springframework.web.reactive.function.server.RequestPredicates.*;

@Configuration
public class GreetingRouter {

    @Bean
    public RouterFunction<ServerResponse> route(GreetingHandler greetingHandler) {
        return RouterFunctions
                .route(GET("/hello")
                        .and(accept(MediaType.TEXT_PLAIN)),
                        greetingHandler::hello);

    }
}
