package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Inscripcion {
    private Alumno alumno;
    private List<Materia> materias;

    public Inscripcion(Alumno alumno, Materia ... materias) {
        this.alumno = alumno;
        this.materias = new ArrayList<Materia>();
    }

    public void agregarMaterias(Materia ... materias) {
        Collections.addAll(this.materias, materias);
    }

    public boolean aprobada() {
        return this.materias.stream().allMatch(m -> this.alumno.puedeCursar(m));
    }
}
