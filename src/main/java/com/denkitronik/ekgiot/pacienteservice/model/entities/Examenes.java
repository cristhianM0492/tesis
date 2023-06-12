package com.denkitronik.ekgiot.pacienteservice.model.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity //Indica que es una entidad
@Table(name = "examenes") //Indica el nombre de la tabla
public class Examenes {

    @Id //Indica que es la llave primaria
   // @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Getter
    @Setter
    @Column(name = "dispositivos")
    private String dispositivos;

    @Getter
    @Setter
    @Column(name = "fechas")
    private String fechas;

    @Getter
    @Setter
    @Column(name = "observaciones")
    private String observaciones;

}
