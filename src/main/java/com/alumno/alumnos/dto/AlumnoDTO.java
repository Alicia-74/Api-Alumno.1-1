package com.alumno.alumnos.dto;

import com.alumno.alumnos.persistance.models.Alumno;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AlumnoDTO {

    private Long alumnoId;
    private String name;
    private String surname;
    private ContactoDTO contactodto;

    public AlumnoDTO(Alumno al) {
        this.alumnoId = al.getAlumnoId();
        this.name = al.getName();
        this.surname = al.getSurname();
        this.contactodto = new ContactoDTO(al.getContacto());
        
        // this.salbjectsRegistered = salbjectsDTO(al.getSubjectsRegistered());
    }
}
