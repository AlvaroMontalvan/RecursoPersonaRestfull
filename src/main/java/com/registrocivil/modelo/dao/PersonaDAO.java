package com.registrocivil.modelo.dao;

import java.util.ArrayList;
import java.util.List;

import com.registrocivil.modelo.entity.Persona;

public class PersonaDAO {

    private static List<Persona> personas = new ArrayList<>();

    public void create(Persona p) {
        personas.add(p);
    }

    public void update(Persona p) {
        for (int i = 0; i < personas.size(); i++) {
            if (personas.get(i).getId().equals(p.getId())) {
                personas.set(i, p);
                return;
            }
        }
    }

    public void delete(int id) {
        personas.removeIf(p -> p.getId() == id);
    }

    public Persona getByCedula(String c) {
        for (Persona p : personas) {
            if (p.getCedula().equals(c)) {
                return p;
            }
        }
        return null;
    }

    public List<Persona> getAll() {
        if (personas.isEmpty()) {
            personas.add(new Persona(1, "Juan Perez", "1000000001", 30));
            personas.add(new Persona(2, "Maria Gomez", "1000000002", 25));
        }
        return personas;
    }
}
