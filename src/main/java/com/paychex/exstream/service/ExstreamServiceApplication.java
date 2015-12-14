package com.paychex.exstream.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.paychex.exstream.api.ExstreamService;
import com.paychex.exstream.service.impl.ExstreamServiceImpl;

@SpringBootApplication
public class ExstreamServiceApplication {
	
	@Bean
	public ExstreamService exstreamService() {
		return new ExstreamServiceImpl();
	}
	
	public static void main (String[] args) {
		SpringApplication.run(ExstreamServiceApplication.class, args);
	}

}
