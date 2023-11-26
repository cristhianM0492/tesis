package com.denkitronik.ekgiot.pacienteservice.model.service;

import com.denkitronik.ekgiot.pacienteservice.model.entities.HistoriaC;
import java.util.List;


public interface IHistoriaService {

    HistoriaC save (HistoriaC historiac);
    void delete(HistoriaC historiac);
    HistoriaC update(HistoriaC historiac);
    List<HistoriaC> findAll();
    HistoriaC findById(Long id);





}
