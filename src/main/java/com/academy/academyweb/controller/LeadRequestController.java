package com.academy.academyweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * Created by jasanchez on 14/02/2019.
 */

@Controller
public class LeadRequestController {


   @GetMapping
   public String beginLeadRequest(){
       return "new lead";
   }

   @PostMapping
   public String submitLeadRequest(){
       return "lead posted";
   }

}
