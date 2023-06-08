package com.denkitronik.ekgiot.model.entidades;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Clase que representa la entidad Paciente
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="especialistas") //Indica el nombre de la tabla
public class Especialista {

    @Id //Indica que es la llave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; //Atributo que representa la llave primaria

    @Getter
    @Setter
    private String nombre;

    @Getter
    @Setter
    private String apellido;
    @Getter
    @Setter
    private String email;

    private String telefono;
    @Getter
    @Setter
    private String password;
}
