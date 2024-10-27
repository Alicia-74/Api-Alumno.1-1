package com.alumno.alumnos.persistance.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.alumno.alumnos.dto.AlumnoDTO;
import com.alumno.alumnos.persistance.models.Alumno;

@Repository
public interface AlumnoRepositoryI extends JpaRepository<Alumno, Long>{
    //https://docs.spring.io/spring-data/jpa/reference/jpa/query-methods.html
    List<Alumno> findByName(String name);
    List<Alumno> findBySurname(String surname);
    Alumno findByNameAndSurname(String name, String surname);
    void save(AlumnoDTO alumno);
}
