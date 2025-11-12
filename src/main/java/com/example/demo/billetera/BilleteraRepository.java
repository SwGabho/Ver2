package com.example.demo.billetera;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BilleteraRepository extends JpaRepository<Billetera, Long> {

    Optional <Billetera> findBynombre(String nombre);
    
}
