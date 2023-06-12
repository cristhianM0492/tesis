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
@Table(name = "historiaC") //Indica el nombre de la tabla
public class HistoriaC {

    @Id //Indica que es la llave primaria
   // @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Getter
    @Setter
    @Column(name = "direccion")
    private String direccion;

    @Getter
    @Setter
    @Column(name = "telefono")
    private long telefono;
    @Getter
    @Setter
    @Column(name = "ciudad")
    private String ciudad;

    @Getter
    @Setter
    @Column(name = "edad")
    private long edad;

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

    @Getter
    @Setter
    @Column(name = "antecedentes_alergicos")
    private String antecedentesAlergicos;

    @Getter
    @Setter
    @Column(name = "antecedentes_patologicos")
    private String antecedentesPatologicos;

    @Getter
    @Setter
    @Column(name = "antecedentes_heredofamiliares")
    private String antecedentesHeredofamiliares;

    @Getter
    @Setter
    @Column(name = "antecedentes_toxicos")
    private String antecedentesToxicos;

    @Getter
    @Setter
    @Column(name = "antecedentes_Transfuncionales")
    private String antecedentesTransfuncionales;


}

