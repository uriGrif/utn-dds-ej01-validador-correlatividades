package org.example;

import org.junit.jupiter.api.Test;

class InscripcionTest {
    @Test
    void incripcionAprobadaTest() {

        Materia algoritmos = new Materia("Algoritmos y Estructuras de Datos");
        Materia am1 = new Materia("Analisis Matematico 1");
        Materia aga = new Materia("Algebra y Geometria Analitica");
        Materia pdp = new Materia("Paradigmas de Programacion");
        pdp.agregarCorrelativas(algoritmos);
        Materia dds = new Materia("Disenio de Sistemas");
        dds.agregarCorrelativas(pdp);
        Materia am2 = new Materia("am2");
        am2.agregarCorrelativas(am1, aga);

        Alumno alumno1 = new Alumno("Uri 1", "1234");
        alumno1.agregarMateriasAprobadas(algoritmos, am1, aga);

        Alumno alumno2 = new Alumno("Uri 2", "1234");
        alumno2.agregarMateriasAprobadas(algoritmos, pdp);

        Inscripcion inscripcion1 = new Inscripcion(alumno1);
        inscripcion1.agregarMaterias(am2, dds);
        Inscripcion inscripcion2 = new Inscripcion(alumno2);
        inscripcion2.agregarMaterias(dds);

        assert(!inscripcion1.aprobada());
        assert(inscripcion2.aprobada());
    }
}