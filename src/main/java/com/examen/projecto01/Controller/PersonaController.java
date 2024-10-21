package com.examen.projecto01.Controller;

import com.examen.projecto01.Entidad.PersonaEntity;
import com.examen.projecto01.Service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/personas")
public class PersonaController {
    @Autowired
    private PersonaService personaService;

    @PostMapping
    public ResponseEntity<PersonaEntity> crearPersona(@RequestBody PersonaEntity personaEntity){
        PersonaEntity personaEntity1 = personaService.crearPersona(personaEntity);
        return new ResponseEntity<>(personaEntity1, HttpStatus.CREATED);
    }
}
