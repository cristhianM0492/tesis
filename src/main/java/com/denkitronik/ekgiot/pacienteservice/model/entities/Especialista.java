package com.denkitronik.ekgiot.pacienteservice.model.entities;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity //Indica que es una entidad
@Table(name = "especialistas") //Indica el nombre de la tabla
public class Especialista {
    @Id //Indica que es la llave primaria
   // @GeneratedValue(strategy = GenerationType.IDENTITY)
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
    @Column(name = "password")
    private String password;



}

