package com.denkitronik.ekgiot.pacienteservice.controller;


import com.denkitronik.ekgiot.pacienteservice.model.entities.Especialista;
import com.denkitronik.ekgiot.pacienteservice.model.entities.Paciente;
import com.denkitronik.ekgiot.pacienteservice.model.service.IEspecialistaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController //Se define como un controlador rest
@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*") //Se permite el Cross Origin a http://localhost:4200
@RequestMapping("/paciente-service")  //Se define la ruta base para todos los endpoints
public class EspecialistaRestController {

  IEspecialistaService especialistaService;

    @Autowired
    public EspecialistaRestController(IEspecialistaService especialistaService) {
        this.especialistaService = especialistaService;
    }

    /**
     * Metodo para crear un especialista
     */
    @PostMapping(value = "/especialistas")
    public Especialista registrarPaciente(@RequestBody Especialista especialista) {
       especialista = especialistaService.save(especialista);
        return especialista;
    }

    @PostMapping("/eliminar/especialista")
    public void eliminarEspecialista(@RequestBody Especialista especialista) {
        especialistaService.delete(especialista);
    }
}
