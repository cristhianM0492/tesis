package com.denkitronik.ekgiot.pacienteservice.model.dao;

import com.denkitronik.ekgiot.pacienteservice.model.entities.HistoriaC;
import org.springframework.data.repository.CrudRepository;

public interface IHistoriaDao extends CrudRepository<HistoriaC, Long> {

}
