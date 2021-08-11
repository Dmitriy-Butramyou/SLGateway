package com.butramyou.slgateway.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Profile("local-discovery")
@Configuration
public class LoadBalancedRoutesConfig {

    @Bean
    public RouteLocator loadBalancerRoutes(RouteLocatorBuilder builder) {
        return builder.routes()
                .route(r -> r.path("/").uri("lb://SLEEPLESSLIFE-BACK"))
                .build();
    }
}
