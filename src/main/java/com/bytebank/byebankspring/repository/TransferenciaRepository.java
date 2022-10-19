package com.bytebank.byebankspring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bytebank.byebankspring.model.Transferencia;

@Repository
// JPA: possui interfaces para facilicar o acesso ao banco de dados
public interface TransferenciaRepository extends JpaRepository<Transferencia, Long> {
    
}