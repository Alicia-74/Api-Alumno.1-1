package com.alumno.alumnos.dto;


import com.alumno.alumnos.persistance.models.Contacto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ContactoDTO {

    private Long contactoId;
    private String direccion;
    private String telf;
    private Long alumnos_idalumno;

    public ContactoDTO(Contacto contacto) {
        this.contactoId = contacto.getContactoId();
        this.direccion = contacto.getDireccion();
        this.telf = contacto.getTelf();
        this.alumnos_idalumno = contacto.getInfo().getAlumnoId();
        // this.dnidto = new DNIDTO(al.getDni());
        // this.roldto = new RolDTO(al.getalserRol());
        // this.salbjectsRegistered = salbjectsDTO(al.getSubjectsRegistered());
    }
    
}
