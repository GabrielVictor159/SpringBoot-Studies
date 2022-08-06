package com.example.repositorie;

import java.util.UUID;

import com.example.model.Estacionamento;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstacionamentoRepository extends JpaRepository<Estacionamento, UUID>{

}
