package com.examen.projecto01.Service;

import com.examen.projecto01.Entidad.PersonaEntity;

import java.util.List;

public interface PersonaService {
    PersonaEntity crearPersona(PersonaEntity personaEntity);
    List<PersonaEntity> buscarTodos();
    PersonaEntity buscarPersonaXnumDocumento(Long documento);
    void eliminarPersona(Long id);
}
