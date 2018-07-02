package com.example.demo.feign;

import org.springframework.stereotype.Component;

/**
 * @author Moritz Krischke, MHP
 * @version 1.0
 */
@Component
public class ApiClientFallback implements ApiClient{
    @Override
    public Vehicle getVehicle() {
        return new Vehicle();
    }
}
