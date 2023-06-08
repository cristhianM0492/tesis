package com.denkitronik.ekgiot.pacienteservice.model.dao;


import com.denkitronik.ekgiot.pacienteservice.model.entities.Paciente;
import org.springframework.data.repository.CrudRepository;


/**
 * Interface que hereda de CrudRepository para realizar las operaciones de CRUD
 */
public interface IPacienteDao extends CrudRepository<Paciente, Long> {
    Paciente findByEmail(String email); //Se crea este metodo para buscar por email
}

