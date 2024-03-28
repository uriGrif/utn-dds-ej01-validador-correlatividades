package org.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class AlumnoTest {
    @Test
    void puedeCursarTest() {
        Materia algoritmos = new Materia("Algoritmos y Estructuras de Datos", new ArrayList<Materia>());
        Materia am1 = new Materia("Analisis Matematico 1", new ArrayList<Materia>());
        Materia aga = new Materia("Algebra y Geometria Analitica", new ArrayList<Materia>());
        Materia pdp = new Materia("Paradigmas de Programacion", new ArrayList<Materia>(){{
            add(algoritmos);
        }});
        Materia dds = new Materia("Disenio de Sistemas", new ArrayList<Materia>(){{
            add(pdp);
        }});
        Materia am2 = new Materia("Disenio de Sistemas", new ArrayList<Materia>(){{
            add(am1);
            add(aga);
        }});

        ArrayList<Materia> materiasAprobadas = new ArrayList<>();
        materiasAprobadas.add(algoritmos);
        materiasAprobadas.add(am1);
        materiasAprobadas.add(aga);
        Alumno alumno = new Alumno("Uri 1", "2080199", materiasAprobadas);

        assert(alumno.puedeCursar(am2));
        assert(!alumno.puedeCursar(dds));
    }
}