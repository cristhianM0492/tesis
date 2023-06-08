package com.denkitronik.ekgiot.pacienteservice.controller;

import com.denkitronik.ekgiot.pacienteservice.model.entities.Paciente;
import com.denkitronik.ekgiot.pacienteservice.model.service.IPacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController //Se define como un controlador rest
@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*") //Se permite el Cross Origin a http://localhost:4200
@RequestMapping("/paciente-service")  //Se define la ruta base para todos los endpoints
public class PacienteRestController {

    IPacienteService pacienteService; //Interfaz de la capa de servicio

    /**
     * Constructor de la clase
     *
     * @param pacienteService Es la interfaz de la capa de servicio que se inyecta por constructor
     */
    @Autowired
    public PacienteRestController(IPacienteService pacienteService) {
        this.pacienteService = pacienteService;
    }

    /**
     * Metodo para crear un paciente
     *
     * @param paciente Es el paciente que se va a crear
     * @return El paciente creado
     */
    @PostMapping(value = "/paciente")
    public Paciente registrarPaciente(@RequestBody Paciente paciente) {
        paciente = pacienteService.save(paciente);
        return paciente;
    }

    /**
     * Metodo buscar paciente por id
     *
     * @param id Es el id del paciente
     * @return El paciente encontrado
     */
    @GetMapping("/paciente/{id}")
    public Paciente buscarPaciente(@PathVariable("id") Long id) {
        return pacienteService.findById(id);
    }

    /**
     * Metodo que lista los pacientes
     *
     * @return Lista de pacientes
     */
    @GetMapping("/pacientes")
    public List<Paciente> getPacientes() {
        List<Paciente> pacientes;
        pacientes = pacienteService.findAll();
        return pacientes;
    }

}

