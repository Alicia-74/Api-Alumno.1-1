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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.alumno.alumnos.dto.ContactoDTO;
import com.alumno.alumnos.services.ContactoServiceI;

@RestController
@RequestMapping("/api/v1/contacto")
@CrossOrigin
public class ContactoController {
    @Autowired
    ContactoServiceI contactoMngmnt;

    @GetMapping("telf/{telefono}")
    public List<ContactoDTO> getMethodTelf(@RequestParam String telefono) {
        return contactoMngmnt.getContactosByTelf(telefono);
    }
    
   @PostMapping("/insert")
    public void insertContacto(@RequestBody ContactoDTO contacto) {
        contactoMngmnt.insertContacto(contacto);
    }



    @PutMapping("edit/{id}")
    public String editContacto(@PathVariable Long id, @RequestBody ContactoDTO contacto) {
        contactoMngmnt.updateContacto(id, contacto);
        
        return "Contacto modified";
    }

    @DeleteMapping("delete/{id}")
    public String deleteContacto(@PathVariable Long id) {
        contactoMngmnt.deleteContacto(id);
        
        return "Contacto deleted";
    }
}
