package com.corhuila.BackendSQL.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.corhuila.BackendSQL.Entity.Tarea;

@Repository
public interface TareaRepository extends JpaRepository<Tarea, Integer> {}
