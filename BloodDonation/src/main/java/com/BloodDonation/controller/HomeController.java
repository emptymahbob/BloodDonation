//HomeController.java
package com.BloodDonation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

 @GetMapping("/")
 public String showIndex() {
     return "index";
 }
}
