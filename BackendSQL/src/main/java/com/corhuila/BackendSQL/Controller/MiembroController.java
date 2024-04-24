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

import com.corhuila.BackendSQL.Entity.Miembro;
import com.corhuila.BackendSQL.Service.MiembroService;

@RestController
@RequestMapping("/miembro")
@CrossOrigin
public class MiembroController {
    @Autowired
    private MiembroService miembroService;

    @GetMapping
    public List<Miembro> getAllClientes() {
        return miembroService.getAllMiembros();
    }

    @GetMapping("/{id}")
    public Miembro getClienteById(@PathVariable int id) {
        return miembroService.getMiembroById(id);
    }

    @PostMapping
    public Miembro createMiembro(@RequestBody Miembro miembro) {
        return miembroService.createMiembro(miembro);
    }

    @PutMapping("/{id}")
    public Miembro updateMiembro(@PathVariable int id, @RequestBody Miembro miembro) {
        return miembroService.updateMiembro(miembro);
    }

    @DeleteMapping("/{id}")
    public void deleteMiembro(@PathVariable int id) {
        miembroService.deleteMiembroById(id);
    }
}
