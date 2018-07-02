package com.example.demo.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Moritz Krischke
 * @version 1.0
 */
@FeignClient(value = "CARDEALER", fallback = ApiClientFallback.class)
// TODO: 02.07.18 This commenting in requestmappings on class level the histrix fallback mapping won´t work
@RequestMapping(value = "cardealer")
public interface ApiClient {

    @GetMapping("/vehicle")
    public Vehicle getVehicle();
}
