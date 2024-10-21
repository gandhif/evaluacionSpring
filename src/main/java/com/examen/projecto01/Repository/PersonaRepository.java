package com.examen.projecto01.Repository;

import com.examen.projecto01.Entidad.PersonaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonaRepository extends JpaRepository<PersonaEntity,Long> {
}
