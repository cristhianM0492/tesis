package com.denkitronik.ekgiot.model.entities;

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
@Entity //Indica que es una entidad
@Table(name = "pacientes") //Indica el nombre de la tabla
public class Paciente {

    @Id //Indica que es la llave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Getter
    @Setter
    @Column(name = "nombres")
    private String nombres;

    @Getter
    @Setter
    @Column(name = "apellidos")
    private String apellidos;


    @Getter
    @Setter
    @Column(name = "email")
    private String email;

    @Getter
    @Setter
    @Column(name = "telefono")
    private String telefono;

    @Getter
    @Setter
    @Column(name = "password")
    private String password;

    @Getter
    @Setter
    @Column(name = "ciudad")
    private String ciudad;

    @Getter
    @Setter
    @Column(name = "edad")
    private String edad;

    @Getter
    @Setter
    @Column(name = "peso")
    private String peso;

    @Getter
    @Setter
    @Column(name = "estatura")
    private String estatura;

    @Getter
    @Setter
    @Column(name = "genero")
    private String genero;

    @Getter
    @Setter
    @Column(name = "antecedentes_quirurgicos")
    private String antecedentesQuirurgicos;

}
