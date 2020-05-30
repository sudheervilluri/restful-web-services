package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.beans.HelloMessages;

@RestController
public class MessageController {

	@GetMapping("/")
	public String helloWorld() {
		//model.addAttribute("name", name);
		return "hello-world";
	}

	@GetMapping("/hello-world")
	public String hello() {
		return "Hello World";
	}

	@GetMapping(path = "/hello-world-bean")
	public HelloMessages getHello() {
		return new HelloMessages("Hello message2");
	}

	/// hello-world/path-variable/in28minutes
	@GetMapping(path = "/hello-world/path-variable/{name}")
	public HelloMessages helloWorldPathVariable(@PathVariable String name) {
		return new HelloMessages(String.format("Hello World, %s", name));
	}
}
