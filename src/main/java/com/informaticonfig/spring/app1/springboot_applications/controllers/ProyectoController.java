package com.informaticonfig.spring.app1.springboot_applications.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/proyecto")
public class ProyectoController {
    @GetMapping("/identificacion")
    public Map<String, String> obtenerIdentificacion() {
        Map<String, String> respuesta = new HashMap<>();
        respuesta.put("proyecto", "Spring Boot Proyecto - Spring Boot App");
        respuesta.put("desarrollador", "Angel");
        respuesta.put("version", "1.0.0");
        respuesta.put("entorno", "Desarrollo Local");
        return respuesta;
    }
}
