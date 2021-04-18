package com.oauth2.demo.handler;

import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

/**
 * @author: cyhua
 * @createTime: 2021/4/18
 * @description:
 */
public interface LoginHandler {

    Mono<ServerResponse> loginWithUserName(ServerRequest request);

    Mono<ServerResponse> loginWithGithub(ServerRequest request);
}
