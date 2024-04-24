package com.corhuila.BackendSQL.Controller;

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

import com.corhuila.BackendSQL.Entity.Tarea;
import com.corhuila.BackendSQL.Service.TareaService;

@RestController
@RequestMapping("/tarea")
@CrossOrigin
public class TareaController {
    @Autowired
    private TareaService tareaService;

    @GetMapping
    public List<Tarea> getAllTareas() {
        return tareaService.getAllTareas();
    }

    @GetMapping("/{id}")
    public Tarea getTareaById(@PathVariable int id) {
        return tareaService.getTareaById(id);
    }

    @PostMapping
    public Tarea createTarea(@RequestBody Tarea tarea) {
        return tareaService.createTarea(tarea);
    }

    @PutMapping("/{id}")
    public Tarea updateTarea(@PathVariable int id, @RequestBody Tarea tarea) {
        return tareaService.updateTarea(tarea);
    }

    @DeleteMapping("/{id}")
    public void deleteTareaById(@PathVariable int id) {
        tareaService.deleteTareaById(id);
    }
}
