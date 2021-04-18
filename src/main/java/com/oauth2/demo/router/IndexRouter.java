package com.oauth2.demo.router;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;
import static org.springframework.web.reactive.function.server.ServerResponse.ok;

/**
 * @author: cyhua
 * @createTime: 2021/4/18
 * @description:
 */
@Configuration
@Slf4j
public class IndexRouter {

    @Bean
    public RouterFunction<ServerResponse> indexRouterFunction(@Value("classpath:/templates/login.ftl") Resource resource){
            return route(GET("/index"), request
                    -> ok().contentType(MediaType.TEXT_HTML).syncBody(resource));
    }

}
