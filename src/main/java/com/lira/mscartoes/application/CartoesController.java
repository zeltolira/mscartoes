package com.lira.mscartoes.application;

import com.lira.mscartoes.application.request.CartaoSaveRequest;
import com.lira.mscartoes.domain.Cartao;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("cartoes")
@RequiredArgsConstructor
public class CartoesController {

    private final CartaoService cartaoService;

    public String status(){
        return "ok";
    }

    public ResponseEntity cadastra(@RequestBody CartaoSaveRequest cartaoSaveRequest){
        Cartao cartao = cartaoSaveRequest.toModel();
        cartaoService.save(cartao);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
