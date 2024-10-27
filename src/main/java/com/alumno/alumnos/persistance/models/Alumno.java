package com.alumno.alumnos.persistance.models;

import java.io.Serializable;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@Entity
@Table(name="alumnos")
public class Alumno implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idalumno", nullable = false)
    private Long alumnoId;

    @Column(name="nombre", length = 45, nullable = false)
    private String name;

    @Column(name="apellidos", length = 90, nullable = false)
    private String surname;

    
    @OneToOne(mappedBy = "info", fetch= FetchType.LAZY, cascade=CascadeType.ALL, optional = false)
    private Contacto contacto;

}
