package com.denkitronik.ekgiot.pacienteservice.controller;



import com.denkitronik.ekgiot.pacienteservice.model.entities.HistoriaC;
import com.denkitronik.ekgiot.pacienteservice.model.entities.Paciente;
import com.denkitronik.ekgiot.pacienteservice.model.service.IHistoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController //Se define como un controlador rest
@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*") //Se permite el Cross Origin a http://localhost:4200
@RequestMapping("/paciente-service")  //Se define la ruta base para todos los endpoints
public class HistoriaRestController {

    IHistoriaService iHistoriaService;

    @Autowired
    public HistoriaRestController(IHistoriaService iHistoriaService) {
        this.iHistoriaService = iHistoriaService;
    }
    @PostMapping(value = "/historiac")
    public HistoriaC registrarHistoria(@RequestBody HistoriaC historiaC) {
        historiaC = iHistoriaService.save(historiaC);
        return historiaC;
    }
    @GetMapping("/obtener-historia")
    public List<HistoriaC> getHistoria() {
        List<HistoriaC> historia;
        historia = iHistoriaService.findAll();
        return historia;
    }
}
