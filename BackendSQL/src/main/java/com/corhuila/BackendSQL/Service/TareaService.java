package com.corhuila.BackendSQL.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.corhuila.BackendSQL.Entity.Tarea;
import com.corhuila.BackendSQL.Repository.TareaRepository;

@Service
public class TareaService {
    @Autowired
    private TareaRepository tareaRepository;

    public List<Tarea> getAllTareas() {
        return tareaRepository.findAll();
    }

    public Tarea getTareaById(int id) {
        return tareaRepository.findById(id).orElse(null);
    }

    public Tarea createTarea(Tarea tarea) {
        return tareaRepository.save(tarea);
    }

    public Tarea updateTarea(Tarea tarea) {
        return tareaRepository.save(tarea);
    }

    public void deleteTareaById(int id) {
        tareaRepository.deleteById(id);
    }
}
