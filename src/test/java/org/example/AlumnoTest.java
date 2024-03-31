package org.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class AlumnoTest {
    @Test
    void puedeCursarTest() {

        Materia algoritmos = new Materia("Algoritmos y Estructuras de Datos");
        Materia am1 = new Materia("Analisis Matematico 1");
        Materia aga = new Materia("Algebra y Geometria Analitica");
        Materia pdp = new Materia("Paradigmas de Programacion");
        pdp.agregarCorrelativas(algoritmos);
        Materia dds = new Materia("Disenio de Sistemas");
        dds.agregarCorrelativas(pdp);
        Materia am2 = new Materia("am2");
        am2.agregarCorrelativas(am1, aga);

        Alumno alumno = new Alumno("Uri", "1234");
        alumno.agregarMateriasAprobadas(algoritmos, am1, aga);

        assert(alumno.puedeCursar(am2));
        assert(!alumno.puedeCursar(dds));
    }
}