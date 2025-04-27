package com.eureka.User_Microservices_Client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private WebClient ref;

    // ✅ 1. RestTemplate based call
    @GetMapping("/orders/rest/{userId}")
    public String getUserOrdersWithRest(@PathVariable String userId) {
        String url = "http://ORDER-SERVICE/orders/" + userId;
        return restTemplate.getForObject(url, String.class);
    }

    // ✅ 2. WebClient based call
    @GetMapping("/orders/web/{userId}")
    public Mono<String> getUserOrdersWithWebClient(@PathVariable String userId) {
        return ref //
                .get()
                .uri("http://ORDER-SERVICE/orders/" + userId)
                .retrieve()
                .bodyToMono(String.class);
    }
}
