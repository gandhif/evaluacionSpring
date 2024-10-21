package com.examen.projecto01.Service;

import com.examen.projecto01.Entidad.PersonaEntity;
import com.examen.projecto01.Repository.PersonaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaServiceImpl implements PersonaService{

    private final PersonaRepository personaRepository;

    public PersonaServiceImpl(PersonaRepository personaRepository){
        this.personaRepository = personaRepository;
    }

    @Override
    public PersonaEntity crearPersona(PersonaEntity personaEntity) {
        return personaRepository.save(personaEntity);
    }

    @Override
    public List<PersonaEntity> buscarTodos() {
        return personaRepository.findAll();
    }

    @Override
    public PersonaEntity buscarPersonaXnumDocumento(Long documento) {
        return personaRepository.findById(documento).get();
    }

    @Override
    public void eliminarPersona(Long id) {
        personaRepository.deleteById(id);
    }
}
