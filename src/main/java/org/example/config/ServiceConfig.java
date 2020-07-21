package org.example.config;

import org.example.repository.ProductRepository;
import org.example.service.MailService;
import org.example.service.ProductService;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class ServiceConfig {
    @Bean
    @Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
    public ProductService productService(ProductRepository repository, MailService mailService) {
        System.out.println("Create product service.");
        return new ProductService(repository, mailService);
    }
}
