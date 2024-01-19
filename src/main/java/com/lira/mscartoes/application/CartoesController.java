package com.lira.mscartoes.application;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("cartoes")
public class CartoesController {

    public String status(){
        return "ok";
    }
}
