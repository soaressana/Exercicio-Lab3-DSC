package com.dsclab2.lab2.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dsclab2.lab2.entities.Comentario;

@Repository
public interface ComentarioDAO extends JpaRepository<Comentario, Long> {
	List<Comentario> findByDisciplinaId(Long id);
}
