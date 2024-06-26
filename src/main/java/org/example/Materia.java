package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Materia {
    private String nombre;
    private List<Materia> correlativas;

    public Materia(String nombre) {
        this.nombre = nombre;
        this.correlativas = new ArrayList<Materia>();
    }

    public void agregarCorrelativas(Materia ... correlativas) {
        Collections.addAll(this.correlativas, correlativas);
    }

    public List<Materia> getCorrelativas() {
        return correlativas;
    }
}
