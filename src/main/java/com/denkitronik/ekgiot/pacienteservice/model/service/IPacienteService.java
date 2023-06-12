package com.denkitronik.ekgiot.pacienteservice.model.service;


import com.denkitronik.ekgiot.pacienteservice.model.entities.Paciente;

import java.util.List;

/**
 * Interface que hereda de CrudRepository para realizar las operaciones de CRUD
 */
//@Repository
public interface IPacienteService {
    Paciente save (Paciente paciente);
    void delete(Paciente paciente);
    Paciente update(Paciente paciente);
    List<Paciente> findAll();
    Paciente findById(Long id);

    Paciente login(Paciente paciente);

}


