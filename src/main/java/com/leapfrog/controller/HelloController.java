package com.leapfrog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by sailesh on 5/2/17.
 */

@Controller
public class HelloController {
  private String test;
  @RequestMapping(value = "/greeting")
  public String sayHello(Model model) {
    model.addAttribute("greeting", "Hello World");
    return "hello";
  }

  @RequestMapping(value = "/index")
  public String index(Model model) {
    return "forward:index.jsp";
  }
}
