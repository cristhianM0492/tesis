package com.denkitronik.ekgiot.pacienteservice.model.dao;

import com.denkitronik.ekgiot.pacienteservice.model.entities.Especialista;
import org.springframework.data.repository.CrudRepository;

public interface IEspecialistaDao extends CrudRepository<Especialista, Long> {
    Especialista findByEmail(String email); //Se crea este metodo para buscar por email
}
