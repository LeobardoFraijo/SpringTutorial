package com.spring.javaTutorials.dao;

import com.spring.javaTutorials.Models.User;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;


@Repository
@Transactional
public class UsuarioDaoImp implements UsuarioDao{
    @PersistenceContext
    EntityManager entityManager;

    @Override
    public List<User> getUsuarios() {
        String query = "FROM User";

        return entityManager.createQuery(query).getResultList();
    }
}
