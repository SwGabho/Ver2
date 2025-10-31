package com.example.demo.billetera;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/byron")
public class BilleteraController {
    
    //Inyeccion de dependencias
    @Autowired
    private BilleteraService billeteraService;

    //Consultar todos
    @GetMapping()
    public List<Billetera> findAll(){
        return billeteraService.findAll();
    }
    //Consultar por id

    //Guardar
    @PostMapping()
    public Billetera save(@RequestBody Billetera entity){
        return billeteraService.save(entity);
    }
    //Actualizar

    //Eliminar
    
}
