package com.alumno.alumnos.persistance.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alumno.alumnos.dto.ContactoDTO;
import com.alumno.alumnos.persistance.models.Contacto;

public interface ContactoRepositoryI extends JpaRepository<Contacto, Long>{
    List<Contacto> findByDireccion(String direccion);
    List<Contacto> findByTelf(String telf);
    List<Contacto> findByDireccionAndTelf(String direccion, String telf);
    void save(ContactoDTO contacto);
    void deleteById(Long id);
}
