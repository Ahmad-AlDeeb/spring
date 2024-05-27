package com.deeb.eurekaservicediscovery.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestTemplateConfig {
    @Bean
    // Integrate Ribbon load balancer, another Netflix component
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
