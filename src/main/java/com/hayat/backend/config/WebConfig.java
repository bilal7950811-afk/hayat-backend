package com.hayat.backend.config; // ⚠️ Notice the ".config" at the end!

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        // This ensures anyone landing on your root URL gets seamlessly sent to your index.html page
        registry.addViewController("/").setViewName("forward:/index.html");
    }
}