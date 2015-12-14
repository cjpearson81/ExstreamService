package com.paychex.exstream.service.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.paychex.exstream.api.ExstreamService;

@RestController
@RequestMapping("/ExstreamService")
public class ExstreamServiceRestController {
	
	private final ExstreamService exstreamService;
	
	@Autowired
	public ExstreamServiceRestController(ExstreamService exstreamService) {
		this.exstreamService = exstreamService;
	}
	
	@RequestMapping("/test")
	public @ResponseBody String test() {
		System.out.println("test...");
		return exstreamService.test();
	}

}
