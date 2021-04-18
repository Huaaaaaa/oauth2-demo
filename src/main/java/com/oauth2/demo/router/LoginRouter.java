package com.oauth2.demo.router;

import com.oauth2.demo.handler.LoginHandler;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

import static org.springframework.web.reactive.function.server.RequestPredicates.accept;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

/**
 * @author: cyhua
 * @createTime: 2021/4/18
 * @description:
 */
@Configuration
@Slf4j
public class LoginRouter {

    @Autowired
    private LoginHandler loginHandler;

    @Bean
    public RouterFunction<ServerResponse> loginRouterFunction(){
        return route().POST("/login", accept(MediaType.APPLICATION_JSON),this::loginWithUserName)
                .GET("/loginWithGithub", accept(MediaType.APPLICATION_JSON),this::loginWithGithub).build();
    }

    Mono<ServerResponse> loginWithUserName(ServerRequest request){
        return loginHandler.loginWithUserName(request);
    }

    Mono<ServerResponse> loginWithGithub(ServerRequest request){
        return loginHandler.loginWithGithub(request);
    }
}
