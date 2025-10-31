package com.example.demo.billetera;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;

@Service
@Transactional
@RequiredArgsConstructor
public class BilleteraService {
    //Inyeccion de dependencias hacia el repositorio
    private final BilleteraRepository billeteraRepository;

    //Consultar todos los registros
    public List<Billetera> findAll(){
        return billeteraRepository.findAll();
    }

    //Consultar por ID
    public Optional<Billetera> findById(Long id){
        return billeteraRepository.findById(id);
    }
    //Guardar un registro
    public Billetera save(Billetera entity){
        return billeteraRepository.save(entity);
    }

    //Actualizar un registro

    //Borrar un registro


}
