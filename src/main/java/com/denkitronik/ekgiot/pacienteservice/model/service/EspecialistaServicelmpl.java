package com.denkitronik.ekgiot.pacienteservice.model.service;


import com.denkitronik.ekgiot.pacienteservice.model.dao.IEspecialistaDao;
import com.denkitronik.ekgiot.pacienteservice.model.entities.Especialista;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EspecialistaServicelmpl implements IEspecialistaService{

    public EspecialistaServicelmpl(IEspecialistaDao especialistaDao) {
        this.especialistaDao = especialistaDao;
    }

    //    @Autowired
    IEspecialistaDao especialistaDao; //Inyectamos el objeto de tipo IDao
    @Override
    public Especialista save(Especialista especialista) {
        return especialistaDao.save(especialista);
    }

    @Override
    public void delete(Especialista especialista) {
        especialistaDao.delete(especialista);
    }

    @Override
    public Especialista update(Especialista especialista) {
        return especialistaDao.save(especialista);
    }

    @Override
    public List<Especialista> findAll() {
        return (List<Especialista>) especialistaDao.findAll();
    }


    @Transactional(readOnly = true)  // Para ejecutar en modo de solo lectura
    @Override
    public Especialista findById(Long id) {
        return especialistaDao.findById(id).isPresent() ? especialistaDao.findById(id).get() : null;
    }




}
