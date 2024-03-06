package com.lira.mscartoes.application;

import com.lira.mscartoes.domain.Cartao;
import com.lira.mscartoes.infra.repository.CartaoRespository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CartaoService {

    private final CartaoRespository cartaoRespository;

    @Transactional
    public Cartao save(Cartao cartao){
        return cartaoRespository.save(cartao);
    }

    public List<Cartao> getCartoesRendaMenorIgual(Long renda){
        var rendaBigDecimal = BigDecimal.valueOf(renda);
        return cartaoRespository.findByRendaLessThanEqual(rendaBigDecimal);
    }
}
