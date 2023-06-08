package com.denkitronik.ekgiot.pacienteservice.model.service;


import com.denkitronik.ekgiot.pacienteservice.model.dao.IPacienteDao;
import com.denkitronik.ekgiot.pacienteservice.model.entities.Paciente;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Clase implementa el servicio de pais
 */
@Service
public class PacienteServiceImpl implements IPacienteService {

    /**
     * Constructor de la clase
     * @param pacienteDao objeto de tipo IPacienteDao que se inyecta por
     *                    constructor  para acceder a los metodos de la
     *                    capa de datos de la entidad Paciente
     */
    public PacienteServiceImpl(IPacienteDao pacienteDao) {
        this.pacienteDao = pacienteDao;
    }

//    @Autowired
    IPacienteDao pacienteDao; //Inyectamos el objeto de tipo IPacienteDao

    /**
     * Este metodo guarda un paciente
     * @param paciente objeto de tipo Paciente que se quiere guardar
     * @return el paciente guardado
     */
    @Override
    public Paciente save(Paciente paciente) {
        return pacienteDao.save(paciente);
    }

    /**
     * Este metodo elimina un paciente
     * @param paciente objeto de tipo Paciente que se quiere eliminar
     */
    @Override
    public void delete(Paciente paciente) {
        pacienteDao.delete(paciente);
    }

    /**
     * Este metodo actualiza un paciente
     * @param paciente objeto de tipo Paciente que se quiere actualizar
     * @return el paciente actualizado
     */
    @Override
    public Paciente update(Paciente paciente) {
        return pacienteDao.save(paciente);
    }

    /**
     * Este metodo lista los pacientes guardados
     * @return una lista de pacientes
     */
    @Override
    public List<Paciente> findAll() {
        return (List<Paciente>) pacienteDao.findAll();
    }

    /**
     * Este metodo busca un paciente
     * @param id Llave primaria del paciente que se quiere buscar
     * @return el paciente identificado por el campo id
     */
    @Transactional(readOnly = true)  // Para ejecutar en modo de solo lectura
    @Override
    public Paciente findById(Long id) {
        return pacienteDao.findById(id).isPresent() ? pacienteDao.findById(id).get() : null;
    }
}
