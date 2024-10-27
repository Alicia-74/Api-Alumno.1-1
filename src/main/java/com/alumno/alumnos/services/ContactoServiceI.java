package com.alumno.alumnos.services;

import java.util.List;


import com.alumno.alumnos.dto.ContactoDTO;

public interface ContactoServiceI {
    List<ContactoDTO> getAllContacto();
    void insertContacto(ContactoDTO contacto);
    void saveContacto(ContactoDTO contacto);
    void updateContacto(Long id, ContactoDTO contacto);
    void deleteContacto(Long id);
    List<ContactoDTO> getContactosByTelf(String telf);
} 
