package com.alumno.alumnos.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alumno.alumnos.dto.AlumnoDTO;
import com.alumno.alumnos.persistance.models.Alumno;
import com.alumno.alumnos.persistance.repository.AlumnoRepositoryI;



@Service
public class AlumnoServiceImpl implements AlumnoServiceI{
    
    @Autowired
    AlumnoRepositoryI alumnoRepo;
    
    @Override
    public List<AlumnoDTO> getAlumnosByName(String name) {
        List<Alumno> alumnosList = alumnoRepo.findByName(name);
        List<AlumnoDTO> alumnosDTOList = new ArrayList<AlumnoDTO>(); 

        for (Alumno alumno : alumnosList) {
            alumnosDTOList.add(new AlumnoDTO(alumno));
        }

        return alumnosDTOList;
    }

    public Alumno getAlumnoById(Long id) {
        return alumnoRepo.findById(id).get();
    }

    @Override
    public void insertAlumno(AlumnoDTO alumno) {
         //Crear alumno a partir del DTO
         Alumno newAlumno = new Alumno();
         newAlumno.setAlumnoId(alumno.getAlumnoId());
         newAlumno.setName(alumno.getName());
         newAlumno.setSurname(alumno.getSurname());
         //Guardar alumno
         alumnoRepo.save(newAlumno);
    }


    

    @Override
    public void saveAlumno(AlumnoDTO alumno) {
        alumnoRepo.save(alumno);
    }


    @Override
    public void updateAlumno(Long id, AlumnoDTO alumno) {
        alumno.setAlumnoId(id);
        alumnoRepo.save(alumno);
    }

    @Override
    public void deleteAlumno(Long id) {
        alumnoRepo.deleteById(id);    
    }

}
