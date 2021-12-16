package com.spring.javaTutorials.controllers;

//import com.sun.deploy.security.BlacklistedCerts;
import com.spring.javaTutorials.Models.User;
import com.spring.javaTutorials.dao.UsuarioDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UsuarioController {

    @Autowired
    private UsuarioDao usuarioDao;

    @RequestMapping(value = "usuario/{id}")
    public User getUsuario(@PathVariable Long id){
        User user = new User();
        user.setId(id);
        user.setApellido("Fraijo");
        user.setNombre("Leo");
        user.setEmail("leofraijo14@gmail.com");
        user.setPassword("1234");
        user.setTelefono("2453637");
        return user;
    }

    @RequestMapping(value = "usuario")
    public List<User> getUsuarios(){
        return usuarioDao.getUsuarios();
    }

    @RequestMapping(value = "usuario1")
    public User editar(){
        User user = new User();
        user.setApellido("Fraijo");
        user.setNombre("Leo");
        user.setEmail("leofraijo14@gmail.com");
        user.setPassword("1234");
        user.setTelefono("2453637");
        return user;
    }

    @RequestMapping(value = "usuario2")
    public User buscar(){
        User user = new User();
        user.setApellido("Fraijo");
        user.setNombre("Leo");
        user.setEmail("leofraijo14@gmail.com");
        user.setPassword("1234");
        user.setTelefono("2453637");
        return user;
    }

    @RequestMapping(value = "usuario3")
    public User eliminar(){
        User user = new User();
        user.setApellido("Fraijo");
        user.setNombre("Leo");
        user.setEmail("leofraijo14@gmail.com");
        user.setPassword("1234");
        user.setTelefono("2453637");
        return user;
    }
}
