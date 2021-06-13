package com.dsclab2.lab2.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dsclab2.lab2.entities.Usuario;

@Repository
public interface UsuarioDAO extends JpaRepository<Usuario, String>{
	Optional<Usuario> findByEmail(String email);

}
