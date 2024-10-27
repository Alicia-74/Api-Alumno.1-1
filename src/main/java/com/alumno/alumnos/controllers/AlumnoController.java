package com.alumno.alumnos.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alumno.alumnos.dto.AlumnoDTO;
import com.alumno.alumnos.services.AlumnoServiceI;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/api/v1/alumno")
@CrossOrigin
public class AlumnoController {
    
    @Autowired
    AlumnoServiceI alumnoMngmnt;


    @GetMapping("name/{nombre}")
    public List<AlumnoDTO> getMethodName(@PathVariable String nombre) {
        return alumnoMngmnt.getAlumnosByName(nombre);
    }
    
   @PostMapping("/insert")
    public void insertAlumno(@RequestBody AlumnoDTO alumno) {
        alumnoMngmnt.insertAlumno(alumno);
    }


    @PutMapping("edit/{id}")
    public String editAlumno(@PathVariable Long id, @RequestBody AlumnoDTO alumno) {
        alumnoMngmnt.updateAlumno(id, alumno);
        
        return "Alumno modified";
    }

    @DeleteMapping("delete/{id}")
    public String deleteAlumno(@PathVariable Long id) {
        alumnoMngmnt.deleteAlumno(id);
        
        return "Alumno deleted";
    }

}
