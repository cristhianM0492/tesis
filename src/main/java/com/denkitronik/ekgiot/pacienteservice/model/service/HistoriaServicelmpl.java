package com.denkitronik.ekgiot.pacienteservice.model.service;



import com.denkitronik.ekgiot.pacienteservice.model.dao.IHistoriaDao;
import com.denkitronik.ekgiot.pacienteservice.model.entities.HistoriaC;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class HistoriaServicelmpl implements IHistoriaService {

    public HistoriaServicelmpl(IHistoriaDao historiaDao) {
        this.historiaDao = historiaDao;
    }

    //    @Autowired
    IHistoriaDao historiaDao; //Inyectamos el objeto de tipo IDao

    @Override
    public HistoriaC save(HistoriaC historiaC) {
        return historiaDao.save(historiaC);
    }


    @Override
    public void delete(HistoriaC historiaC) {
        historiaDao.delete(historiaC);
    }

    @Override
    public HistoriaC update(HistoriaC historiaC) {
        return historiaDao.save(historiaC);
    }

    @Override
    public List<HistoriaC> findAll() {
        return (List<HistoriaC>) historiaDao.findAll();
    }


    @Transactional(readOnly = true)  // Para ejecutar en modo de solo lectura
    @Override
    public HistoriaC findById(Long id) {
        return historiaDao.findById(id).isPresent() ? historiaDao.findById(id).get() : null;
    }



}
