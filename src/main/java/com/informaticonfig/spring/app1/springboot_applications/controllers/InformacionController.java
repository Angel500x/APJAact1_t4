package com.informaticonfig.spring.app1.springboot_applications.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/usuario")
public class InformacionController {
    @GetMapping("/materias")
    public Map<String, Object> obtenerMaterias() {
        Map<String, Object> respuesta = new HashMap<>();
        List<String> materias = Arrays.asList(
            "Redes",
            "Ingenieria de Software",
            "Bases de Datos",
            "Programacion Web"
        );
        
        respuesta.put("estudiante", "Angel");
        respuesta.put("totalMaterias", materias.size());
        respuesta.put("listado", materias);
        return respuesta;
    }

    @GetMapping("/resumen-cuenta")
    public String obtenerResumen() {
        int proyectosActivos = 2;
        return "Estado del servidor: ACTIVO | Proyectos en desarrollo: " + proyectosActivos;
    }
}
