package com.hayat.backend; // ⚠️ Make sure this matches your actual package name at the top of your other Java files!

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        // Tells Spring Boot: If someone visits the root URL, show them index.html
        registry.addViewController("/").setViewName("forward:/index.html");
    }
}