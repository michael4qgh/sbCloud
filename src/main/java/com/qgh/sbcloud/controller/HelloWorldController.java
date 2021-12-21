package com.qgh.sbcloud.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

  @RequestMapping("/")
  public String index() {
    return "Hello world from Spring Cloud!";
  }
}
