package com.claro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.claro.model.Cliente;

@Repository
public interface Clienterepository extends JpaRepository<Cliente, Long>{

}

