package com.lira.mscartoes.infra.repository;

import com.lira.mscartoes.domain.Cartao;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigDecimal;
import java.util.List;

public interface CartaoRespository extends JpaRepository <Cartao, Long> {
    List<Cartao> findByRendaLessThanEqual(BigDecimal renda);
}
