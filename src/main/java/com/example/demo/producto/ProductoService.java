package com.example.demo.producto;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;

@Service
@Transactional
@RequiredArgsConstructor
public class ProductoService {
    // Inyección de dependencias hacia el repositorio
    private final ProductoRepository billeteraRepository;

    // Consultar todos los registros
    public List<Producto> findAll() {
        return billeteraRepository.findAll();
    }

    // Consultar por ID
    public Optional<Producto> findById(Long id) {
        return billeteraRepository.findById(id);
    }

    // Guardar un registro
    public Producto save(Producto entity) {
        return billeteraRepository.save(entity);
    }
/* 
    // Actualizar un registro
    public Optional<Billetera> update(Long id, Billetera nuevosDatos) {
        return billeteraRepository.findById(id)
            .map(billeteraExistente -> {
                // Aquí asignamos los nuevos valores (debes adaptar los campos a tu entidad)
                billeteraExistente.setNombre(nuevosDatos.getNombre());
                billeteraExistente.setSaldo(nuevosDatos.getSaldo());
                billeteraExistente.setMoneda(nuevosDatos.getMoneda());
                // Luego guardamos la entidad actualizada
                return billeteraRepository.save(billeteraExistente);
            });
    }
*/
    // Borrar un registro
    public boolean delete(Long id) {
        if (productoRepository.existsById(id)) {
            productoRepository.deleteById(id);
            return true; // Eliminación exitosa
        }
        return false; // No se encontró el ID
    }

    /* El sapo no se lava el pie, no se lava pero no quiere */
}
