package com.company.intecap.primeraapp.controller;

import com.company.intecap.primeraapp.model.Automovil;
import com.company.intecap.primeraapp.model.Cliente;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api") // es el prefijo de la url
public class AutomovilController {
    @GetMapping("/automoviles") // http://localhost:8080/api/v1/clientes
    public ResponseEntity<List<Automovil>> getClientes() {

        Automovil a1 = new Automovil("Audi", "Q5", "Rojo", "417FQZ", 100);
        Automovil a2 = new Automovil("BMW", "Q5", "Rojo", "417FQZ", 100);
        Automovil a3 = new Automovil("HONDA", "Q5", "Rojo", "417FQZ", 100);
        Automovil a4 = new Automovil("MITSUBISHI", "Q5", "Rojo", "417FQZ", 100);
        Automovil a5 = new Automovil("MITSUBISHI", "Q5", "Rojo", "417FQZ", 100);
        List<Automovil> automoviles = List.of(a1, a2, a3, a4, a5);
        return new ResponseEntity<>(automoviles, HttpStatus.OK);
    }
}
