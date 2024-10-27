package com.alumno.alumnos.services;

import java.util.List;

import com.alumno.alumnos.dto.AlumnoDTO;
import com.alumno.alumnos.persistance.models.Alumno;

public interface AlumnoServiceI {
    
    List<AlumnoDTO> getAlumnosByName(String name);
    void insertAlumno(AlumnoDTO alumno);
    void saveAlumno(AlumnoDTO alumno);
    void updateAlumno(Long id, AlumnoDTO alumno);
    void deleteAlumno(Long id);
    Alumno getAlumnoById(Long id);
}
