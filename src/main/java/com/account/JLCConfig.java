package com.account;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@EnableWebMvc
@Configuration
@ComponentScan({"com.account", "com.acc.mapper", "com.acc.repository.db", "com.acc.service",
    "com.model", "com.controller", "com.dto", "com.web.transform", "com.builder"})
public class JLCConfig implements WebMvcConfigurer{

}