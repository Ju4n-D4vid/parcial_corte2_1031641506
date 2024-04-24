package com.corhuila.BackendSQL.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.corhuila.BackendSQL.Entity.Miembro;
import com.corhuila.BackendSQL.Repository.MiembroRepository;

@Service
public class MiembroService {
    @Autowired
    private MiembroRepository miembroRepository;

    public List<Miembro> getAllMiembros() {
        return miembroRepository.findAll();
    }

    public Miembro getMiembroById(int id) {
        return miembroRepository.findById(id).orElse(null);
    }

    public Miembro createMiembro(Miembro miembro) {
        return miembroRepository.save(miembro);
    }

    public Miembro updateMiembro(Miembro miembro) {
        return miembroRepository.save(miembro);
    }

    public void deleteMiembroById(int id) {
        miembroRepository.deleteById(id);
    }
}
