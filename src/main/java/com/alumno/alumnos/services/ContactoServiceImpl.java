package com.alumno.alumnos.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.alumno.alumnos.dto.ContactoDTO;
import com.alumno.alumnos.persistance.models.Alumno;
import com.alumno.alumnos.persistance.models.Contacto;
import com.alumno.alumnos.persistance.repository.ContactoRepositoryI;
@Service
public class ContactoServiceImpl implements ContactoServiceI{
    
    @Autowired
    ContactoRepositoryI contactoRepo;

    @Autowired
    AlumnoServiceI alumnoMngmnt;

    @Override
    public List<ContactoDTO> getAllContacto() {
        // Usar el método findAll para obtener todos los contactos
        List<Contacto> contactoList = contactoRepo.findAll();
        List<ContactoDTO> contactoDTOList = new ArrayList<>();

        // Convertir la lista de Contacto a ContactoDTO
        for (Contacto info : contactoList) {
            contactoDTOList.add(new ContactoDTO(info));
        }

        return contactoDTOList;
    }

    @Override
    public void insertContacto(ContactoDTO contacto) {
         //Crear Contacto a partir del DTO
         Contacto newContacto = new Contacto();
         newContacto.setContactoId(contacto.getContactoId());
         newContacto.setDireccion(contacto.getDireccion());
         newContacto.setTelf(contacto.getTelf());

        Alumno al = alumnoMngmnt.getAlumnoById(contacto.getAlumnos_idalumno());

        newContacto.setInfo(al);
        //Guardar Contacto
        contactoRepo.save(newContacto);
    }


    

    @Override
    public void saveContacto(ContactoDTO contacto) {
        contactoRepo.save(contacto);
    }


    @Override
    public void updateContacto(Long id, ContactoDTO contacto) {
        contacto.setContactoId(id);
        contactoRepo.save(contacto);
    }

    @Override
    public void deleteContacto(Long id) {
        contactoRepo.deleteById(id);    
    }

    @Override
    public List<ContactoDTO> getContactosByTelf(String telf) {
        List<Contacto> contactoList = contactoRepo.findByTelf(telf); // Llama al repositorio
        List<ContactoDTO> contactoDTOList = new ArrayList<>();

        // Mapea Contacto a ContactoDTO
        for (Contacto info : contactoList) {
            contactoDTOList.add(new ContactoDTO(info));
        }

        return contactoDTOList;
    }

}
