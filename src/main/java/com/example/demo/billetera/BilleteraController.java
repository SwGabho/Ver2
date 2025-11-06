package com.example.demo.billetera;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/byron")
public class BilleteraController {

    // Inyección de dependencias
    @Autowired
    private BilleteraService billeteraService;

    // Consultar todos
    @GetMapping()
    public List<Billetera> findAll() {
        return billeteraService.findAll();
    }

    // Consultar por id
    @GetMapping("/{id}")
    public Optional<Billetera> findById(@PathVariable Long id) {
        return billeteraService.findById(id);
    }

    // Guardar
    @PostMapping()
    public Billetera save(@RequestBody Billetera entity) {
        return billeteraService.save(entity);
    }

  /*   // Actualizar
    @PutMapping("/{id}")
    public Optional<Billetera> update(@PathVariable Long id, @RequestBody Billetera nuevosDatos) {
        return billeteraService.update(id, nuevosDatos);
    }
*/
    // Eliminar
    @DeleteMapping("/{id}")
    public String delete(@PathVariable Long id) {
        boolean deleted = billeteraService.delete(id);
        if (deleted) {
            return "Registro con ID " + id + " eliminado correctamente.";
        } else {
            return "No se encontró el registro con ID " + id;
        }
    }
}
