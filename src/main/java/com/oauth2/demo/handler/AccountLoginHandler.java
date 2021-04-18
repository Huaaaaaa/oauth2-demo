package com.oauth2.demo.handler;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

import javax.xml.ws.ServiceMode;

/**
 * @author: cyhua
 * @createTime: 2021/4/18
 * @description: 账户登录
 */
@Service
public class AccountLoginHandler implements LoginHandler{
    /**
     * 登录
     * @param request
     * @return
     */
    @Override
    public Mono<ServerResponse> loginWithUserName(ServerRequest request) {
        return null;
    }

    /**
     * 使用第三方登录
     * @param request
     * @return
     */
    @Override
    public Mono<ServerResponse> loginWithGithub(ServerRequest request) {
        return ServerResponse.ok().body("Login Success",String.class);
    }
}
