package com.netflix.projeto.config;

import jdk.jshell.SourceCodeAnalysis;
import org.apache.coyote.Request;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {
    @Bean
    public Docket productApi(){
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.netflix.projeto"))
                .paths(regex("/usuario."))
                .build()
                .apiInfo(metaInfo());
    }
}
