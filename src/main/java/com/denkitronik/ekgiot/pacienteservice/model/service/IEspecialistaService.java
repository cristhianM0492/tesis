package com.denkitronik.ekgiot.pacienteservice.model.service;

import com.denkitronik.ekgiot.pacienteservice.model.entities.Especialista;
import java.util.List;

public interface IEspecialistaService {
    Especialista save ( Especialista especialista);
    void delete( Especialista especialista);
    Especialista update( Especialista especialista);
    List< Especialista> findAll();
    Especialista findById(Long id);
}
