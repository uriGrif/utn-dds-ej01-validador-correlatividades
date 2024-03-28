package org.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class InscripcionTest {
    @Test
    void incripcionAprobadaTest() {

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

        ArrayList<Materia> materiasAprobadas1 = new ArrayList<>();
        materiasAprobadas1.add(algoritmos);
        materiasAprobadas1.add(am1);
        materiasAprobadas1.add(aga);
        Alumno alumno1 = new Alumno("Uri 1", "2080199", materiasAprobadas1);

        ArrayList<Materia> materiasAprobadas2 = new ArrayList<>();
        materiasAprobadas2.add(pdp);
        Alumno alumno2 = new Alumno("Uri 2", "2080", materiasAprobadas2);

        Inscripcion inscripcion1 = new Inscripcion(alumno1, new ArrayList<Materia>(){{
            add(am2);
            add(dds);
        }});
        Inscripcion inscripcion2 = new Inscripcion(alumno2, new ArrayList<Materia>(){{
            add(dds);
        }});

        assert(!inscripcion1.aprobada());
        assert(inscripcion2.aprobada());
    }
}