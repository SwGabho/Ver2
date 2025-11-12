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
    // Inyección de dependencias hacia el repositorio
    private final BilleteraRepository billeteraRepository;

    // Consultar todos los registros
    public List<Billetera> findAll() {
        return billeteraRepository.findAll();
    }

    // Consultar por id
    public Optional<Billetera> findById(Long id) {
        return billeteraRepository.findById(id);
    }

    // Guardar un registro
    public Billetera save(Billetera entity) {
        return billeteraRepository.save(entity);
    }
 
    // Actualizar un registro
    public Optional<Billetera> update(Long id, Billetera billetera) {
        return billeteraRepository.findById(id) .map(existing -> {
                existing.setColor(billetera.getColor()); // Aquí asignamos los nuevos valores (debes adaptar los campos a tu entidad)
                existing.setPropietario(billetera.getPropietario());
                existing.setCosto(billetera.getCosto());
                // Luego guardamos la entidad actualizada
                return billeteraRepository.save(existing);
            });
    }

    // Borrar un registro
    public boolean delete(Long id){
        billeteraRepository.deleteById(id);
        return false;
    } 
}
